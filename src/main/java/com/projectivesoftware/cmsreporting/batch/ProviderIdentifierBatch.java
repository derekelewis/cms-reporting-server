/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.batch;

import com.projectivesoftware.cmsreporting.domain.ProviderIdentifier;
import com.projectivesoftware.cmsreporting.service.ProviderIdentifierRepository;
import com.projectivesoftware.cmsreporting.utility.ListItemWriter;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

@Configuration
public class ProviderIdentifierBatch {

    @Bean
    public RepositoryItemWriter<ProviderIdentifier> providerIdentifierWriter(ProviderIdentifierRepository providerIdentifierRepository) {
        Assert.notNull(providerIdentifierRepository, "providerIdentifierRepository must not be null!");
        RepositoryItemWriter<ProviderIdentifier> writer = new RepositoryItemWriter<>();
        writer.setRepository(providerIdentifierRepository);
        writer.setMethodName("save");
        return writer;
    }

    @Bean
    public ListItemWriter providerIdentifierListWriter(RepositoryItemWriter<ProviderIdentifier> providerIdentifierWriter) {
        Assert.notNull(providerIdentifierWriter, "providerIdentifierWriter must not be null!");
        return new ListItemWriter<>(providerIdentifierWriter);
    }

    @Bean
    public ProviderIdentifierItemProcessor providerIdentifierItemProcessor() {
        return new ProviderIdentifierItemProcessor();
    }
}
