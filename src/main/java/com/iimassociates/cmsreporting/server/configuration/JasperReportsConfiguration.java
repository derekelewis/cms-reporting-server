/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.iimassociates.cmsreporting.server.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;

@Configuration
public class JasperReportsConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {
        defaultServletHandlerConfigurer.enable();
    }

    @Bean
    public JasperReportsViewResolver getJasperReportsViewResolver() {
        JasperReportsViewResolver jasperReportsViewResolver = new JasperReportsViewResolver();
        jasperReportsViewResolver.setPrefix("classpath:/static/");
        jasperReportsViewResolver.setSuffix(".jrxml");
        jasperReportsViewResolver.setReportDataKey("datasource");
        jasperReportsViewResolver.setViewNames("rpt_*");
        jasperReportsViewResolver.setViewClass(JasperReportsMultiFormatView.class);
        jasperReportsViewResolver.setOrder(0);
        return jasperReportsViewResolver;
    }
}
