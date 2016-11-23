/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.iimassociates.cmsreporting.server.batch;

import com.iimassociates.cmsreporting.server.domain.Attestation;
import com.iimassociates.cmsreporting.server.domain.Provider;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataImport {

    @Bean
    public Job dataImportJob(JobBuilderFactory jobBuilderFactory,
                             Step importAttestationFile,
                             Step importProviderFile) {
        return jobBuilderFactory.get("dataImportJob")
                .incrementer(new RunIdIncrementer())
                .start(importAttestationFile)
                .next(importProviderFile)
                .build();
    }

    @Bean
    public Step importAttestationFile(StepBuilderFactory stepBuilderFactory,
                                      ItemReader<Attestation> attestationFileReader,
                                      ItemWriter<Attestation> attestationWriter) {
        return stepBuilderFactory.get("importAttestationFile")
                .<Attestation, Attestation>chunk(1000)
                .reader(attestationFileReader)
                .writer(attestationWriter)
                .build();
    }

    @Bean
    public Step importProviderFile(StepBuilderFactory stepBuilderFactory,
                                   ItemReader<Provider> providerFileReader,
                                   ItemWriter<Provider> providerWriter) {
        return stepBuilderFactory.get("importProviderFile")
                .<Provider, Provider>chunk(1000)
                .reader(providerFileReader)
                .writer(providerWriter)
                .build();
    }
}
