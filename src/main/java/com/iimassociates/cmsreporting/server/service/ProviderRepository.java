/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.iimassociates.cmsreporting.server.service;

import com.iimassociates.cmsreporting.server.domain.Provider;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends PagingAndSortingRepository<Provider, Long> {

}
