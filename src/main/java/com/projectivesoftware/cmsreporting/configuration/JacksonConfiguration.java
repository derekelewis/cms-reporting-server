/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectivesoftware.cmsreporting.utility.JobExecutionJacksonMixIn;
import org.springframework.batch.core.JobExecution;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.util.Assert;

@Configuration
public class JacksonConfiguration {

    @Bean
    public Jackson2ObjectMapperBuilder jacksonBuilder(ObjectMapper objectMapperBuilder) {
        Assert.notNull(objectMapperBuilder, "objectMapperBuilder must not be null!");
        Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder();
        jackson2ObjectMapperBuilder.configure(objectMapperBuilder);
        return jackson2ObjectMapperBuilder;
    }

    @Bean
    @Primary
    public ObjectMapper objectMapperBuilder() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.addMixIn(JobExecution.class, JobExecutionJacksonMixIn.class);
        return objectMapper;
    }
}
