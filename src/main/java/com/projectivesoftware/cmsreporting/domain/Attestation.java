/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Attestation implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attestation_record_id_seq")
    @SequenceGenerator(name = "attestation_record_id_seq", sequenceName = "attestation_record_id_seq", allocationSize = 1)
    private Long recordId;

    private Long attestationId;

    private String certificationNumber;

    private String vendorName;

    private String chpId;

    private String productName;

    private String productVersion;

    private String productClassification;

    private String productSetting;

    private String productCertificationYear;

    private String attestationMonth;

    private String attestationYear;

    private String businessStateTerritory;

    private String providerType;

    private String specialty;

    private String programYear;

    private String paymentYear;

    private String providerStageNumber;

    private String programType;

    @ManyToOne
    @JoinColumn(name = "npi", nullable = false)
    private Provider provider;

    private Long ccn;

    public Attestation() {

    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getAttestationId() {
        return attestationId;
    }

    public void setAttestationId(Long attestationId) {
        this.attestationId = attestationId;
    }

    public String getCertificationNumber() {
        return certificationNumber;
    }

    public void setCertificationNumber(String certificationNumber) {
        this.certificationNumber = certificationNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getChpId() {
        return chpId;
    }

    public void setChpId(String chpId) {
        this.chpId = chpId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public String getProductClassification() {
        return productClassification;
    }

    public void setProductClassification(String productClassification) {
        this.productClassification = productClassification;
    }

    public String getProductSetting() {
        return productSetting;
    }

    public void setProductSetting(String productSetting) {
        this.productSetting = productSetting;
    }

    public String getProductCertificationYear() {
        return productCertificationYear;
    }

    public void setProductCertificationYear(String productCertificationYear) {
        this.productCertificationYear = productCertificationYear;
    }

    public String getAttestationMonth() {
        return attestationMonth;
    }

    public void setAttestationMonth(String attestationMonth) {
        this.attestationMonth = attestationMonth;
    }

    public String getAttestationYear() {
        return attestationYear;
    }

    public void setAttestationYear(String attestationYear) {
        this.attestationYear = attestationYear;
    }

    public String getBusinessStateTerritory() {
        return businessStateTerritory;
    }

    public void setBusinessStateTerritory(String businessStateTerritory) {
        this.businessStateTerritory = businessStateTerritory;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getProgramYear() {
        return programYear;
    }

    public void setProgramYear(String programYear) {
        this.programYear = programYear;
    }

    public String getPaymentYear() {
        return paymentYear;
    }

    public void setPaymentYear(String paymentYear) {
        this.paymentYear = paymentYear;
    }

    public String getProviderStageNumber() {
        return providerStageNumber;
    }

    public void setProviderStageNumber(String providerStageNumber) {
        this.providerStageNumber = providerStageNumber;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Long getCcn() {
        return ccn;
    }

    public void setCcn(Long ccn) {
        this.ccn = ccn;
    }
}
