/*
 * Copyright (c) Derek Lewis <derek.e.lewis@outlook.com>, 2021
 */

package com.projectivesoftware.cmsreporting.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ProviderIdentifier implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "provider_identifier_id_seq")
    @SequenceGenerator(name = "provider_identifier_id_seq", sequenceName = "provider_identifier_id_seq", allocationSize = 1)
    private Long providerIdentifierId;

    @ManyToOne
    @JoinColumn(name = "npi", nullable = false)
    private Provider provider;

    private String providerIdentifierTypeCode;

    private String providerIdentifierValue;

    public ProviderIdentifier() {

    }

    public Long getProviderIdentifierId() {
        return providerIdentifierId;
    }

    public void setProviderIdentifierId(Long providerIdentifierId) {
        this.providerIdentifierId = providerIdentifierId;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getProviderIdentifierTypeCode() {
        return providerIdentifierTypeCode;
    }

    public void setProviderIdentifierTypeCode(String providerIdentifierTypeCode) {
        this.providerIdentifierTypeCode = providerIdentifierTypeCode;
    }

    public String getProviderIdentifierValue() {
        return providerIdentifierValue;
    }

    public void setProviderIdentifierValue(String providerIdentifierValue) {
        this.providerIdentifierValue = providerIdentifierValue;
    }
}
