/*
 * Copyright (c) Derek Lewis <derek.e.lewis@outlook.com>, 2021
 */

package com.projectivesoftware.cmsreporting.web;

import com.projectivesoftware.cmsreporting.domain.HospitalOperator;
import com.projectivesoftware.cmsreporting.service.HospitalOperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hospitalOperator")
public class HospitalOperatorController {

    private final HospitalOperatorRepository hospitalOperatorRepository;

    @Autowired
    public HospitalOperatorController(HospitalOperatorRepository hospitalOperatorRepository) {
        Assert.notNull(hospitalOperatorRepository, "hospitalOperatorRepository must not be null!");
        this.hospitalOperatorRepository = hospitalOperatorRepository;
    }

    @RequestMapping(value = "bulkUpload", method = RequestMethod.POST)
    public List<HospitalOperator> bulkUpload(@RequestBody List<HospitalOperator> hospitalOperators) {
        List<HospitalOperator> hospitalOperatorsResponse = new ArrayList<>();
        for (HospitalOperator hospitalOperator : hospitalOperators) {
            HospitalOperator hospitalOperatorResponse = hospitalOperatorRepository.save(hospitalOperator);
            hospitalOperatorsResponse.add(hospitalOperatorResponse);
        }
        return hospitalOperatorsResponse;
    }
}
