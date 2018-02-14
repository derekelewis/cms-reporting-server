/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.batch;

import com.projectivesoftware.cmsreporting.domain.Provider;
import com.projectivesoftware.cmsreporting.domain.ProviderIdentifier;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
public class ProviderIdentifierItemProcessor implements ItemProcessor<Provider, List<ProviderIdentifier>> {

    @Override
    public List<ProviderIdentifier> process(Provider provider) {
        Map<String, String> providerIdentifiers = provider.getProviderIdentifiers();
        List<ProviderIdentifier> providerIdentifierList = new ArrayList<>();
        for (String identifierTypeCode : provider.getProviderIdentifiers().keySet()) {
            ProviderIdentifier providerIdentifier = new ProviderIdentifier();
            providerIdentifier.setProvider(provider);
            providerIdentifier.setProviderIdentifierTypeCode(identifierTypeCode);
            providerIdentifier.setProviderIdentifierValue(providerIdentifiers.get(identifierTypeCode));
            providerIdentifierList.add(providerIdentifier);
        }

        return providerIdentifierList;
    }
}
