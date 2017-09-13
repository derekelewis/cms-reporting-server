/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.web;

import com.projectivesoftware.cmsreporting.domain.HospitalOperator;
import com.projectivesoftware.cmsreporting.domain.HospitalOperatorFacilityMapping;
import com.projectivesoftware.cmsreporting.domain.Provider;
import com.projectivesoftware.cmsreporting.service.HospitalOperatorFacilityMappingRepository;
import com.projectivesoftware.cmsreporting.service.HospitalOperatorRepository;
import com.projectivesoftware.cmsreporting.service.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospitalOperatorFacilityMapping")
public class HospitalOperatorFacilityMappingController {

    private final HospitalOperatorFacilityMappingRepository hospitalOperatorFacilityMappingRepository;

    private final HospitalOperatorRepository hospitalOperatorRepository;

    private final ProviderRepository providerRepository;

    @Autowired
    public HospitalOperatorFacilityMappingController(HospitalOperatorFacilityMappingRepository hospitalOperatorFacilityMappingRepository,
                                                     HospitalOperatorRepository hospitalOperatorRepository,
                                                     ProviderRepository providerRepository) {
        Assert.notNull(hospitalOperatorFacilityMappingRepository, "hospitalOperatorFacilityMappingRepository must not be null!");
        Assert.notNull(hospitalOperatorRepository, "hospitalOperatorRepository must not be null!");
        Assert.notNull(providerRepository, "providerRepository must not be null!");
        this.hospitalOperatorFacilityMappingRepository = hospitalOperatorFacilityMappingRepository;
        this.hospitalOperatorRepository = hospitalOperatorRepository;
        this.providerRepository = providerRepository;
    }

    @RequestMapping(value = "bulkUpload", method = RequestMethod.POST)
    public List<HospitalOperatorFacilityMapping> bulkUpload(@RequestBody List<HospitalOperatorFacilityMapping> hospitalOperatorFacilityMappings) {
        List<HospitalOperatorFacilityMapping> hospitalOperatorFacilityMappingsResponse = new ArrayList<>();
        for (HospitalOperatorFacilityMapping hospitalOperatorFacilityMapping : hospitalOperatorFacilityMappings) {
            HospitalOperatorFacilityMapping hospitalOperatorFacilityMappingResponse = hospitalOperatorFacilityMappingRepository.save(hospitalOperatorFacilityMapping);
            Optional<Provider> providerResponseOptional = providerRepository.findById(hospitalOperatorFacilityMapping.getProvider().getNpi());
            hospitalOperatorFacilityMappingResponse.setProvider(providerResponseOptional.orElse(null));
            Optional<HospitalOperator> hospitalOperatorResponseOptional = hospitalOperatorRepository.findById(hospitalOperatorFacilityMapping.getHospitalOperator().getHospitalOperatorId());
            hospitalOperatorFacilityMappingResponse.setHospitalOperator(hospitalOperatorResponseOptional.orElse(null));
            hospitalOperatorFacilityMappingsResponse.add(hospitalOperatorFacilityMappingResponse);
        }
        return hospitalOperatorFacilityMappingsResponse;
    }
}
