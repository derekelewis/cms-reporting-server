/*
 * Copyright (c) Derek Lewis <derek.e.lewis@outlook.com>, 2021
 */

package com.projectivesoftware.cmsreporting.utility;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.batch.item.ExecutionContext;

import javax.batch.runtime.JobInstance;
import javax.batch.runtime.StepExecution;
import java.util.Collection;

public abstract class JobExecutionJacksonMixIn {

    @JsonIgnore
    abstract JobInstance getJobInstance();

    @JsonIgnore
    abstract ExecutionContext getExecutionContext();

    @JsonIgnore
    abstract Collection<StepExecution> getStepExecutions();
}
