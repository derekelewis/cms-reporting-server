/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
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
