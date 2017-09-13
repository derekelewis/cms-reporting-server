/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.batch;

import com.projectivesoftware.cmsreporting.domain.Attestation;
import com.projectivesoftware.cmsreporting.domain.Provider;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;

@Configuration
public class DataImport {

    @Bean
    public Job dataImportJob(JobBuilderFactory jobBuilderFactory,
                             Step importProviderFile,
                             Step importAttestationFile) {
        return jobBuilderFactory.get("dataImportJob")
                .incrementer(new RunIdIncrementer())
                .start(importProviderFile)
                .next(importAttestationFile)
                .build();
    }

    @Bean
    public Step importProviderFile(StepBuilderFactory stepBuilderFactory,
                                   ItemReader<Provider> providerFileReader,
                                   ItemWriter<Provider> providerWriter,
                                   TaskExecutor batchTaskExecutor) {
        return stepBuilderFactory.get("importProviderFile")
                .<Provider, Provider>chunk(100)
                .reader(providerFileReader)
                .writer(providerWriter)
                .taskExecutor(batchTaskExecutor)
                .build();
    }

    @Bean
    public Step importAttestationFile(StepBuilderFactory stepBuilderFactory,
                                      ItemReader<Attestation> attestationFileReader,
                                      ItemWriter<Attestation> attestationWriter,
                                      TaskExecutor batchTaskExecutor) {
        return stepBuilderFactory.get("importAttestationFile")
                .<Attestation, Attestation>chunk(100)
                .reader(attestationFileReader)
                .writer(attestationWriter)
                .taskExecutor(batchTaskExecutor)
                .build();
    }
}
