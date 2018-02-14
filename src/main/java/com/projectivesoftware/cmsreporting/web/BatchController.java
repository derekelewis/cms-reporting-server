/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.web;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
public class BatchController {

    private final JobLauncher jobLauncher;

    private final Job processProviderIdentifiersJob;

    @Autowired
    public BatchController(JobLauncher asyncJobLauncher,
                           Job processProviderIdentifiersJob) {
        Assert.notNull(asyncJobLauncher, "asyncJobLauncher must not be null!");
        Assert.notNull(processProviderIdentifiersJob, "processProviderIdentifiersJob must not be null!");
        this.jobLauncher = asyncJobLauncher;
        this.processProviderIdentifiersJob = processProviderIdentifiersJob;
    }

    @RequestMapping("/processProviderIdentifiersJob/start")
    public JobExecution startProcessProviderIdentifiersJob() throws Exception {
        return jobLauncher.run(processProviderIdentifiersJob, new JobParameters());
    }
}
