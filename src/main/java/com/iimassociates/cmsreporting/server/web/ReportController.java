/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.iimassociates.cmsreporting.server.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;

@RestController
@RequestMapping("/report")
public class ReportController {

    private final DataSource dataSource;

    @Autowired
    public ReportController(DataSource dataSource) {
        Assert.notNull(dataSource, "dataSource must not be null!");
        this.dataSource = dataSource;
    }

    @RequestMapping("/{reportName}")
    public ModelAndView showReport(final ModelMap modelMap, @PathVariable("reportName") String reportName) {
        modelMap.put("datasource", dataSource);
        modelMap.put("format", "pdf");
        return new ModelAndView(reportName, modelMap);
    }
}
