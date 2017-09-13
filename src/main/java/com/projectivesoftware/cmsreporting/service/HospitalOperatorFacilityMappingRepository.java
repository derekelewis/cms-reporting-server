/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.service;

import com.projectivesoftware.cmsreporting.domain.HospitalOperatorFacilityMapping;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalOperatorFacilityMappingRepository extends PagingAndSortingRepository<HospitalOperatorFacilityMapping, Long> {

}