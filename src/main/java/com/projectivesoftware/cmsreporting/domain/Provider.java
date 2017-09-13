/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Provider implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    private Long npi;

    private Integer entityTypeCode;

    private Long replacementNpi;

    private String employerIdentificationNumber;

    private String providerOrganizationName;

    private String providerLastName;

    private String providerFirstName;

    private String providerMiddleName;

    private String providerNamePrefixText;

    private String providerNameSuffixText;

    private String providerCredentialText;

    private String providerOtherOrganizationName;

    private String providerOtherOrganizationNameTypeCode;

    private String providerOtherLastName;

    private String providerOtherFirstName;

    private String providerOtherMiddleName;

    private String providerOtherNamePrefixText;

    private String providerOtherNameSuffixText;

    private String providerOtherCredentialText;

    private String providerOtherLastNameTypeCode;

    private String providerFirstLineBusinessMailingAddress;

    private String providerSecondLineBusinessMailingAddress;

    private String providerBusinessMailingAddressCityName;

    private String providerBusinessMailingAddressStateName;

    private String providerBusinessMailingAddressPostalCode;

    private String providerBusinessMailingAddressCountryCode;

    private String providerBusinessMailingAddressTelephoneNumber;

    private String providerBusinessMailingAddressFaxNumber;

    private String providerFirstLineBusinessPracticeLocationAddress;

    private String providerSecondLineBusinessPracticeLocationAddress;

    private String providerBusinessPracticeLocationAddressCityName;

    private String providerBusinessPracticeLocationAddressStateName;

    private String providerBusinessPracticeLocationAddressPostalCode;

    private String providerBusinessPracticeLocationAddressCountryCode;

    private String providerBusinessPracticeLocationAddressTelephoneNumber;

    private String providerBusinessPracticeLocationAddressFaxNumber;

    @Temporal(TemporalType.DATE)
    private Date providerEnumerationDate;

    @Temporal(TemporalType.DATE)
    private Date lastUpdateDate;

    private String npiDeactivationReasonCode;

    @Temporal(TemporalType.DATE)
    private Date deactivationDate;

    @Temporal(TemporalType.DATE)
    private Date reactivationDate;

    private String providerGenderCode;

    private String authorizedOfficialLastName;

    private String authorizedOfficialFirstName;

    private String authorizedOfficialMiddleName;

    private String authorizedOfficialTitle;

    private String authorizedOfficialTelephoneNumber;

    private String healthcareProviderTaxonomyCode1;

    private String providerLicenseNumber1;

    private String providerLicenseNumberStateCode1;

    private String healthcareProviderPrimaryTaxonomySwitch1;

    private String healthcareProviderTaxonomyCode2;

    private String providerLicenseNumber2;

    private String providerLicenseNumberStateCode2;

    private String healthcareProviderPrimaryTaxonomySwitch2;

    private String healthcareProviderTaxonomyCode3;

    private String providerLicenseNumber3;

    private String providerLicenseNumberStateCode3;

    private String healthcareProviderPrimaryTaxonomySwitch3;

    private String healthcareProviderTaxonomyCode4;

    private String providerLicenseNumber4;

    private String providerLicenseNumberStateCode4;

    private String healthcareProviderPrimaryTaxonomySwitch4;

    private String healthcareProviderTaxonomyCode5;

    private String providerLicenseNumber5;

    private String providerLicenseNumberStateCode5;

    private String healthcareProviderPrimaryTaxonomySwitch5;

    private String healthcareProviderTaxonomyCode6;

    private String providerLicenseNumber6;

    private String providerLicenseNumberStateCode6;

    private String healthcareProviderPrimaryTaxonomySwitch6;

    private String healthcareProviderTaxonomyCode7;

    private String providerLicenseNumber7;

    private String providerLicenseNumberStateCode7;

    private String healthcareProviderPrimaryTaxonomySwitch7;

    private String healthcareProviderTaxonomyCode8;

    private String providerLicenseNumber8;

    private String providerLicenseNumberStateCode8;

    private String healthcareProviderPrimaryTaxonomySwitch8;

    private String healthcareProviderTaxonomyCode9;

    private String providerLicenseNumber9;

    private String providerLicenseNumberStateCode9;

    private String healthcareProviderPrimaryTaxonomySwitch9;

    private String healthcareProviderTaxonomyCode10;

    private String providerLicenseNumber10;

    private String providerLicenseNumberStateCode10;

    private String healthcareProviderPrimaryTaxonomySwitch10;

    private String healthcareProviderTaxonomyCode11;

    private String providerLicenseNumber11;

    private String providerLicenseNumberStateCode11;

    private String healthcareProviderPrimaryTaxonomySwitch11;

    private String healthcareProviderTaxonomyCode12;

    private String providerLicenseNumber12;

    private String providerLicenseNumberStateCode12;

    private String healthcareProviderPrimaryTaxonomySwitch12;

    private String healthcareProviderTaxonomyCode13;

    private String providerLicenseNumber13;

    private String providerLicenseNumberStateCode13;

    private String healthcareProviderPrimaryTaxonomySwitch13;

    private String healthcareProviderTaxonomyCode14;

    private String providerLicenseNumber14;

    private String providerLicenseNumberStateCode14;

    private String healthcareProviderPrimaryTaxonomySwitch14;

    private String healthcareProviderTaxonomyCode15;

    private String providerLicenseNumber15;

    private String providerLicenseNumberStateCode15;

    private String healthcareProviderPrimaryTaxonomySwitch15;

    private String otherProviderIdentifier1;

    private String otherProviderIdentifierTypeCode1;

    private String otherProviderIdentifierState1;

    private String otherProviderIdentifierIssuer1;

    private String otherProviderIdentifier2;

    private String otherProviderIdentifierTypeCode2;

    private String otherProviderIdentifierState2;

    private String otherProviderIdentifierIssuer2;

    private String otherProviderIdentifier3;

    private String otherProviderIdentifierTypeCode3;

    private String otherProviderIdentifierState3;

    private String otherProviderIdentifierIssuer3;

    private String otherProviderIdentifier4;

    private String otherProviderIdentifierTypeCode4;

    private String otherProviderIdentifierState4;

    private String otherProviderIdentifierIssuer4;

    private String otherProviderIdentifier5;

    private String otherProviderIdentifierTypeCode5;

    private String otherProviderIdentifierState5;

    private String otherProviderIdentifierIssuer5;

    private String otherProviderIdentifier6;

    private String otherProviderIdentifierTypeCode6;

    private String otherProviderIdentifierState6;

    private String otherProviderIdentifierIssuer6;

    private String otherProviderIdentifier7;

    private String otherProviderIdentifierTypeCode7;

    private String otherProviderIdentifierState7;

    private String otherProviderIdentifierIssuer7;

    private String otherProviderIdentifier8;

    private String otherProviderIdentifierTypeCode8;

    private String otherProviderIdentifierState8;

    private String otherProviderIdentifierIssuer8;

    private String otherProviderIdentifier9;

    private String otherProviderIdentifierTypeCode9;

    private String otherProviderIdentifierState9;

    private String otherProviderIdentifierIssuer9;

    private String otherProviderIdentifier10;

    private String otherProviderIdentifierTypeCode10;

    private String otherProviderIdentifierState10;

    private String otherProviderIdentifierIssuer10;

    private String otherProviderIdentifier11;

    private String otherProviderIdentifierTypeCode11;

    private String otherProviderIdentifierState11;

    private String otherProviderIdentifierIssuer11;

    private String otherProviderIdentifier12;

    private String otherProviderIdentifierTypeCode12;

    private String otherProviderIdentifierState12;

    private String otherProviderIdentifierIssuer12;

    private String otherProviderIdentifier13;

    private String otherProviderIdentifierTypeCode13;

    private String otherProviderIdentifierState13;

    private String otherProviderIdentifierIssuer13;

    private String otherProviderIdentifier14;

    private String otherProviderIdentifierTypeCode14;

    private String otherProviderIdentifierState14;

    private String otherProviderIdentifierIssuer14;

    private String otherProviderIdentifier15;

    private String otherProviderIdentifierTypeCode15;

    private String otherProviderIdentifierState15;

    private String otherProviderIdentifierIssuer15;

    private String otherProviderIdentifier16;

    private String otherProviderIdentifierTypeCode16;

    private String otherProviderIdentifierState16;

    private String otherProviderIdentifierIssuer16;

    private String otherProviderIdentifier17;

    private String otherProviderIdentifierTypeCode17;

    private String otherProviderIdentifierState17;

    private String otherProviderIdentifierIssuer17;

    private String otherProviderIdentifier18;

    private String otherProviderIdentifierTypeCode18;

    private String otherProviderIdentifierState18;

    private String otherProviderIdentifierIssuer18;

    private String otherProviderIdentifier19;

    private String otherProviderIdentifierTypeCode19;

    private String otherProviderIdentifierState19;

    private String otherProviderIdentifierIssuer19;

    private String otherProviderIdentifier20;

    private String otherProviderIdentifierTypeCode20;

    private String otherProviderIdentifierState20;

    private String otherProviderIdentifierIssuer20;

    private String otherProviderIdentifier21;

    private String otherProviderIdentifierTypeCode21;

    private String otherProviderIdentifierState21;

    private String otherProviderIdentifierIssuer21;

    private String otherProviderIdentifier22;

    private String otherProviderIdentifierTypeCode22;

    private String otherProviderIdentifierState22;

    private String otherProviderIdentifierIssuer22;

    private String otherProviderIdentifier23;

    private String otherProviderIdentifierTypeCode23;

    private String otherProviderIdentifierState23;

    private String otherProviderIdentifierIssuer23;

    private String otherProviderIdentifier24;

    private String otherProviderIdentifierTypeCode24;

    private String otherProviderIdentifierState24;

    private String otherProviderIdentifierIssuer24;

    private String otherProviderIdentifier25;

    private String otherProviderIdentifierTypeCode25;

    private String otherProviderIdentifierState25;

    private String otherProviderIdentifierIssuer25;

    private String otherProviderIdentifier26;

    private String otherProviderIdentifierTypeCode26;

    private String otherProviderIdentifierState26;

    private String otherProviderIdentifierIssuer26;

    private String otherProviderIdentifier27;

    private String otherProviderIdentifierTypeCode27;

    private String otherProviderIdentifierState27;

    private String otherProviderIdentifierIssuer27;

    private String otherProviderIdentifier28;

    private String otherProviderIdentifierTypeCode28;

    private String otherProviderIdentifierState28;

    private String otherProviderIdentifierIssuer28;

    private String otherProviderIdentifier29;

    private String otherProviderIdentifierTypeCode29;

    private String otherProviderIdentifierState29;

    private String otherProviderIdentifierIssuer29;

    private String otherProviderIdentifier30;

    private String otherProviderIdentifierTypeCode30;

    private String otherProviderIdentifierState30;

    private String otherProviderIdentifierIssuer30;

    private String otherProviderIdentifier31;

    private String otherProviderIdentifierTypeCode31;

    private String otherProviderIdentifierState31;

    private String otherProviderIdentifierIssuer31;

    private String otherProviderIdentifier32;

    private String otherProviderIdentifierTypeCode32;

    private String otherProviderIdentifierState32;

    private String otherProviderIdentifierIssuer32;

    private String otherProviderIdentifier33;

    private String otherProviderIdentifierTypeCode33;

    private String otherProviderIdentifierState33;

    private String otherProviderIdentifierIssuer33;

    private String otherProviderIdentifier34;

    private String otherProviderIdentifierTypeCode34;

    private String otherProviderIdentifierState34;

    private String otherProviderIdentifierIssuer34;

    private String otherProviderIdentifier35;

    private String otherProviderIdentifierTypeCode35;

    private String otherProviderIdentifierState35;

    private String otherProviderIdentifierIssuer35;

    private String otherProviderIdentifier36;

    private String otherProviderIdentifierTypeCode36;

    private String otherProviderIdentifierState36;

    private String otherProviderIdentifierIssuer36;

    private String otherProviderIdentifier37;

    private String otherProviderIdentifierTypeCode37;

    private String otherProviderIdentifierState37;

    private String otherProviderIdentifierIssuer37;

    private String otherProviderIdentifier38;

    private String otherProviderIdentifierTypeCode38;

    private String otherProviderIdentifierState38;

    private String otherProviderIdentifierIssuer38;

    private String otherProviderIdentifier39;

    private String otherProviderIdentifierTypeCode39;

    private String otherProviderIdentifierState39;

    private String otherProviderIdentifierIssuer39;

    private String otherProviderIdentifier40;

    private String otherProviderIdentifierTypeCode40;

    private String otherProviderIdentifierState40;

    private String otherProviderIdentifierIssuer40;

    private String otherProviderIdentifier41;

    private String otherProviderIdentifierTypeCode41;

    private String otherProviderIdentifierState41;

    private String otherProviderIdentifierIssuer41;

    private String otherProviderIdentifier42;

    private String otherProviderIdentifierTypeCode42;

    private String otherProviderIdentifierState42;

    private String otherProviderIdentifierIssuer42;

    private String otherProviderIdentifier43;

    private String otherProviderIdentifierTypeCode43;

    private String otherProviderIdentifierState43;

    private String otherProviderIdentifierIssuer43;

    private String otherProviderIdentifier44;

    private String otherProviderIdentifierTypeCode44;

    private String otherProviderIdentifierState44;

    private String otherProviderIdentifierIssuer44;

    private String otherProviderIdentifier45;

    private String otherProviderIdentifierTypeCode45;

    private String otherProviderIdentifierState45;

    private String otherProviderIdentifierIssuer45;

    private String otherProviderIdentifier46;

    private String otherProviderIdentifierTypeCode46;

    private String otherProviderIdentifierState46;

    private String otherProviderIdentifierIssuer46;

    private String otherProviderIdentifier47;

    private String otherProviderIdentifierTypeCode47;

    private String otherProviderIdentifierState47;

    private String otherProviderIdentifierIssuer47;

    private String otherProviderIdentifier48;

    private String otherProviderIdentifierTypeCode48;

    private String otherProviderIdentifierState48;

    private String otherProviderIdentifierIssuer48;

    private String otherProviderIdentifier49;

    private String otherProviderIdentifierTypeCode49;

    private String otherProviderIdentifierState49;

    private String otherProviderIdentifierIssuer49;

    private String otherProviderIdentifier50;

    private String otherProviderIdentifierTypeCode50;

    private String otherProviderIdentifierState50;

    private String otherProviderIdentifierIssuer50;

    private String soleProprietorFlag;

    private String organizationSubpartFlag;

    private String parentOrganizationLegalBusinessName;

    private String parentOrganizationTin;

    private String authorizedOfficialNamePrefixText;

    private String authorizedOfficialNameSuffixText;

    private String authorizedOfficialCredentialText;

    private String healthcareProviderTaxonomyGroup1;

    private String healthcareProviderTaxonomyGroup2;

    private String healthcareProviderTaxonomyGroup3;

    private String healthcareProviderTaxonomyGroup4;

    private String healthcareProviderTaxonomyGroup5;

    private String healthcareProviderTaxonomyGroup6;

    private String healthcareProviderTaxonomyGroup7;

    private String healthcareProviderTaxonomyGroup8;

    private String healthcareProviderTaxonomyGroup9;

    private String healthcareProviderTaxonomyGroup10;

    private String healthcareProviderTaxonomyGroup11;

    private String healthcareProviderTaxonomyGroup12;

    private String healthcareProviderTaxonomyGroup13;

    private String healthcareProviderTaxonomyGroup14;

    private String healthcareProviderTaxonomyGroup15;

    public Provider() {

    }

    public Long getNpi() {
        return npi;
    }

    public void setNpi(Long npi) {
        this.npi = npi;
    }

    public Integer getEntityTypeCode() {
        return entityTypeCode;
    }

    public void setEntityTypeCode(Integer entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
    }

    public Long getReplacementNpi() {
        return replacementNpi;
    }

    public void setReplacementNpi(Long replacementNpi) {
        this.replacementNpi = replacementNpi;
    }

    public String getEmployerIdentificationNumber() {
        return employerIdentificationNumber;
    }

    public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
        this.employerIdentificationNumber = employerIdentificationNumber;
    }

    public String getProviderOrganizationName() {
        return providerOrganizationName;
    }

    public void setProviderOrganizationName(String providerOrganizationName) {
        this.providerOrganizationName = providerOrganizationName;
    }

    public String getProviderLastName() {
        return providerLastName;
    }

    public void setProviderLastName(String providerLastName) {
        this.providerLastName = providerLastName;
    }

    public String getProviderFirstName() {
        return providerFirstName;
    }

    public void setProviderFirstName(String providerFirstName) {
        this.providerFirstName = providerFirstName;
    }

    public String getProviderMiddleName() {
        return providerMiddleName;
    }

    public void setProviderMiddleName(String providerMiddleName) {
        this.providerMiddleName = providerMiddleName;
    }

    public String getProviderNamePrefixText() {
        return providerNamePrefixText;
    }

    public void setProviderNamePrefixText(String providerNamePrefixText) {
        this.providerNamePrefixText = providerNamePrefixText;
    }

    public String getProviderNameSuffixText() {
        return providerNameSuffixText;
    }

    public void setProviderNameSuffixText(String providerNameSuffixText) {
        this.providerNameSuffixText = providerNameSuffixText;
    }

    public String getProviderCredentialText() {
        return providerCredentialText;
    }

    public void setProviderCredentialText(String providerCredentialText) {
        this.providerCredentialText = providerCredentialText;
    }

    public String getProviderOtherOrganizationName() {
        return providerOtherOrganizationName;
    }

    public void setProviderOtherOrganizationName(String providerOtherOrganizationName) {
        this.providerOtherOrganizationName = providerOtherOrganizationName;
    }

    public String getProviderOtherOrganizationNameTypeCode() {
        return providerOtherOrganizationNameTypeCode;
    }

    public void setProviderOtherOrganizationNameTypeCode(String providerOtherOrganizationNameTypeCode) {
        this.providerOtherOrganizationNameTypeCode = providerOtherOrganizationNameTypeCode;
    }

    public String getProviderOtherLastName() {
        return providerOtherLastName;
    }

    public void setProviderOtherLastName(String providerOtherLastName) {
        this.providerOtherLastName = providerOtherLastName;
    }

    public String getProviderOtherFirstName() {
        return providerOtherFirstName;
    }

    public void setProviderOtherFirstName(String providerOtherFirstName) {
        this.providerOtherFirstName = providerOtherFirstName;
    }

    public String getProviderOtherMiddleName() {
        return providerOtherMiddleName;
    }

    public void setProviderOtherMiddleName(String providerOtherMiddleName) {
        this.providerOtherMiddleName = providerOtherMiddleName;
    }

    public String getProviderOtherNamePrefixText() {
        return providerOtherNamePrefixText;
    }

    public void setProviderOtherNamePrefixText(String providerOtherNamePrefixText) {
        this.providerOtherNamePrefixText = providerOtherNamePrefixText;
    }

    public String getProviderOtherNameSuffixText() {
        return providerOtherNameSuffixText;
    }

    public void setProviderOtherNameSuffixText(String providerOtherNameSuffixText) {
        this.providerOtherNameSuffixText = providerOtherNameSuffixText;
    }

    public String getProviderOtherCredentialText() {
        return providerOtherCredentialText;
    }

    public void setProviderOtherCredentialText(String providerOtherCredentialText) {
        this.providerOtherCredentialText = providerOtherCredentialText;
    }

    public String getProviderOtherLastNameTypeCode() {
        return providerOtherLastNameTypeCode;
    }

    public void setProviderOtherLastNameTypeCode(String providerOtherLastNameTypeCode) {
        this.providerOtherLastNameTypeCode = providerOtherLastNameTypeCode;
    }

    public String getProviderFirstLineBusinessMailingAddress() {
        return providerFirstLineBusinessMailingAddress;
    }

    public void setProviderFirstLineBusinessMailingAddress(String providerFirstLineBusinessMailingAddress) {
        this.providerFirstLineBusinessMailingAddress = providerFirstLineBusinessMailingAddress;
    }

    public String getProviderSecondLineBusinessMailingAddress() {
        return providerSecondLineBusinessMailingAddress;
    }

    public void setProviderSecondLineBusinessMailingAddress(String providerSecondLineBusinessMailingAddress) {
        this.providerSecondLineBusinessMailingAddress = providerSecondLineBusinessMailingAddress;
    }

    public String getProviderBusinessMailingAddressCityName() {
        return providerBusinessMailingAddressCityName;
    }

    public void setProviderBusinessMailingAddressCityName(String providerBusinessMailingAddressCityName) {
        this.providerBusinessMailingAddressCityName = providerBusinessMailingAddressCityName;
    }

    public String getProviderBusinessMailingAddressStateName() {
        return providerBusinessMailingAddressStateName;
    }

    public void setProviderBusinessMailingAddressStateName(String providerBusinessMailingAddressStateName) {
        this.providerBusinessMailingAddressStateName = providerBusinessMailingAddressStateName;
    }

    public String getProviderBusinessMailingAddressPostalCode() {
        return providerBusinessMailingAddressPostalCode;
    }

    public void setProviderBusinessMailingAddressPostalCode(String providerBusinessMailingAddressPostalCode) {
        this.providerBusinessMailingAddressPostalCode = providerBusinessMailingAddressPostalCode;
    }

    public String getProviderBusinessMailingAddressCountryCode() {
        return providerBusinessMailingAddressCountryCode;
    }

    public void setProviderBusinessMailingAddressCountryCode(String providerBusinessMailingAddressCountryCode) {
        this.providerBusinessMailingAddressCountryCode = providerBusinessMailingAddressCountryCode;
    }

    public String getProviderBusinessMailingAddressTelephoneNumber() {
        return providerBusinessMailingAddressTelephoneNumber;
    }

    public void setProviderBusinessMailingAddressTelephoneNumber(String providerBusinessMailingAddressTelephoneNumber) {
        this.providerBusinessMailingAddressTelephoneNumber = providerBusinessMailingAddressTelephoneNumber;
    }

    public String getProviderBusinessMailingAddressFaxNumber() {
        return providerBusinessMailingAddressFaxNumber;
    }

    public void setProviderBusinessMailingAddressFaxNumber(String providerBusinessMailingAddressFaxNumber) {
        this.providerBusinessMailingAddressFaxNumber = providerBusinessMailingAddressFaxNumber;
    }

    public String getProviderFirstLineBusinessPracticeLocationAddress() {
        return providerFirstLineBusinessPracticeLocationAddress;
    }

    public void setProviderFirstLineBusinessPracticeLocationAddress(String providerFirstLineBusinessPracticeLocationAddress) {
        this.providerFirstLineBusinessPracticeLocationAddress = providerFirstLineBusinessPracticeLocationAddress;
    }

    public String getProviderSecondLineBusinessPracticeLocationAddress() {
        return providerSecondLineBusinessPracticeLocationAddress;
    }

    public void setProviderSecondLineBusinessPracticeLocationAddress(String providerSecondLineBusinessPracticeLocationAddress) {
        this.providerSecondLineBusinessPracticeLocationAddress = providerSecondLineBusinessPracticeLocationAddress;
    }

    public String getProviderBusinessPracticeLocationAddressCityName() {
        return providerBusinessPracticeLocationAddressCityName;
    }

    public void setProviderBusinessPracticeLocationAddressCityName(String providerBusinessPracticeLocationAddressCityName) {
        this.providerBusinessPracticeLocationAddressCityName = providerBusinessPracticeLocationAddressCityName;
    }

    public String getProviderBusinessPracticeLocationAddressStateName() {
        return providerBusinessPracticeLocationAddressStateName;
    }

    public void setProviderBusinessPracticeLocationAddressStateName(String providerBusinessPracticeLocationAddressStateName) {
        this.providerBusinessPracticeLocationAddressStateName = providerBusinessPracticeLocationAddressStateName;
    }

    public String getProviderBusinessPracticeLocationAddressPostalCode() {
        return providerBusinessPracticeLocationAddressPostalCode;
    }

    public void setProviderBusinessPracticeLocationAddressPostalCode(String providerBusinessPracticeLocationAddressPostalCode) {
        this.providerBusinessPracticeLocationAddressPostalCode = providerBusinessPracticeLocationAddressPostalCode;
    }

    public String getProviderBusinessPracticeLocationAddressCountryCode() {
        return providerBusinessPracticeLocationAddressCountryCode;
    }

    public void setProviderBusinessPracticeLocationAddressCountryCode(String providerBusinessPracticeLocationAddressCountryCode) {
        this.providerBusinessPracticeLocationAddressCountryCode = providerBusinessPracticeLocationAddressCountryCode;
    }

    public String getProviderBusinessPracticeLocationAddressTelephoneNumber() {
        return providerBusinessPracticeLocationAddressTelephoneNumber;
    }

    public void setProviderBusinessPracticeLocationAddressTelephoneNumber(String providerBusinessPracticeLocationAddressTelephoneNumber) {
        this.providerBusinessPracticeLocationAddressTelephoneNumber = providerBusinessPracticeLocationAddressTelephoneNumber;
    }

    public String getProviderBusinessPracticeLocationAddressFaxNumber() {
        return providerBusinessPracticeLocationAddressFaxNumber;
    }

    public void setProviderBusinessPracticeLocationAddressFaxNumber(String providerBusinessPracticeLocationAddressFaxNumber) {
        this.providerBusinessPracticeLocationAddressFaxNumber = providerBusinessPracticeLocationAddressFaxNumber;
    }

    public Date getProviderEnumerationDate() {
        return providerEnumerationDate;
    }

    public void setProviderEnumerationDate(Date providerEnumerationDate) {
        this.providerEnumerationDate = providerEnumerationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getNpiDeactivationReasonCode() {
        return npiDeactivationReasonCode;
    }

    public void setNpiDeactivationReasonCode(String npiDeactivationReasonCode) {
        this.npiDeactivationReasonCode = npiDeactivationReasonCode;
    }

    public Date getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(Date deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public Date getReactivationDate() {
        return reactivationDate;
    }

    public void setReactivationDate(Date reactivationDate) {
        this.reactivationDate = reactivationDate;
    }

    public String getProviderGenderCode() {
        return providerGenderCode;
    }

    public void setProviderGenderCode(String providerGenderCode) {
        this.providerGenderCode = providerGenderCode;
    }

    public String getAuthorizedOfficialLastName() {
        return authorizedOfficialLastName;
    }

    public void setAuthorizedOfficialLastName(String authorizedOfficialLastName) {
        this.authorizedOfficialLastName = authorizedOfficialLastName;
    }

    public String getAuthorizedOfficialFirstName() {
        return authorizedOfficialFirstName;
    }

    public void setAuthorizedOfficialFirstName(String authorizedOfficialFirstName) {
        this.authorizedOfficialFirstName = authorizedOfficialFirstName;
    }

    public String getAuthorizedOfficialMiddleName() {
        return authorizedOfficialMiddleName;
    }

    public void setAuthorizedOfficialMiddleName(String authorizedOfficialMiddleName) {
        this.authorizedOfficialMiddleName = authorizedOfficialMiddleName;
    }

    public String getAuthorizedOfficialTitle() {
        return authorizedOfficialTitle;
    }

    public void setAuthorizedOfficialTitle(String authorizedOfficialTitle) {
        this.authorizedOfficialTitle = authorizedOfficialTitle;
    }

    public String getAuthorizedOfficialTelephoneNumber() {
        return authorizedOfficialTelephoneNumber;
    }

    public void setAuthorizedOfficialTelephoneNumber(String authorizedOfficialTelephoneNumber) {
        this.authorizedOfficialTelephoneNumber = authorizedOfficialTelephoneNumber;
    }

    public String getHealthcareProviderTaxonomyCode1() {
        return healthcareProviderTaxonomyCode1;
    }

    public void setHealthcareProviderTaxonomyCode1(String healthcareProviderTaxonomyCode1) {
        this.healthcareProviderTaxonomyCode1 = healthcareProviderTaxonomyCode1;
    }

    public String getProviderLicenseNumber1() {
        return providerLicenseNumber1;
    }

    public void setProviderLicenseNumber1(String providerLicenseNumber1) {
        this.providerLicenseNumber1 = providerLicenseNumber1;
    }

    public String getProviderLicenseNumberStateCode1() {
        return providerLicenseNumberStateCode1;
    }

    public void setProviderLicenseNumberStateCode1(String providerLicenseNumberStateCode1) {
        this.providerLicenseNumberStateCode1 = providerLicenseNumberStateCode1;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch1() {
        return healthcareProviderPrimaryTaxonomySwitch1;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch1(String healthcareProviderPrimaryTaxonomySwitch1) {
        this.healthcareProviderPrimaryTaxonomySwitch1 = healthcareProviderPrimaryTaxonomySwitch1;
    }

    public String getHealthcareProviderTaxonomyCode2() {
        return healthcareProviderTaxonomyCode2;
    }

    public void setHealthcareProviderTaxonomyCode2(String healthcareProviderTaxonomyCode2) {
        this.healthcareProviderTaxonomyCode2 = healthcareProviderTaxonomyCode2;
    }

    public String getProviderLicenseNumber2() {
        return providerLicenseNumber2;
    }

    public void setProviderLicenseNumber2(String providerLicenseNumber2) {
        this.providerLicenseNumber2 = providerLicenseNumber2;
    }

    public String getProviderLicenseNumberStateCode2() {
        return providerLicenseNumberStateCode2;
    }

    public void setProviderLicenseNumberStateCode2(String providerLicenseNumberStateCode2) {
        this.providerLicenseNumberStateCode2 = providerLicenseNumberStateCode2;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch2() {
        return healthcareProviderPrimaryTaxonomySwitch2;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch2(String healthcareProviderPrimaryTaxonomySwitch2) {
        this.healthcareProviderPrimaryTaxonomySwitch2 = healthcareProviderPrimaryTaxonomySwitch2;
    }

    public String getHealthcareProviderTaxonomyCode3() {
        return healthcareProviderTaxonomyCode3;
    }

    public void setHealthcareProviderTaxonomyCode3(String healthcareProviderTaxonomyCode3) {
        this.healthcareProviderTaxonomyCode3 = healthcareProviderTaxonomyCode3;
    }

    public String getProviderLicenseNumber3() {
        return providerLicenseNumber3;
    }

    public void setProviderLicenseNumber3(String providerLicenseNumber3) {
        this.providerLicenseNumber3 = providerLicenseNumber3;
    }

    public String getProviderLicenseNumberStateCode3() {
        return providerLicenseNumberStateCode3;
    }

    public void setProviderLicenseNumberStateCode3(String providerLicenseNumberStateCode3) {
        this.providerLicenseNumberStateCode3 = providerLicenseNumberStateCode3;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch3() {
        return healthcareProviderPrimaryTaxonomySwitch3;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch3(String healthcareProviderPrimaryTaxonomySwitch3) {
        this.healthcareProviderPrimaryTaxonomySwitch3 = healthcareProviderPrimaryTaxonomySwitch3;
    }

    public String getHealthcareProviderTaxonomyCode4() {
        return healthcareProviderTaxonomyCode4;
    }

    public void setHealthcareProviderTaxonomyCode4(String healthcareProviderTaxonomyCode4) {
        this.healthcareProviderTaxonomyCode4 = healthcareProviderTaxonomyCode4;
    }

    public String getProviderLicenseNumber4() {
        return providerLicenseNumber4;
    }

    public void setProviderLicenseNumber4(String providerLicenseNumber4) {
        this.providerLicenseNumber4 = providerLicenseNumber4;
    }

    public String getProviderLicenseNumberStateCode4() {
        return providerLicenseNumberStateCode4;
    }

    public void setProviderLicenseNumberStateCode4(String providerLicenseNumberStateCode4) {
        this.providerLicenseNumberStateCode4 = providerLicenseNumberStateCode4;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch4() {
        return healthcareProviderPrimaryTaxonomySwitch4;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch4(String healthcareProviderPrimaryTaxonomySwitch4) {
        this.healthcareProviderPrimaryTaxonomySwitch4 = healthcareProviderPrimaryTaxonomySwitch4;
    }

    public String getHealthcareProviderTaxonomyCode5() {
        return healthcareProviderTaxonomyCode5;
    }

    public void setHealthcareProviderTaxonomyCode5(String healthcareProviderTaxonomyCode5) {
        this.healthcareProviderTaxonomyCode5 = healthcareProviderTaxonomyCode5;
    }

    public String getProviderLicenseNumber5() {
        return providerLicenseNumber5;
    }

    public void setProviderLicenseNumber5(String providerLicenseNumber5) {
        this.providerLicenseNumber5 = providerLicenseNumber5;
    }

    public String getProviderLicenseNumberStateCode5() {
        return providerLicenseNumberStateCode5;
    }

    public void setProviderLicenseNumberStateCode5(String providerLicenseNumberStateCode5) {
        this.providerLicenseNumberStateCode5 = providerLicenseNumberStateCode5;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch5() {
        return healthcareProviderPrimaryTaxonomySwitch5;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch5(String healthcareProviderPrimaryTaxonomySwitch5) {
        this.healthcareProviderPrimaryTaxonomySwitch5 = healthcareProviderPrimaryTaxonomySwitch5;
    }

    public String getHealthcareProviderTaxonomyCode6() {
        return healthcareProviderTaxonomyCode6;
    }

    public void setHealthcareProviderTaxonomyCode6(String healthcareProviderTaxonomyCode6) {
        this.healthcareProviderTaxonomyCode6 = healthcareProviderTaxonomyCode6;
    }

    public String getProviderLicenseNumber6() {
        return providerLicenseNumber6;
    }

    public void setProviderLicenseNumber6(String providerLicenseNumber6) {
        this.providerLicenseNumber6 = providerLicenseNumber6;
    }

    public String getProviderLicenseNumberStateCode6() {
        return providerLicenseNumberStateCode6;
    }

    public void setProviderLicenseNumberStateCode6(String providerLicenseNumberStateCode6) {
        this.providerLicenseNumberStateCode6 = providerLicenseNumberStateCode6;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch6() {
        return healthcareProviderPrimaryTaxonomySwitch6;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch6(String healthcareProviderPrimaryTaxonomySwitch6) {
        this.healthcareProviderPrimaryTaxonomySwitch6 = healthcareProviderPrimaryTaxonomySwitch6;
    }

    public String getHealthcareProviderTaxonomyCode7() {
        return healthcareProviderTaxonomyCode7;
    }

    public void setHealthcareProviderTaxonomyCode7(String healthcareProviderTaxonomyCode7) {
        this.healthcareProviderTaxonomyCode7 = healthcareProviderTaxonomyCode7;
    }

    public String getProviderLicenseNumber7() {
        return providerLicenseNumber7;
    }

    public void setProviderLicenseNumber7(String providerLicenseNumber7) {
        this.providerLicenseNumber7 = providerLicenseNumber7;
    }

    public String getProviderLicenseNumberStateCode7() {
        return providerLicenseNumberStateCode7;
    }

    public void setProviderLicenseNumberStateCode7(String providerLicenseNumberStateCode7) {
        this.providerLicenseNumberStateCode7 = providerLicenseNumberStateCode7;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch7() {
        return healthcareProviderPrimaryTaxonomySwitch7;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch7(String healthcareProviderPrimaryTaxonomySwitch7) {
        this.healthcareProviderPrimaryTaxonomySwitch7 = healthcareProviderPrimaryTaxonomySwitch7;
    }

    public String getHealthcareProviderTaxonomyCode8() {
        return healthcareProviderTaxonomyCode8;
    }

    public void setHealthcareProviderTaxonomyCode8(String healthcareProviderTaxonomyCode8) {
        this.healthcareProviderTaxonomyCode8 = healthcareProviderTaxonomyCode8;
    }

    public String getProviderLicenseNumber8() {
        return providerLicenseNumber8;
    }

    public void setProviderLicenseNumber8(String providerLicenseNumber8) {
        this.providerLicenseNumber8 = providerLicenseNumber8;
    }

    public String getProviderLicenseNumberStateCode8() {
        return providerLicenseNumberStateCode8;
    }

    public void setProviderLicenseNumberStateCode8(String providerLicenseNumberStateCode8) {
        this.providerLicenseNumberStateCode8 = providerLicenseNumberStateCode8;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch8() {
        return healthcareProviderPrimaryTaxonomySwitch8;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch8(String healthcareProviderPrimaryTaxonomySwitch8) {
        this.healthcareProviderPrimaryTaxonomySwitch8 = healthcareProviderPrimaryTaxonomySwitch8;
    }

    public String getHealthcareProviderTaxonomyCode9() {
        return healthcareProviderTaxonomyCode9;
    }

    public void setHealthcareProviderTaxonomyCode9(String healthcareProviderTaxonomyCode9) {
        this.healthcareProviderTaxonomyCode9 = healthcareProviderTaxonomyCode9;
    }

    public String getProviderLicenseNumber9() {
        return providerLicenseNumber9;
    }

    public void setProviderLicenseNumber9(String providerLicenseNumber9) {
        this.providerLicenseNumber9 = providerLicenseNumber9;
    }

    public String getProviderLicenseNumberStateCode9() {
        return providerLicenseNumberStateCode9;
    }

    public void setProviderLicenseNumberStateCode9(String providerLicenseNumberStateCode9) {
        this.providerLicenseNumberStateCode9 = providerLicenseNumberStateCode9;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch9() {
        return healthcareProviderPrimaryTaxonomySwitch9;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch9(String healthcareProviderPrimaryTaxonomySwitch9) {
        this.healthcareProviderPrimaryTaxonomySwitch9 = healthcareProviderPrimaryTaxonomySwitch9;
    }

    public String getHealthcareProviderTaxonomyCode10() {
        return healthcareProviderTaxonomyCode10;
    }

    public void setHealthcareProviderTaxonomyCode10(String healthcareProviderTaxonomyCode10) {
        this.healthcareProviderTaxonomyCode10 = healthcareProviderTaxonomyCode10;
    }

    public String getProviderLicenseNumber10() {
        return providerLicenseNumber10;
    }

    public void setProviderLicenseNumber10(String providerLicenseNumber10) {
        this.providerLicenseNumber10 = providerLicenseNumber10;
    }

    public String getProviderLicenseNumberStateCode10() {
        return providerLicenseNumberStateCode10;
    }

    public void setProviderLicenseNumberStateCode10(String providerLicenseNumberStateCode10) {
        this.providerLicenseNumberStateCode10 = providerLicenseNumberStateCode10;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch10() {
        return healthcareProviderPrimaryTaxonomySwitch10;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch10(String healthcareProviderPrimaryTaxonomySwitch10) {
        this.healthcareProviderPrimaryTaxonomySwitch10 = healthcareProviderPrimaryTaxonomySwitch10;
    }

    public String getHealthcareProviderTaxonomyCode11() {
        return healthcareProviderTaxonomyCode11;
    }

    public void setHealthcareProviderTaxonomyCode11(String healthcareProviderTaxonomyCode11) {
        this.healthcareProviderTaxonomyCode11 = healthcareProviderTaxonomyCode11;
    }

    public String getProviderLicenseNumber11() {
        return providerLicenseNumber11;
    }

    public void setProviderLicenseNumber11(String providerLicenseNumber11) {
        this.providerLicenseNumber11 = providerLicenseNumber11;
    }

    public String getProviderLicenseNumberStateCode11() {
        return providerLicenseNumberStateCode11;
    }

    public void setProviderLicenseNumberStateCode11(String providerLicenseNumberStateCode11) {
        this.providerLicenseNumberStateCode11 = providerLicenseNumberStateCode11;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch11() {
        return healthcareProviderPrimaryTaxonomySwitch11;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch11(String healthcareProviderPrimaryTaxonomySwitch11) {
        this.healthcareProviderPrimaryTaxonomySwitch11 = healthcareProviderPrimaryTaxonomySwitch11;
    }

    public String getHealthcareProviderTaxonomyCode12() {
        return healthcareProviderTaxonomyCode12;
    }

    public void setHealthcareProviderTaxonomyCode12(String healthcareProviderTaxonomyCode12) {
        this.healthcareProviderTaxonomyCode12 = healthcareProviderTaxonomyCode12;
    }

    public String getProviderLicenseNumber12() {
        return providerLicenseNumber12;
    }

    public void setProviderLicenseNumber12(String providerLicenseNumber12) {
        this.providerLicenseNumber12 = providerLicenseNumber12;
    }

    public String getProviderLicenseNumberStateCode12() {
        return providerLicenseNumberStateCode12;
    }

    public void setProviderLicenseNumberStateCode12(String providerLicenseNumberStateCode12) {
        this.providerLicenseNumberStateCode12 = providerLicenseNumberStateCode12;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch12() {
        return healthcareProviderPrimaryTaxonomySwitch12;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch12(String healthcareProviderPrimaryTaxonomySwitch12) {
        this.healthcareProviderPrimaryTaxonomySwitch12 = healthcareProviderPrimaryTaxonomySwitch12;
    }

    public String getHealthcareProviderTaxonomyCode13() {
        return healthcareProviderTaxonomyCode13;
    }

    public void setHealthcareProviderTaxonomyCode13(String healthcareProviderTaxonomyCode13) {
        this.healthcareProviderTaxonomyCode13 = healthcareProviderTaxonomyCode13;
    }

    public String getProviderLicenseNumber13() {
        return providerLicenseNumber13;
    }

    public void setProviderLicenseNumber13(String providerLicenseNumber13) {
        this.providerLicenseNumber13 = providerLicenseNumber13;
    }

    public String getProviderLicenseNumberStateCode13() {
        return providerLicenseNumberStateCode13;
    }

    public void setProviderLicenseNumberStateCode13(String providerLicenseNumberStateCode13) {
        this.providerLicenseNumberStateCode13 = providerLicenseNumberStateCode13;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch13() {
        return healthcareProviderPrimaryTaxonomySwitch13;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch13(String healthcareProviderPrimaryTaxonomySwitch13) {
        this.healthcareProviderPrimaryTaxonomySwitch13 = healthcareProviderPrimaryTaxonomySwitch13;
    }

    public String getHealthcareProviderTaxonomyCode14() {
        return healthcareProviderTaxonomyCode14;
    }

    public void setHealthcareProviderTaxonomyCode14(String healthcareProviderTaxonomyCode14) {
        this.healthcareProviderTaxonomyCode14 = healthcareProviderTaxonomyCode14;
    }

    public String getProviderLicenseNumber14() {
        return providerLicenseNumber14;
    }

    public void setProviderLicenseNumber14(String providerLicenseNumber14) {
        this.providerLicenseNumber14 = providerLicenseNumber14;
    }

    public String getProviderLicenseNumberStateCode14() {
        return providerLicenseNumberStateCode14;
    }

    public void setProviderLicenseNumberStateCode14(String providerLicenseNumberStateCode14) {
        this.providerLicenseNumberStateCode14 = providerLicenseNumberStateCode14;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch14() {
        return healthcareProviderPrimaryTaxonomySwitch14;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch14(String healthcareProviderPrimaryTaxonomySwitch14) {
        this.healthcareProviderPrimaryTaxonomySwitch14 = healthcareProviderPrimaryTaxonomySwitch14;
    }

    public String getHealthcareProviderTaxonomyCode15() {
        return healthcareProviderTaxonomyCode15;
    }

    public void setHealthcareProviderTaxonomyCode15(String healthcareProviderTaxonomyCode15) {
        this.healthcareProviderTaxonomyCode15 = healthcareProviderTaxonomyCode15;
    }

    public String getProviderLicenseNumber15() {
        return providerLicenseNumber15;
    }

    public void setProviderLicenseNumber15(String providerLicenseNumber15) {
        this.providerLicenseNumber15 = providerLicenseNumber15;
    }

    public String getProviderLicenseNumberStateCode15() {
        return providerLicenseNumberStateCode15;
    }

    public void setProviderLicenseNumberStateCode15(String providerLicenseNumberStateCode15) {
        this.providerLicenseNumberStateCode15 = providerLicenseNumberStateCode15;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch15() {
        return healthcareProviderPrimaryTaxonomySwitch15;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch15(String healthcareProviderPrimaryTaxonomySwitch15) {
        this.healthcareProviderPrimaryTaxonomySwitch15 = healthcareProviderPrimaryTaxonomySwitch15;
    }

    public String getOtherProviderIdentifier1() {
        return otherProviderIdentifier1;
    }

    public void setOtherProviderIdentifier1(String otherProviderIdentifier1) {
        this.otherProviderIdentifier1 = otherProviderIdentifier1;
    }

    public String getOtherProviderIdentifierTypeCode1() {
        return otherProviderIdentifierTypeCode1;
    }

    public void setOtherProviderIdentifierTypeCode1(String otherProviderIdentifierTypeCode1) {
        this.otherProviderIdentifierTypeCode1 = otherProviderIdentifierTypeCode1;
    }

    public String getOtherProviderIdentifierState1() {
        return otherProviderIdentifierState1;
    }

    public void setOtherProviderIdentifierState1(String otherProviderIdentifierState1) {
        this.otherProviderIdentifierState1 = otherProviderIdentifierState1;
    }

    public String getOtherProviderIdentifierIssuer1() {
        return otherProviderIdentifierIssuer1;
    }

    public void setOtherProviderIdentifierIssuer1(String otherProviderIdentifierIssuer1) {
        this.otherProviderIdentifierIssuer1 = otherProviderIdentifierIssuer1;
    }

    public String getOtherProviderIdentifier2() {
        return otherProviderIdentifier2;
    }

    public void setOtherProviderIdentifier2(String otherProviderIdentifier2) {
        this.otherProviderIdentifier2 = otherProviderIdentifier2;
    }

    public String getOtherProviderIdentifierTypeCode2() {
        return otherProviderIdentifierTypeCode2;
    }

    public void setOtherProviderIdentifierTypeCode2(String otherProviderIdentifierTypeCode2) {
        this.otherProviderIdentifierTypeCode2 = otherProviderIdentifierTypeCode2;
    }

    public String getOtherProviderIdentifierState2() {
        return otherProviderIdentifierState2;
    }

    public void setOtherProviderIdentifierState2(String otherProviderIdentifierState2) {
        this.otherProviderIdentifierState2 = otherProviderIdentifierState2;
    }

    public String getOtherProviderIdentifierIssuer2() {
        return otherProviderIdentifierIssuer2;
    }

    public void setOtherProviderIdentifierIssuer2(String otherProviderIdentifierIssuer2) {
        this.otherProviderIdentifierIssuer2 = otherProviderIdentifierIssuer2;
    }

    public String getOtherProviderIdentifier3() {
        return otherProviderIdentifier3;
    }

    public void setOtherProviderIdentifier3(String otherProviderIdentifier3) {
        this.otherProviderIdentifier3 = otherProviderIdentifier3;
    }

    public String getOtherProviderIdentifierTypeCode3() {
        return otherProviderIdentifierTypeCode3;
    }

    public void setOtherProviderIdentifierTypeCode3(String otherProviderIdentifierTypeCode3) {
        this.otherProviderIdentifierTypeCode3 = otherProviderIdentifierTypeCode3;
    }

    public String getOtherProviderIdentifierState3() {
        return otherProviderIdentifierState3;
    }

    public void setOtherProviderIdentifierState3(String otherProviderIdentifierState3) {
        this.otherProviderIdentifierState3 = otherProviderIdentifierState3;
    }

    public String getOtherProviderIdentifierIssuer3() {
        return otherProviderIdentifierIssuer3;
    }

    public void setOtherProviderIdentifierIssuer3(String otherProviderIdentifierIssuer3) {
        this.otherProviderIdentifierIssuer3 = otherProviderIdentifierIssuer3;
    }

    public String getOtherProviderIdentifier4() {
        return otherProviderIdentifier4;
    }

    public void setOtherProviderIdentifier4(String otherProviderIdentifier4) {
        this.otherProviderIdentifier4 = otherProviderIdentifier4;
    }

    public String getOtherProviderIdentifierTypeCode4() {
        return otherProviderIdentifierTypeCode4;
    }

    public void setOtherProviderIdentifierTypeCode4(String otherProviderIdentifierTypeCode4) {
        this.otherProviderIdentifierTypeCode4 = otherProviderIdentifierTypeCode4;
    }

    public String getOtherProviderIdentifierState4() {
        return otherProviderIdentifierState4;
    }

    public void setOtherProviderIdentifierState4(String otherProviderIdentifierState4) {
        this.otherProviderIdentifierState4 = otherProviderIdentifierState4;
    }

    public String getOtherProviderIdentifierIssuer4() {
        return otherProviderIdentifierIssuer4;
    }

    public void setOtherProviderIdentifierIssuer4(String otherProviderIdentifierIssuer4) {
        this.otherProviderIdentifierIssuer4 = otherProviderIdentifierIssuer4;
    }

    public String getOtherProviderIdentifier5() {
        return otherProviderIdentifier5;
    }

    public void setOtherProviderIdentifier5(String otherProviderIdentifier5) {
        this.otherProviderIdentifier5 = otherProviderIdentifier5;
    }

    public String getOtherProviderIdentifierTypeCode5() {
        return otherProviderIdentifierTypeCode5;
    }

    public void setOtherProviderIdentifierTypeCode5(String otherProviderIdentifierTypeCode5) {
        this.otherProviderIdentifierTypeCode5 = otherProviderIdentifierTypeCode5;
    }

    public String getOtherProviderIdentifierState5() {
        return otherProviderIdentifierState5;
    }

    public void setOtherProviderIdentifierState5(String otherProviderIdentifierState5) {
        this.otherProviderIdentifierState5 = otherProviderIdentifierState5;
    }

    public String getOtherProviderIdentifierIssuer5() {
        return otherProviderIdentifierIssuer5;
    }

    public void setOtherProviderIdentifierIssuer5(String otherProviderIdentifierIssuer5) {
        this.otherProviderIdentifierIssuer5 = otherProviderIdentifierIssuer5;
    }

    public String getOtherProviderIdentifier6() {
        return otherProviderIdentifier6;
    }

    public void setOtherProviderIdentifier6(String otherProviderIdentifier6) {
        this.otherProviderIdentifier6 = otherProviderIdentifier6;
    }

    public String getOtherProviderIdentifierTypeCode6() {
        return otherProviderIdentifierTypeCode6;
    }

    public void setOtherProviderIdentifierTypeCode6(String otherProviderIdentifierTypeCode6) {
        this.otherProviderIdentifierTypeCode6 = otherProviderIdentifierTypeCode6;
    }

    public String getOtherProviderIdentifierState6() {
        return otherProviderIdentifierState6;
    }

    public void setOtherProviderIdentifierState6(String otherProviderIdentifierState6) {
        this.otherProviderIdentifierState6 = otherProviderIdentifierState6;
    }

    public String getOtherProviderIdentifierIssuer6() {
        return otherProviderIdentifierIssuer6;
    }

    public void setOtherProviderIdentifierIssuer6(String otherProviderIdentifierIssuer6) {
        this.otherProviderIdentifierIssuer6 = otherProviderIdentifierIssuer6;
    }

    public String getOtherProviderIdentifier7() {
        return otherProviderIdentifier7;
    }

    public void setOtherProviderIdentifier7(String otherProviderIdentifier7) {
        this.otherProviderIdentifier7 = otherProviderIdentifier7;
    }

    public String getOtherProviderIdentifierTypeCode7() {
        return otherProviderIdentifierTypeCode7;
    }

    public void setOtherProviderIdentifierTypeCode7(String otherProviderIdentifierTypeCode7) {
        this.otherProviderIdentifierTypeCode7 = otherProviderIdentifierTypeCode7;
    }

    public String getOtherProviderIdentifierState7() {
        return otherProviderIdentifierState7;
    }

    public void setOtherProviderIdentifierState7(String otherProviderIdentifierState7) {
        this.otherProviderIdentifierState7 = otherProviderIdentifierState7;
    }

    public String getOtherProviderIdentifierIssuer7() {
        return otherProviderIdentifierIssuer7;
    }

    public void setOtherProviderIdentifierIssuer7(String otherProviderIdentifierIssuer7) {
        this.otherProviderIdentifierIssuer7 = otherProviderIdentifierIssuer7;
    }

    public String getOtherProviderIdentifier8() {
        return otherProviderIdentifier8;
    }

    public void setOtherProviderIdentifier8(String otherProviderIdentifier8) {
        this.otherProviderIdentifier8 = otherProviderIdentifier8;
    }

    public String getOtherProviderIdentifierTypeCode8() {
        return otherProviderIdentifierTypeCode8;
    }

    public void setOtherProviderIdentifierTypeCode8(String otherProviderIdentifierTypeCode8) {
        this.otherProviderIdentifierTypeCode8 = otherProviderIdentifierTypeCode8;
    }

    public String getOtherProviderIdentifierState8() {
        return otherProviderIdentifierState8;
    }

    public void setOtherProviderIdentifierState8(String otherProviderIdentifierState8) {
        this.otherProviderIdentifierState8 = otherProviderIdentifierState8;
    }

    public String getOtherProviderIdentifierIssuer8() {
        return otherProviderIdentifierIssuer8;
    }

    public void setOtherProviderIdentifierIssuer8(String otherProviderIdentifierIssuer8) {
        this.otherProviderIdentifierIssuer8 = otherProviderIdentifierIssuer8;
    }

    public String getOtherProviderIdentifier9() {
        return otherProviderIdentifier9;
    }

    public void setOtherProviderIdentifier9(String otherProviderIdentifier9) {
        this.otherProviderIdentifier9 = otherProviderIdentifier9;
    }

    public String getOtherProviderIdentifierTypeCode9() {
        return otherProviderIdentifierTypeCode9;
    }

    public void setOtherProviderIdentifierTypeCode9(String otherProviderIdentifierTypeCode9) {
        this.otherProviderIdentifierTypeCode9 = otherProviderIdentifierTypeCode9;
    }

    public String getOtherProviderIdentifierState9() {
        return otherProviderIdentifierState9;
    }

    public void setOtherProviderIdentifierState9(String otherProviderIdentifierState9) {
        this.otherProviderIdentifierState9 = otherProviderIdentifierState9;
    }

    public String getOtherProviderIdentifierIssuer9() {
        return otherProviderIdentifierIssuer9;
    }

    public void setOtherProviderIdentifierIssuer9(String otherProviderIdentifierIssuer9) {
        this.otherProviderIdentifierIssuer9 = otherProviderIdentifierIssuer9;
    }

    public String getOtherProviderIdentifier10() {
        return otherProviderIdentifier10;
    }

    public void setOtherProviderIdentifier10(String otherProviderIdentifier10) {
        this.otherProviderIdentifier10 = otherProviderIdentifier10;
    }

    public String getOtherProviderIdentifierTypeCode10() {
        return otherProviderIdentifierTypeCode10;
    }

    public void setOtherProviderIdentifierTypeCode10(String otherProviderIdentifierTypeCode10) {
        this.otherProviderIdentifierTypeCode10 = otherProviderIdentifierTypeCode10;
    }

    public String getOtherProviderIdentifierState10() {
        return otherProviderIdentifierState10;
    }

    public void setOtherProviderIdentifierState10(String otherProviderIdentifierState10) {
        this.otherProviderIdentifierState10 = otherProviderIdentifierState10;
    }

    public String getOtherProviderIdentifierIssuer10() {
        return otherProviderIdentifierIssuer10;
    }

    public void setOtherProviderIdentifierIssuer10(String otherProviderIdentifierIssuer10) {
        this.otherProviderIdentifierIssuer10 = otherProviderIdentifierIssuer10;
    }

    public String getOtherProviderIdentifier11() {
        return otherProviderIdentifier11;
    }

    public void setOtherProviderIdentifier11(String otherProviderIdentifier11) {
        this.otherProviderIdentifier11 = otherProviderIdentifier11;
    }

    public String getOtherProviderIdentifierTypeCode11() {
        return otherProviderIdentifierTypeCode11;
    }

    public void setOtherProviderIdentifierTypeCode11(String otherProviderIdentifierTypeCode11) {
        this.otherProviderIdentifierTypeCode11 = otherProviderIdentifierTypeCode11;
    }

    public String getOtherProviderIdentifierState11() {
        return otherProviderIdentifierState11;
    }

    public void setOtherProviderIdentifierState11(String otherProviderIdentifierState11) {
        this.otherProviderIdentifierState11 = otherProviderIdentifierState11;
    }

    public String getOtherProviderIdentifierIssuer11() {
        return otherProviderIdentifierIssuer11;
    }

    public void setOtherProviderIdentifierIssuer11(String otherProviderIdentifierIssuer11) {
        this.otherProviderIdentifierIssuer11 = otherProviderIdentifierIssuer11;
    }

    public String getOtherProviderIdentifier12() {
        return otherProviderIdentifier12;
    }

    public void setOtherProviderIdentifier12(String otherProviderIdentifier12) {
        this.otherProviderIdentifier12 = otherProviderIdentifier12;
    }

    public String getOtherProviderIdentifierTypeCode12() {
        return otherProviderIdentifierTypeCode12;
    }

    public void setOtherProviderIdentifierTypeCode12(String otherProviderIdentifierTypeCode12) {
        this.otherProviderIdentifierTypeCode12 = otherProviderIdentifierTypeCode12;
    }

    public String getOtherProviderIdentifierState12() {
        return otherProviderIdentifierState12;
    }

    public void setOtherProviderIdentifierState12(String otherProviderIdentifierState12) {
        this.otherProviderIdentifierState12 = otherProviderIdentifierState12;
    }

    public String getOtherProviderIdentifierIssuer12() {
        return otherProviderIdentifierIssuer12;
    }

    public void setOtherProviderIdentifierIssuer12(String otherProviderIdentifierIssuer12) {
        this.otherProviderIdentifierIssuer12 = otherProviderIdentifierIssuer12;
    }

    public String getOtherProviderIdentifier13() {
        return otherProviderIdentifier13;
    }

    public void setOtherProviderIdentifier13(String otherProviderIdentifier13) {
        this.otherProviderIdentifier13 = otherProviderIdentifier13;
    }

    public String getOtherProviderIdentifierTypeCode13() {
        return otherProviderIdentifierTypeCode13;
    }

    public void setOtherProviderIdentifierTypeCode13(String otherProviderIdentifierTypeCode13) {
        this.otherProviderIdentifierTypeCode13 = otherProviderIdentifierTypeCode13;
    }

    public String getOtherProviderIdentifierState13() {
        return otherProviderIdentifierState13;
    }

    public void setOtherProviderIdentifierState13(String otherProviderIdentifierState13) {
        this.otherProviderIdentifierState13 = otherProviderIdentifierState13;
    }

    public String getOtherProviderIdentifierIssuer13() {
        return otherProviderIdentifierIssuer13;
    }

    public void setOtherProviderIdentifierIssuer13(String otherProviderIdentifierIssuer13) {
        this.otherProviderIdentifierIssuer13 = otherProviderIdentifierIssuer13;
    }

    public String getOtherProviderIdentifier14() {
        return otherProviderIdentifier14;
    }

    public void setOtherProviderIdentifier14(String otherProviderIdentifier14) {
        this.otherProviderIdentifier14 = otherProviderIdentifier14;
    }

    public String getOtherProviderIdentifierTypeCode14() {
        return otherProviderIdentifierTypeCode14;
    }

    public void setOtherProviderIdentifierTypeCode14(String otherProviderIdentifierTypeCode14) {
        this.otherProviderIdentifierTypeCode14 = otherProviderIdentifierTypeCode14;
    }

    public String getOtherProviderIdentifierState14() {
        return otherProviderIdentifierState14;
    }

    public void setOtherProviderIdentifierState14(String otherProviderIdentifierState14) {
        this.otherProviderIdentifierState14 = otherProviderIdentifierState14;
    }

    public String getOtherProviderIdentifierIssuer14() {
        return otherProviderIdentifierIssuer14;
    }

    public void setOtherProviderIdentifierIssuer14(String otherProviderIdentifierIssuer14) {
        this.otherProviderIdentifierIssuer14 = otherProviderIdentifierIssuer14;
    }

    public String getOtherProviderIdentifier15() {
        return otherProviderIdentifier15;
    }

    public void setOtherProviderIdentifier15(String otherProviderIdentifier15) {
        this.otherProviderIdentifier15 = otherProviderIdentifier15;
    }

    public String getOtherProviderIdentifierTypeCode15() {
        return otherProviderIdentifierTypeCode15;
    }

    public void setOtherProviderIdentifierTypeCode15(String otherProviderIdentifierTypeCode15) {
        this.otherProviderIdentifierTypeCode15 = otherProviderIdentifierTypeCode15;
    }

    public String getOtherProviderIdentifierState15() {
        return otherProviderIdentifierState15;
    }

    public void setOtherProviderIdentifierState15(String otherProviderIdentifierState15) {
        this.otherProviderIdentifierState15 = otherProviderIdentifierState15;
    }

    public String getOtherProviderIdentifierIssuer15() {
        return otherProviderIdentifierIssuer15;
    }

    public void setOtherProviderIdentifierIssuer15(String otherProviderIdentifierIssuer15) {
        this.otherProviderIdentifierIssuer15 = otherProviderIdentifierIssuer15;
    }

    public String getOtherProviderIdentifier16() {
        return otherProviderIdentifier16;
    }

    public void setOtherProviderIdentifier16(String otherProviderIdentifier16) {
        this.otherProviderIdentifier16 = otherProviderIdentifier16;
    }

    public String getOtherProviderIdentifierTypeCode16() {
        return otherProviderIdentifierTypeCode16;
    }

    public void setOtherProviderIdentifierTypeCode16(String otherProviderIdentifierTypeCode16) {
        this.otherProviderIdentifierTypeCode16 = otherProviderIdentifierTypeCode16;
    }

    public String getOtherProviderIdentifierState16() {
        return otherProviderIdentifierState16;
    }

    public void setOtherProviderIdentifierState16(String otherProviderIdentifierState16) {
        this.otherProviderIdentifierState16 = otherProviderIdentifierState16;
    }

    public String getOtherProviderIdentifierIssuer16() {
        return otherProviderIdentifierIssuer16;
    }

    public void setOtherProviderIdentifierIssuer16(String otherProviderIdentifierIssuer16) {
        this.otherProviderIdentifierIssuer16 = otherProviderIdentifierIssuer16;
    }

    public String getOtherProviderIdentifier17() {
        return otherProviderIdentifier17;
    }

    public void setOtherProviderIdentifier17(String otherProviderIdentifier17) {
        this.otherProviderIdentifier17 = otherProviderIdentifier17;
    }

    public String getOtherProviderIdentifierTypeCode17() {
        return otherProviderIdentifierTypeCode17;
    }

    public void setOtherProviderIdentifierTypeCode17(String otherProviderIdentifierTypeCode17) {
        this.otherProviderIdentifierTypeCode17 = otherProviderIdentifierTypeCode17;
    }

    public String getOtherProviderIdentifierState17() {
        return otherProviderIdentifierState17;
    }

    public void setOtherProviderIdentifierState17(String otherProviderIdentifierState17) {
        this.otherProviderIdentifierState17 = otherProviderIdentifierState17;
    }

    public String getOtherProviderIdentifierIssuer17() {
        return otherProviderIdentifierIssuer17;
    }

    public void setOtherProviderIdentifierIssuer17(String otherProviderIdentifierIssuer17) {
        this.otherProviderIdentifierIssuer17 = otherProviderIdentifierIssuer17;
    }

    public String getOtherProviderIdentifier18() {
        return otherProviderIdentifier18;
    }

    public void setOtherProviderIdentifier18(String otherProviderIdentifier18) {
        this.otherProviderIdentifier18 = otherProviderIdentifier18;
    }

    public String getOtherProviderIdentifierTypeCode18() {
        return otherProviderIdentifierTypeCode18;
    }

    public void setOtherProviderIdentifierTypeCode18(String otherProviderIdentifierTypeCode18) {
        this.otherProviderIdentifierTypeCode18 = otherProviderIdentifierTypeCode18;
    }

    public String getOtherProviderIdentifierState18() {
        return otherProviderIdentifierState18;
    }

    public void setOtherProviderIdentifierState18(String otherProviderIdentifierState18) {
        this.otherProviderIdentifierState18 = otherProviderIdentifierState18;
    }

    public String getOtherProviderIdentifierIssuer18() {
        return otherProviderIdentifierIssuer18;
    }

    public void setOtherProviderIdentifierIssuer18(String otherProviderIdentifierIssuer18) {
        this.otherProviderIdentifierIssuer18 = otherProviderIdentifierIssuer18;
    }

    public String getOtherProviderIdentifier19() {
        return otherProviderIdentifier19;
    }

    public void setOtherProviderIdentifier19(String otherProviderIdentifier19) {
        this.otherProviderIdentifier19 = otherProviderIdentifier19;
    }

    public String getOtherProviderIdentifierTypeCode19() {
        return otherProviderIdentifierTypeCode19;
    }

    public void setOtherProviderIdentifierTypeCode19(String otherProviderIdentifierTypeCode19) {
        this.otherProviderIdentifierTypeCode19 = otherProviderIdentifierTypeCode19;
    }

    public String getOtherProviderIdentifierState19() {
        return otherProviderIdentifierState19;
    }

    public void setOtherProviderIdentifierState19(String otherProviderIdentifierState19) {
        this.otherProviderIdentifierState19 = otherProviderIdentifierState19;
    }

    public String getOtherProviderIdentifierIssuer19() {
        return otherProviderIdentifierIssuer19;
    }

    public void setOtherProviderIdentifierIssuer19(String otherProviderIdentifierIssuer19) {
        this.otherProviderIdentifierIssuer19 = otherProviderIdentifierIssuer19;
    }

    public String getOtherProviderIdentifier20() {
        return otherProviderIdentifier20;
    }

    public void setOtherProviderIdentifier20(String otherProviderIdentifier20) {
        this.otherProviderIdentifier20 = otherProviderIdentifier20;
    }

    public String getOtherProviderIdentifierTypeCode20() {
        return otherProviderIdentifierTypeCode20;
    }

    public void setOtherProviderIdentifierTypeCode20(String otherProviderIdentifierTypeCode20) {
        this.otherProviderIdentifierTypeCode20 = otherProviderIdentifierTypeCode20;
    }

    public String getOtherProviderIdentifierState20() {
        return otherProviderIdentifierState20;
    }

    public void setOtherProviderIdentifierState20(String otherProviderIdentifierState20) {
        this.otherProviderIdentifierState20 = otherProviderIdentifierState20;
    }

    public String getOtherProviderIdentifierIssuer20() {
        return otherProviderIdentifierIssuer20;
    }

    public void setOtherProviderIdentifierIssuer20(String otherProviderIdentifierIssuer20) {
        this.otherProviderIdentifierIssuer20 = otherProviderIdentifierIssuer20;
    }

    public String getOtherProviderIdentifier21() {
        return otherProviderIdentifier21;
    }

    public void setOtherProviderIdentifier21(String otherProviderIdentifier21) {
        this.otherProviderIdentifier21 = otherProviderIdentifier21;
    }

    public String getOtherProviderIdentifierTypeCode21() {
        return otherProviderIdentifierTypeCode21;
    }

    public void setOtherProviderIdentifierTypeCode21(String otherProviderIdentifierTypeCode21) {
        this.otherProviderIdentifierTypeCode21 = otherProviderIdentifierTypeCode21;
    }

    public String getOtherProviderIdentifierState21() {
        return otherProviderIdentifierState21;
    }

    public void setOtherProviderIdentifierState21(String otherProviderIdentifierState21) {
        this.otherProviderIdentifierState21 = otherProviderIdentifierState21;
    }

    public String getOtherProviderIdentifierIssuer21() {
        return otherProviderIdentifierIssuer21;
    }

    public void setOtherProviderIdentifierIssuer21(String otherProviderIdentifierIssuer21) {
        this.otherProviderIdentifierIssuer21 = otherProviderIdentifierIssuer21;
    }

    public String getOtherProviderIdentifier22() {
        return otherProviderIdentifier22;
    }

    public void setOtherProviderIdentifier22(String otherProviderIdentifier22) {
        this.otherProviderIdentifier22 = otherProviderIdentifier22;
    }

    public String getOtherProviderIdentifierTypeCode22() {
        return otherProviderIdentifierTypeCode22;
    }

    public void setOtherProviderIdentifierTypeCode22(String otherProviderIdentifierTypeCode22) {
        this.otherProviderIdentifierTypeCode22 = otherProviderIdentifierTypeCode22;
    }

    public String getOtherProviderIdentifierState22() {
        return otherProviderIdentifierState22;
    }

    public void setOtherProviderIdentifierState22(String otherProviderIdentifierState22) {
        this.otherProviderIdentifierState22 = otherProviderIdentifierState22;
    }

    public String getOtherProviderIdentifierIssuer22() {
        return otherProviderIdentifierIssuer22;
    }

    public void setOtherProviderIdentifierIssuer22(String otherProviderIdentifierIssuer22) {
        this.otherProviderIdentifierIssuer22 = otherProviderIdentifierIssuer22;
    }

    public String getOtherProviderIdentifier23() {
        return otherProviderIdentifier23;
    }

    public void setOtherProviderIdentifier23(String otherProviderIdentifier23) {
        this.otherProviderIdentifier23 = otherProviderIdentifier23;
    }

    public String getOtherProviderIdentifierTypeCode23() {
        return otherProviderIdentifierTypeCode23;
    }

    public void setOtherProviderIdentifierTypeCode23(String otherProviderIdentifierTypeCode23) {
        this.otherProviderIdentifierTypeCode23 = otherProviderIdentifierTypeCode23;
    }

    public String getOtherProviderIdentifierState23() {
        return otherProviderIdentifierState23;
    }

    public void setOtherProviderIdentifierState23(String otherProviderIdentifierState23) {
        this.otherProviderIdentifierState23 = otherProviderIdentifierState23;
    }

    public String getOtherProviderIdentifierIssuer23() {
        return otherProviderIdentifierIssuer23;
    }

    public void setOtherProviderIdentifierIssuer23(String otherProviderIdentifierIssuer23) {
        this.otherProviderIdentifierIssuer23 = otherProviderIdentifierIssuer23;
    }

    public String getOtherProviderIdentifier24() {
        return otherProviderIdentifier24;
    }

    public void setOtherProviderIdentifier24(String otherProviderIdentifier24) {
        this.otherProviderIdentifier24 = otherProviderIdentifier24;
    }

    public String getOtherProviderIdentifierTypeCode24() {
        return otherProviderIdentifierTypeCode24;
    }

    public void setOtherProviderIdentifierTypeCode24(String otherProviderIdentifierTypeCode24) {
        this.otherProviderIdentifierTypeCode24 = otherProviderIdentifierTypeCode24;
    }

    public String getOtherProviderIdentifierState24() {
        return otherProviderIdentifierState24;
    }

    public void setOtherProviderIdentifierState24(String otherProviderIdentifierState24) {
        this.otherProviderIdentifierState24 = otherProviderIdentifierState24;
    }

    public String getOtherProviderIdentifierIssuer24() {
        return otherProviderIdentifierIssuer24;
    }

    public void setOtherProviderIdentifierIssuer24(String otherProviderIdentifierIssuer24) {
        this.otherProviderIdentifierIssuer24 = otherProviderIdentifierIssuer24;
    }

    public String getOtherProviderIdentifier25() {
        return otherProviderIdentifier25;
    }

    public void setOtherProviderIdentifier25(String otherProviderIdentifier25) {
        this.otherProviderIdentifier25 = otherProviderIdentifier25;
    }

    public String getOtherProviderIdentifierTypeCode25() {
        return otherProviderIdentifierTypeCode25;
    }

    public void setOtherProviderIdentifierTypeCode25(String otherProviderIdentifierTypeCode25) {
        this.otherProviderIdentifierTypeCode25 = otherProviderIdentifierTypeCode25;
    }

    public String getOtherProviderIdentifierState25() {
        return otherProviderIdentifierState25;
    }

    public void setOtherProviderIdentifierState25(String otherProviderIdentifierState25) {
        this.otherProviderIdentifierState25 = otherProviderIdentifierState25;
    }

    public String getOtherProviderIdentifierIssuer25() {
        return otherProviderIdentifierIssuer25;
    }

    public void setOtherProviderIdentifierIssuer25(String otherProviderIdentifierIssuer25) {
        this.otherProviderIdentifierIssuer25 = otherProviderIdentifierIssuer25;
    }

    public String getOtherProviderIdentifier26() {
        return otherProviderIdentifier26;
    }

    public void setOtherProviderIdentifier26(String otherProviderIdentifier26) {
        this.otherProviderIdentifier26 = otherProviderIdentifier26;
    }

    public String getOtherProviderIdentifierTypeCode26() {
        return otherProviderIdentifierTypeCode26;
    }

    public void setOtherProviderIdentifierTypeCode26(String otherProviderIdentifierTypeCode26) {
        this.otherProviderIdentifierTypeCode26 = otherProviderIdentifierTypeCode26;
    }

    public String getOtherProviderIdentifierState26() {
        return otherProviderIdentifierState26;
    }

    public void setOtherProviderIdentifierState26(String otherProviderIdentifierState26) {
        this.otherProviderIdentifierState26 = otherProviderIdentifierState26;
    }

    public String getOtherProviderIdentifierIssuer26() {
        return otherProviderIdentifierIssuer26;
    }

    public void setOtherProviderIdentifierIssuer26(String otherProviderIdentifierIssuer26) {
        this.otherProviderIdentifierIssuer26 = otherProviderIdentifierIssuer26;
    }

    public String getOtherProviderIdentifier27() {
        return otherProviderIdentifier27;
    }

    public void setOtherProviderIdentifier27(String otherProviderIdentifier27) {
        this.otherProviderIdentifier27 = otherProviderIdentifier27;
    }

    public String getOtherProviderIdentifierTypeCode27() {
        return otherProviderIdentifierTypeCode27;
    }

    public void setOtherProviderIdentifierTypeCode27(String otherProviderIdentifierTypeCode27) {
        this.otherProviderIdentifierTypeCode27 = otherProviderIdentifierTypeCode27;
    }

    public String getOtherProviderIdentifierState27() {
        return otherProviderIdentifierState27;
    }

    public void setOtherProviderIdentifierState27(String otherProviderIdentifierState27) {
        this.otherProviderIdentifierState27 = otherProviderIdentifierState27;
    }

    public String getOtherProviderIdentifierIssuer27() {
        return otherProviderIdentifierIssuer27;
    }

    public void setOtherProviderIdentifierIssuer27(String otherProviderIdentifierIssuer27) {
        this.otherProviderIdentifierIssuer27 = otherProviderIdentifierIssuer27;
    }

    public String getOtherProviderIdentifier28() {
        return otherProviderIdentifier28;
    }

    public void setOtherProviderIdentifier28(String otherProviderIdentifier28) {
        this.otherProviderIdentifier28 = otherProviderIdentifier28;
    }

    public String getOtherProviderIdentifierTypeCode28() {
        return otherProviderIdentifierTypeCode28;
    }

    public void setOtherProviderIdentifierTypeCode28(String otherProviderIdentifierTypeCode28) {
        this.otherProviderIdentifierTypeCode28 = otherProviderIdentifierTypeCode28;
    }

    public String getOtherProviderIdentifierState28() {
        return otherProviderIdentifierState28;
    }

    public void setOtherProviderIdentifierState28(String otherProviderIdentifierState28) {
        this.otherProviderIdentifierState28 = otherProviderIdentifierState28;
    }

    public String getOtherProviderIdentifierIssuer28() {
        return otherProviderIdentifierIssuer28;
    }

    public void setOtherProviderIdentifierIssuer28(String otherProviderIdentifierIssuer28) {
        this.otherProviderIdentifierIssuer28 = otherProviderIdentifierIssuer28;
    }

    public String getOtherProviderIdentifier29() {
        return otherProviderIdentifier29;
    }

    public void setOtherProviderIdentifier29(String otherProviderIdentifier29) {
        this.otherProviderIdentifier29 = otherProviderIdentifier29;
    }

    public String getOtherProviderIdentifierTypeCode29() {
        return otherProviderIdentifierTypeCode29;
    }

    public void setOtherProviderIdentifierTypeCode29(String otherProviderIdentifierTypeCode29) {
        this.otherProviderIdentifierTypeCode29 = otherProviderIdentifierTypeCode29;
    }

    public String getOtherProviderIdentifierState29() {
        return otherProviderIdentifierState29;
    }

    public void setOtherProviderIdentifierState29(String otherProviderIdentifierState29) {
        this.otherProviderIdentifierState29 = otherProviderIdentifierState29;
    }

    public String getOtherProviderIdentifierIssuer29() {
        return otherProviderIdentifierIssuer29;
    }

    public void setOtherProviderIdentifierIssuer29(String otherProviderIdentifierIssuer29) {
        this.otherProviderIdentifierIssuer29 = otherProviderIdentifierIssuer29;
    }

    public String getOtherProviderIdentifier30() {
        return otherProviderIdentifier30;
    }

    public void setOtherProviderIdentifier30(String otherProviderIdentifier30) {
        this.otherProviderIdentifier30 = otherProviderIdentifier30;
    }

    public String getOtherProviderIdentifierTypeCode30() {
        return otherProviderIdentifierTypeCode30;
    }

    public void setOtherProviderIdentifierTypeCode30(String otherProviderIdentifierTypeCode30) {
        this.otherProviderIdentifierTypeCode30 = otherProviderIdentifierTypeCode30;
    }

    public String getOtherProviderIdentifierState30() {
        return otherProviderIdentifierState30;
    }

    public void setOtherProviderIdentifierState30(String otherProviderIdentifierState30) {
        this.otherProviderIdentifierState30 = otherProviderIdentifierState30;
    }

    public String getOtherProviderIdentifierIssuer30() {
        return otherProviderIdentifierIssuer30;
    }

    public void setOtherProviderIdentifierIssuer30(String otherProviderIdentifierIssuer30) {
        this.otherProviderIdentifierIssuer30 = otherProviderIdentifierIssuer30;
    }

    public String getOtherProviderIdentifier31() {
        return otherProviderIdentifier31;
    }

    public void setOtherProviderIdentifier31(String otherProviderIdentifier31) {
        this.otherProviderIdentifier31 = otherProviderIdentifier31;
    }

    public String getOtherProviderIdentifierTypeCode31() {
        return otherProviderIdentifierTypeCode31;
    }

    public void setOtherProviderIdentifierTypeCode31(String otherProviderIdentifierTypeCode31) {
        this.otherProviderIdentifierTypeCode31 = otherProviderIdentifierTypeCode31;
    }

    public String getOtherProviderIdentifierState31() {
        return otherProviderIdentifierState31;
    }

    public void setOtherProviderIdentifierState31(String otherProviderIdentifierState31) {
        this.otherProviderIdentifierState31 = otherProviderIdentifierState31;
    }

    public String getOtherProviderIdentifierIssuer31() {
        return otherProviderIdentifierIssuer31;
    }

    public void setOtherProviderIdentifierIssuer31(String otherProviderIdentifierIssuer31) {
        this.otherProviderIdentifierIssuer31 = otherProviderIdentifierIssuer31;
    }

    public String getOtherProviderIdentifier32() {
        return otherProviderIdentifier32;
    }

    public void setOtherProviderIdentifier32(String otherProviderIdentifier32) {
        this.otherProviderIdentifier32 = otherProviderIdentifier32;
    }

    public String getOtherProviderIdentifierTypeCode32() {
        return otherProviderIdentifierTypeCode32;
    }

    public void setOtherProviderIdentifierTypeCode32(String otherProviderIdentifierTypeCode32) {
        this.otherProviderIdentifierTypeCode32 = otherProviderIdentifierTypeCode32;
    }

    public String getOtherProviderIdentifierState32() {
        return otherProviderIdentifierState32;
    }

    public void setOtherProviderIdentifierState32(String otherProviderIdentifierState32) {
        this.otherProviderIdentifierState32 = otherProviderIdentifierState32;
    }

    public String getOtherProviderIdentifierIssuer32() {
        return otherProviderIdentifierIssuer32;
    }

    public void setOtherProviderIdentifierIssuer32(String otherProviderIdentifierIssuer32) {
        this.otherProviderIdentifierIssuer32 = otherProviderIdentifierIssuer32;
    }

    public String getOtherProviderIdentifier33() {
        return otherProviderIdentifier33;
    }

    public void setOtherProviderIdentifier33(String otherProviderIdentifier33) {
        this.otherProviderIdentifier33 = otherProviderIdentifier33;
    }

    public String getOtherProviderIdentifierTypeCode33() {
        return otherProviderIdentifierTypeCode33;
    }

    public void setOtherProviderIdentifierTypeCode33(String otherProviderIdentifierTypeCode33) {
        this.otherProviderIdentifierTypeCode33 = otherProviderIdentifierTypeCode33;
    }

    public String getOtherProviderIdentifierState33() {
        return otherProviderIdentifierState33;
    }

    public void setOtherProviderIdentifierState33(String otherProviderIdentifierState33) {
        this.otherProviderIdentifierState33 = otherProviderIdentifierState33;
    }

    public String getOtherProviderIdentifierIssuer33() {
        return otherProviderIdentifierIssuer33;
    }

    public void setOtherProviderIdentifierIssuer33(String otherProviderIdentifierIssuer33) {
        this.otherProviderIdentifierIssuer33 = otherProviderIdentifierIssuer33;
    }

    public String getOtherProviderIdentifier34() {
        return otherProviderIdentifier34;
    }

    public void setOtherProviderIdentifier34(String otherProviderIdentifier34) {
        this.otherProviderIdentifier34 = otherProviderIdentifier34;
    }

    public String getOtherProviderIdentifierTypeCode34() {
        return otherProviderIdentifierTypeCode34;
    }

    public void setOtherProviderIdentifierTypeCode34(String otherProviderIdentifierTypeCode34) {
        this.otherProviderIdentifierTypeCode34 = otherProviderIdentifierTypeCode34;
    }

    public String getOtherProviderIdentifierState34() {
        return otherProviderIdentifierState34;
    }

    public void setOtherProviderIdentifierState34(String otherProviderIdentifierState34) {
        this.otherProviderIdentifierState34 = otherProviderIdentifierState34;
    }

    public String getOtherProviderIdentifierIssuer34() {
        return otherProviderIdentifierIssuer34;
    }

    public void setOtherProviderIdentifierIssuer34(String otherProviderIdentifierIssuer34) {
        this.otherProviderIdentifierIssuer34 = otherProviderIdentifierIssuer34;
    }

    public String getOtherProviderIdentifier35() {
        return otherProviderIdentifier35;
    }

    public void setOtherProviderIdentifier35(String otherProviderIdentifier35) {
        this.otherProviderIdentifier35 = otherProviderIdentifier35;
    }

    public String getOtherProviderIdentifierTypeCode35() {
        return otherProviderIdentifierTypeCode35;
    }

    public void setOtherProviderIdentifierTypeCode35(String otherProviderIdentifierTypeCode35) {
        this.otherProviderIdentifierTypeCode35 = otherProviderIdentifierTypeCode35;
    }

    public String getOtherProviderIdentifierState35() {
        return otherProviderIdentifierState35;
    }

    public void setOtherProviderIdentifierState35(String otherProviderIdentifierState35) {
        this.otherProviderIdentifierState35 = otherProviderIdentifierState35;
    }

    public String getOtherProviderIdentifierIssuer35() {
        return otherProviderIdentifierIssuer35;
    }

    public void setOtherProviderIdentifierIssuer35(String otherProviderIdentifierIssuer35) {
        this.otherProviderIdentifierIssuer35 = otherProviderIdentifierIssuer35;
    }

    public String getOtherProviderIdentifier36() {
        return otherProviderIdentifier36;
    }

    public void setOtherProviderIdentifier36(String otherProviderIdentifier36) {
        this.otherProviderIdentifier36 = otherProviderIdentifier36;
    }

    public String getOtherProviderIdentifierTypeCode36() {
        return otherProviderIdentifierTypeCode36;
    }

    public void setOtherProviderIdentifierTypeCode36(String otherProviderIdentifierTypeCode36) {
        this.otherProviderIdentifierTypeCode36 = otherProviderIdentifierTypeCode36;
    }

    public String getOtherProviderIdentifierState36() {
        return otherProviderIdentifierState36;
    }

    public void setOtherProviderIdentifierState36(String otherProviderIdentifierState36) {
        this.otherProviderIdentifierState36 = otherProviderIdentifierState36;
    }

    public String getOtherProviderIdentifierIssuer36() {
        return otherProviderIdentifierIssuer36;
    }

    public void setOtherProviderIdentifierIssuer36(String otherProviderIdentifierIssuer36) {
        this.otherProviderIdentifierIssuer36 = otherProviderIdentifierIssuer36;
    }

    public String getOtherProviderIdentifier37() {
        return otherProviderIdentifier37;
    }

    public void setOtherProviderIdentifier37(String otherProviderIdentifier37) {
        this.otherProviderIdentifier37 = otherProviderIdentifier37;
    }

    public String getOtherProviderIdentifierTypeCode37() {
        return otherProviderIdentifierTypeCode37;
    }

    public void setOtherProviderIdentifierTypeCode37(String otherProviderIdentifierTypeCode37) {
        this.otherProviderIdentifierTypeCode37 = otherProviderIdentifierTypeCode37;
    }

    public String getOtherProviderIdentifierState37() {
        return otherProviderIdentifierState37;
    }

    public void setOtherProviderIdentifierState37(String otherProviderIdentifierState37) {
        this.otherProviderIdentifierState37 = otherProviderIdentifierState37;
    }

    public String getOtherProviderIdentifierIssuer37() {
        return otherProviderIdentifierIssuer37;
    }

    public void setOtherProviderIdentifierIssuer37(String otherProviderIdentifierIssuer37) {
        this.otherProviderIdentifierIssuer37 = otherProviderIdentifierIssuer37;
    }

    public String getOtherProviderIdentifier38() {
        return otherProviderIdentifier38;
    }

    public void setOtherProviderIdentifier38(String otherProviderIdentifier38) {
        this.otherProviderIdentifier38 = otherProviderIdentifier38;
    }

    public String getOtherProviderIdentifierTypeCode38() {
        return otherProviderIdentifierTypeCode38;
    }

    public void setOtherProviderIdentifierTypeCode38(String otherProviderIdentifierTypeCode38) {
        this.otherProviderIdentifierTypeCode38 = otherProviderIdentifierTypeCode38;
    }

    public String getOtherProviderIdentifierState38() {
        return otherProviderIdentifierState38;
    }

    public void setOtherProviderIdentifierState38(String otherProviderIdentifierState38) {
        this.otherProviderIdentifierState38 = otherProviderIdentifierState38;
    }

    public String getOtherProviderIdentifierIssuer38() {
        return otherProviderIdentifierIssuer38;
    }

    public void setOtherProviderIdentifierIssuer38(String otherProviderIdentifierIssuer38) {
        this.otherProviderIdentifierIssuer38 = otherProviderIdentifierIssuer38;
    }

    public String getOtherProviderIdentifier39() {
        return otherProviderIdentifier39;
    }

    public void setOtherProviderIdentifier39(String otherProviderIdentifier39) {
        this.otherProviderIdentifier39 = otherProviderIdentifier39;
    }

    public String getOtherProviderIdentifierTypeCode39() {
        return otherProviderIdentifierTypeCode39;
    }

    public void setOtherProviderIdentifierTypeCode39(String otherProviderIdentifierTypeCode39) {
        this.otherProviderIdentifierTypeCode39 = otherProviderIdentifierTypeCode39;
    }

    public String getOtherProviderIdentifierState39() {
        return otherProviderIdentifierState39;
    }

    public void setOtherProviderIdentifierState39(String otherProviderIdentifierState39) {
        this.otherProviderIdentifierState39 = otherProviderIdentifierState39;
    }

    public String getOtherProviderIdentifierIssuer39() {
        return otherProviderIdentifierIssuer39;
    }

    public void setOtherProviderIdentifierIssuer39(String otherProviderIdentifierIssuer39) {
        this.otherProviderIdentifierIssuer39 = otherProviderIdentifierIssuer39;
    }

    public String getOtherProviderIdentifier40() {
        return otherProviderIdentifier40;
    }

    public void setOtherProviderIdentifier40(String otherProviderIdentifier40) {
        this.otherProviderIdentifier40 = otherProviderIdentifier40;
    }

    public String getOtherProviderIdentifierTypeCode40() {
        return otherProviderIdentifierTypeCode40;
    }

    public void setOtherProviderIdentifierTypeCode40(String otherProviderIdentifierTypeCode40) {
        this.otherProviderIdentifierTypeCode40 = otherProviderIdentifierTypeCode40;
    }

    public String getOtherProviderIdentifierState40() {
        return otherProviderIdentifierState40;
    }

    public void setOtherProviderIdentifierState40(String otherProviderIdentifierState40) {
        this.otherProviderIdentifierState40 = otherProviderIdentifierState40;
    }

    public String getOtherProviderIdentifierIssuer40() {
        return otherProviderIdentifierIssuer40;
    }

    public void setOtherProviderIdentifierIssuer40(String otherProviderIdentifierIssuer40) {
        this.otherProviderIdentifierIssuer40 = otherProviderIdentifierIssuer40;
    }

    public String getOtherProviderIdentifier41() {
        return otherProviderIdentifier41;
    }

    public void setOtherProviderIdentifier41(String otherProviderIdentifier41) {
        this.otherProviderIdentifier41 = otherProviderIdentifier41;
    }

    public String getOtherProviderIdentifierTypeCode41() {
        return otherProviderIdentifierTypeCode41;
    }

    public void setOtherProviderIdentifierTypeCode41(String otherProviderIdentifierTypeCode41) {
        this.otherProviderIdentifierTypeCode41 = otherProviderIdentifierTypeCode41;
    }

    public String getOtherProviderIdentifierState41() {
        return otherProviderIdentifierState41;
    }

    public void setOtherProviderIdentifierState41(String otherProviderIdentifierState41) {
        this.otherProviderIdentifierState41 = otherProviderIdentifierState41;
    }

    public String getOtherProviderIdentifierIssuer41() {
        return otherProviderIdentifierIssuer41;
    }

    public void setOtherProviderIdentifierIssuer41(String otherProviderIdentifierIssuer41) {
        this.otherProviderIdentifierIssuer41 = otherProviderIdentifierIssuer41;
    }

    public String getOtherProviderIdentifier42() {
        return otherProviderIdentifier42;
    }

    public void setOtherProviderIdentifier42(String otherProviderIdentifier42) {
        this.otherProviderIdentifier42 = otherProviderIdentifier42;
    }

    public String getOtherProviderIdentifierTypeCode42() {
        return otherProviderIdentifierTypeCode42;
    }

    public void setOtherProviderIdentifierTypeCode42(String otherProviderIdentifierTypeCode42) {
        this.otherProviderIdentifierTypeCode42 = otherProviderIdentifierTypeCode42;
    }

    public String getOtherProviderIdentifierState42() {
        return otherProviderIdentifierState42;
    }

    public void setOtherProviderIdentifierState42(String otherProviderIdentifierState42) {
        this.otherProviderIdentifierState42 = otherProviderIdentifierState42;
    }

    public String getOtherProviderIdentifierIssuer42() {
        return otherProviderIdentifierIssuer42;
    }

    public void setOtherProviderIdentifierIssuer42(String otherProviderIdentifierIssuer42) {
        this.otherProviderIdentifierIssuer42 = otherProviderIdentifierIssuer42;
    }

    public String getOtherProviderIdentifier43() {
        return otherProviderIdentifier43;
    }

    public void setOtherProviderIdentifier43(String otherProviderIdentifier43) {
        this.otherProviderIdentifier43 = otherProviderIdentifier43;
    }

    public String getOtherProviderIdentifierTypeCode43() {
        return otherProviderIdentifierTypeCode43;
    }

    public void setOtherProviderIdentifierTypeCode43(String otherProviderIdentifierTypeCode43) {
        this.otherProviderIdentifierTypeCode43 = otherProviderIdentifierTypeCode43;
    }

    public String getOtherProviderIdentifierState43() {
        return otherProviderIdentifierState43;
    }

    public void setOtherProviderIdentifierState43(String otherProviderIdentifierState43) {
        this.otherProviderIdentifierState43 = otherProviderIdentifierState43;
    }

    public String getOtherProviderIdentifierIssuer43() {
        return otherProviderIdentifierIssuer43;
    }

    public void setOtherProviderIdentifierIssuer43(String otherProviderIdentifierIssuer43) {
        this.otherProviderIdentifierIssuer43 = otherProviderIdentifierIssuer43;
    }

    public String getOtherProviderIdentifier44() {
        return otherProviderIdentifier44;
    }

    public void setOtherProviderIdentifier44(String otherProviderIdentifier44) {
        this.otherProviderIdentifier44 = otherProviderIdentifier44;
    }

    public String getOtherProviderIdentifierTypeCode44() {
        return otherProviderIdentifierTypeCode44;
    }

    public void setOtherProviderIdentifierTypeCode44(String otherProviderIdentifierTypeCode44) {
        this.otherProviderIdentifierTypeCode44 = otherProviderIdentifierTypeCode44;
    }

    public String getOtherProviderIdentifierState44() {
        return otherProviderIdentifierState44;
    }

    public void setOtherProviderIdentifierState44(String otherProviderIdentifierState44) {
        this.otherProviderIdentifierState44 = otherProviderIdentifierState44;
    }

    public String getOtherProviderIdentifierIssuer44() {
        return otherProviderIdentifierIssuer44;
    }

    public void setOtherProviderIdentifierIssuer44(String otherProviderIdentifierIssuer44) {
        this.otherProviderIdentifierIssuer44 = otherProviderIdentifierIssuer44;
    }

    public String getOtherProviderIdentifier45() {
        return otherProviderIdentifier45;
    }

    public void setOtherProviderIdentifier45(String otherProviderIdentifier45) {
        this.otherProviderIdentifier45 = otherProviderIdentifier45;
    }

    public String getOtherProviderIdentifierTypeCode45() {
        return otherProviderIdentifierTypeCode45;
    }

    public void setOtherProviderIdentifierTypeCode45(String otherProviderIdentifierTypeCode45) {
        this.otherProviderIdentifierTypeCode45 = otherProviderIdentifierTypeCode45;
    }

    public String getOtherProviderIdentifierState45() {
        return otherProviderIdentifierState45;
    }

    public void setOtherProviderIdentifierState45(String otherProviderIdentifierState45) {
        this.otherProviderIdentifierState45 = otherProviderIdentifierState45;
    }

    public String getOtherProviderIdentifierIssuer45() {
        return otherProviderIdentifierIssuer45;
    }

    public void setOtherProviderIdentifierIssuer45(String otherProviderIdentifierIssuer45) {
        this.otherProviderIdentifierIssuer45 = otherProviderIdentifierIssuer45;
    }

    public String getOtherProviderIdentifier46() {
        return otherProviderIdentifier46;
    }

    public void setOtherProviderIdentifier46(String otherProviderIdentifier46) {
        this.otherProviderIdentifier46 = otherProviderIdentifier46;
    }

    public String getOtherProviderIdentifierTypeCode46() {
        return otherProviderIdentifierTypeCode46;
    }

    public void setOtherProviderIdentifierTypeCode46(String otherProviderIdentifierTypeCode46) {
        this.otherProviderIdentifierTypeCode46 = otherProviderIdentifierTypeCode46;
    }

    public String getOtherProviderIdentifierState46() {
        return otherProviderIdentifierState46;
    }

    public void setOtherProviderIdentifierState46(String otherProviderIdentifierState46) {
        this.otherProviderIdentifierState46 = otherProviderIdentifierState46;
    }

    public String getOtherProviderIdentifierIssuer46() {
        return otherProviderIdentifierIssuer46;
    }

    public void setOtherProviderIdentifierIssuer46(String otherProviderIdentifierIssuer46) {
        this.otherProviderIdentifierIssuer46 = otherProviderIdentifierIssuer46;
    }

    public String getOtherProviderIdentifier47() {
        return otherProviderIdentifier47;
    }

    public void setOtherProviderIdentifier47(String otherProviderIdentifier47) {
        this.otherProviderIdentifier47 = otherProviderIdentifier47;
    }

    public String getOtherProviderIdentifierTypeCode47() {
        return otherProviderIdentifierTypeCode47;
    }

    public void setOtherProviderIdentifierTypeCode47(String otherProviderIdentifierTypeCode47) {
        this.otherProviderIdentifierTypeCode47 = otherProviderIdentifierTypeCode47;
    }

    public String getOtherProviderIdentifierState47() {
        return otherProviderIdentifierState47;
    }

    public void setOtherProviderIdentifierState47(String otherProviderIdentifierState47) {
        this.otherProviderIdentifierState47 = otherProviderIdentifierState47;
    }

    public String getOtherProviderIdentifierIssuer47() {
        return otherProviderIdentifierIssuer47;
    }

    public void setOtherProviderIdentifierIssuer47(String otherProviderIdentifierIssuer47) {
        this.otherProviderIdentifierIssuer47 = otherProviderIdentifierIssuer47;
    }

    public String getOtherProviderIdentifier48() {
        return otherProviderIdentifier48;
    }

    public void setOtherProviderIdentifier48(String otherProviderIdentifier48) {
        this.otherProviderIdentifier48 = otherProviderIdentifier48;
    }

    public String getOtherProviderIdentifierTypeCode48() {
        return otherProviderIdentifierTypeCode48;
    }

    public void setOtherProviderIdentifierTypeCode48(String otherProviderIdentifierTypeCode48) {
        this.otherProviderIdentifierTypeCode48 = otherProviderIdentifierTypeCode48;
    }

    public String getOtherProviderIdentifierState48() {
        return otherProviderIdentifierState48;
    }

    public void setOtherProviderIdentifierState48(String otherProviderIdentifierState48) {
        this.otherProviderIdentifierState48 = otherProviderIdentifierState48;
    }

    public String getOtherProviderIdentifierIssuer48() {
        return otherProviderIdentifierIssuer48;
    }

    public void setOtherProviderIdentifierIssuer48(String otherProviderIdentifierIssuer48) {
        this.otherProviderIdentifierIssuer48 = otherProviderIdentifierIssuer48;
    }

    public String getOtherProviderIdentifier49() {
        return otherProviderIdentifier49;
    }

    public void setOtherProviderIdentifier49(String otherProviderIdentifier49) {
        this.otherProviderIdentifier49 = otherProviderIdentifier49;
    }

    public String getOtherProviderIdentifierTypeCode49() {
        return otherProviderIdentifierTypeCode49;
    }

    public void setOtherProviderIdentifierTypeCode49(String otherProviderIdentifierTypeCode49) {
        this.otherProviderIdentifierTypeCode49 = otherProviderIdentifierTypeCode49;
    }

    public String getOtherProviderIdentifierState49() {
        return otherProviderIdentifierState49;
    }

    public void setOtherProviderIdentifierState49(String otherProviderIdentifierState49) {
        this.otherProviderIdentifierState49 = otherProviderIdentifierState49;
    }

    public String getOtherProviderIdentifierIssuer49() {
        return otherProviderIdentifierIssuer49;
    }

    public void setOtherProviderIdentifierIssuer49(String otherProviderIdentifierIssuer49) {
        this.otherProviderIdentifierIssuer49 = otherProviderIdentifierIssuer49;
    }

    public String getOtherProviderIdentifier50() {
        return otherProviderIdentifier50;
    }

    public void setOtherProviderIdentifier50(String otherProviderIdentifier50) {
        this.otherProviderIdentifier50 = otherProviderIdentifier50;
    }

    public String getOtherProviderIdentifierTypeCode50() {
        return otherProviderIdentifierTypeCode50;
    }

    public void setOtherProviderIdentifierTypeCode50(String otherProviderIdentifierTypeCode50) {
        this.otherProviderIdentifierTypeCode50 = otherProviderIdentifierTypeCode50;
    }

    public String getOtherProviderIdentifierState50() {
        return otherProviderIdentifierState50;
    }

    public void setOtherProviderIdentifierState50(String otherProviderIdentifierState50) {
        this.otherProviderIdentifierState50 = otherProviderIdentifierState50;
    }

    public String getOtherProviderIdentifierIssuer50() {
        return otherProviderIdentifierIssuer50;
    }

    public void setOtherProviderIdentifierIssuer50(String otherProviderIdentifierIssuer50) {
        this.otherProviderIdentifierIssuer50 = otherProviderIdentifierIssuer50;
    }

    public String getSoleProprietorFlag() {
        return soleProprietorFlag;
    }

    public void setSoleProprietorFlag(String soleProprietorFlag) {
        this.soleProprietorFlag = soleProprietorFlag;
    }

    public String getOrganizationSubpartFlag() {
        return organizationSubpartFlag;
    }

    public void setOrganizationSubpartFlag(String organizationSubpartFlag) {
        this.organizationSubpartFlag = organizationSubpartFlag;
    }

    public String getParentOrganizationLegalBusinessName() {
        return parentOrganizationLegalBusinessName;
    }

    public void setParentOrganizationLegalBusinessName(String parentOrganizationLegalBusinessName) {
        this.parentOrganizationLegalBusinessName = parentOrganizationLegalBusinessName;
    }

    public String getParentOrganizationTin() {
        return parentOrganizationTin;
    }

    public void setParentOrganizationTin(String parentOrganizationTin) {
        this.parentOrganizationTin = parentOrganizationTin;
    }

    public String getAuthorizedOfficialNamePrefixText() {
        return authorizedOfficialNamePrefixText;
    }

    public void setAuthorizedOfficialNamePrefixText(String authorizedOfficialNamePrefixText) {
        this.authorizedOfficialNamePrefixText = authorizedOfficialNamePrefixText;
    }

    public String getAuthorizedOfficialNameSuffixText() {
        return authorizedOfficialNameSuffixText;
    }

    public void setAuthorizedOfficialNameSuffixText(String authorizedOfficialNameSuffixText) {
        this.authorizedOfficialNameSuffixText = authorizedOfficialNameSuffixText;
    }

    public String getAuthorizedOfficialCredentialText() {
        return authorizedOfficialCredentialText;
    }

    public void setAuthorizedOfficialCredentialText(String authorizedOfficialCredentialText) {
        this.authorizedOfficialCredentialText = authorizedOfficialCredentialText;
    }

    public String getHealthcareProviderTaxonomyGroup1() {
        return healthcareProviderTaxonomyGroup1;
    }

    public void setHealthcareProviderTaxonomyGroup1(String healthcareProviderTaxonomyGroup1) {
        this.healthcareProviderTaxonomyGroup1 = healthcareProviderTaxonomyGroup1;
    }

    public String getHealthcareProviderTaxonomyGroup2() {
        return healthcareProviderTaxonomyGroup2;
    }

    public void setHealthcareProviderTaxonomyGroup2(String healthcareProviderTaxonomyGroup2) {
        this.healthcareProviderTaxonomyGroup2 = healthcareProviderTaxonomyGroup2;
    }

    public String getHealthcareProviderTaxonomyGroup3() {
        return healthcareProviderTaxonomyGroup3;
    }

    public void setHealthcareProviderTaxonomyGroup3(String healthcareProviderTaxonomyGroup3) {
        this.healthcareProviderTaxonomyGroup3 = healthcareProviderTaxonomyGroup3;
    }

    public String getHealthcareProviderTaxonomyGroup4() {
        return healthcareProviderTaxonomyGroup4;
    }

    public void setHealthcareProviderTaxonomyGroup4(String healthcareProviderTaxonomyGroup4) {
        this.healthcareProviderTaxonomyGroup4 = healthcareProviderTaxonomyGroup4;
    }

    public String getHealthcareProviderTaxonomyGroup5() {
        return healthcareProviderTaxonomyGroup5;
    }

    public void setHealthcareProviderTaxonomyGroup5(String healthcareProviderTaxonomyGroup5) {
        this.healthcareProviderTaxonomyGroup5 = healthcareProviderTaxonomyGroup5;
    }

    public String getHealthcareProviderTaxonomyGroup6() {
        return healthcareProviderTaxonomyGroup6;
    }

    public void setHealthcareProviderTaxonomyGroup6(String healthcareProviderTaxonomyGroup6) {
        this.healthcareProviderTaxonomyGroup6 = healthcareProviderTaxonomyGroup6;
    }

    public String getHealthcareProviderTaxonomyGroup7() {
        return healthcareProviderTaxonomyGroup7;
    }

    public void setHealthcareProviderTaxonomyGroup7(String healthcareProviderTaxonomyGroup7) {
        this.healthcareProviderTaxonomyGroup7 = healthcareProviderTaxonomyGroup7;
    }

    public String getHealthcareProviderTaxonomyGroup8() {
        return healthcareProviderTaxonomyGroup8;
    }

    public void setHealthcareProviderTaxonomyGroup8(String healthcareProviderTaxonomyGroup8) {
        this.healthcareProviderTaxonomyGroup8 = healthcareProviderTaxonomyGroup8;
    }

    public String getHealthcareProviderTaxonomyGroup9() {
        return healthcareProviderTaxonomyGroup9;
    }

    public void setHealthcareProviderTaxonomyGroup9(String healthcareProviderTaxonomyGroup9) {
        this.healthcareProviderTaxonomyGroup9 = healthcareProviderTaxonomyGroup9;
    }

    public String getHealthcareProviderTaxonomyGroup10() {
        return healthcareProviderTaxonomyGroup10;
    }

    public void setHealthcareProviderTaxonomyGroup10(String healthcareProviderTaxonomyGroup10) {
        this.healthcareProviderTaxonomyGroup10 = healthcareProviderTaxonomyGroup10;
    }

    public String getHealthcareProviderTaxonomyGroup11() {
        return healthcareProviderTaxonomyGroup11;
    }

    public void setHealthcareProviderTaxonomyGroup11(String healthcareProviderTaxonomyGroup11) {
        this.healthcareProviderTaxonomyGroup11 = healthcareProviderTaxonomyGroup11;
    }

    public String getHealthcareProviderTaxonomyGroup12() {
        return healthcareProviderTaxonomyGroup12;
    }

    public void setHealthcareProviderTaxonomyGroup12(String healthcareProviderTaxonomyGroup12) {
        this.healthcareProviderTaxonomyGroup12 = healthcareProviderTaxonomyGroup12;
    }

    public String getHealthcareProviderTaxonomyGroup13() {
        return healthcareProviderTaxonomyGroup13;
    }

    public void setHealthcareProviderTaxonomyGroup13(String healthcareProviderTaxonomyGroup13) {
        this.healthcareProviderTaxonomyGroup13 = healthcareProviderTaxonomyGroup13;
    }

    public String getHealthcareProviderTaxonomyGroup14() {
        return healthcareProviderTaxonomyGroup14;
    }

    public void setHealthcareProviderTaxonomyGroup14(String healthcareProviderTaxonomyGroup14) {
        this.healthcareProviderTaxonomyGroup14 = healthcareProviderTaxonomyGroup14;
    }

    public String getHealthcareProviderTaxonomyGroup15() {
        return healthcareProviderTaxonomyGroup15;
    }

    public void setHealthcareProviderTaxonomyGroup15(String healthcareProviderTaxonomyGroup15) {
        this.healthcareProviderTaxonomyGroup15 = healthcareProviderTaxonomyGroup15;
    }
}
