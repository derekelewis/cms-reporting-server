/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.batch;

import com.projectivesoftware.cmsreporting.domain.Provider;
import com.projectivesoftware.cmsreporting.service.ProviderRepository;
import org.castor.core.util.Assert;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProviderBatch {

    @Bean
    public RepositoryItemReader<Provider> providerReader(ProviderRepository providerRepository) {
        Assert.notNull(providerRepository, "providerRepository must not be null!");
        RepositoryItemReader<Provider> reader = new RepositoryItemReader<>();
        reader.setRepository(providerRepository);
        reader.setMethodName("findAll");
        reader.setPageSize(1000);

        Map<String, Sort.Direction> sortMap = new HashMap<>();
        sortMap.put("npi", Sort.Direction.ASC);

        reader.setSort(sortMap);

        try {
            reader.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return reader;
    }
}
