/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.batch;

import com.projectivesoftware.cmsreporting.domain.Provider;
import com.projectivesoftware.cmsreporting.domain.ProviderIdentifier;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProcessProviderIdentifiers {

    @Bean
    public Job processProviderIdentifiersJob(JobBuilderFactory jobBuilderFactory,
                                             Step processProviderIdentifiersStep) {
        return jobBuilderFactory.get("processorProviderIdentifiersJob")
                .incrementer(new RunIdIncrementer())
                .start(processProviderIdentifiersStep)
                .build();
    }

    @Bean
    public Step processProviderIdentifiersStep(StepBuilderFactory stepBuilderFactory,
                                               ItemReader<Provider> providerReader,
                                               ItemProcessor<Provider, List<ProviderIdentifier>> providerIdentifierProcessor,
                                               ItemWriter<List<ProviderIdentifier>> providerIdentifierListWriter) {
        return stepBuilderFactory.get("processProviderIdentifiersStep")
                .<Provider, List<ProviderIdentifier>>chunk(1000)
                .reader(providerReader)
                .processor(providerIdentifierProcessor)
                .writer(providerIdentifierListWriter)
                .build();
    }
}
