/*
 * Copyright (c) Derek Lewis <derek.e.lewis@outlook.com>, 2021
 */

package com.projectivesoftware.cmsreporting.batch;

import com.projectivesoftware.cmsreporting.domain.Provider;
import org.castor.core.util.Assert;
import org.hibernate.SessionFactory;
import org.springframework.batch.item.database.HibernateCursorItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;

@Configuration
public class ProviderBatch {

    @Bean
    public HibernateCursorItemReader<Provider> providerReader(EntityManagerFactory entityManagerFactory) {
        Assert.notNull(entityManagerFactory, "entityManagerFactory must not be null!");
        HibernateCursorItemReader<Provider> reader = new HibernateCursorItemReader<>();
        reader.setSessionFactory(entityManagerFactory.unwrap(SessionFactory.class));
        reader.setQueryString("from Provider");
        reader.setFetchSize(1000);

        try {
            reader.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return reader;
    }
}
