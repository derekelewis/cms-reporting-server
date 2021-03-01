/*
 * Copyright (c) Derek Lewis <derek.e.lewis@outlook.com>, 2021
 */

package com.projectivesoftware.cmsreporting.service;

import com.projectivesoftware.cmsreporting.domain.Attestation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttestationRepository extends PagingAndSortingRepository<Attestation, Long> {

}
