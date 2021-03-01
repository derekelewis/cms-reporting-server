/*
 * Copyright (c) Derek Lewis <derek.e.lewis@outlook.com>, 2021
 */

package com.projectivesoftware.cmsreporting.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class HospitalOperatorFacilityMapping implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_operator_facility_mapping_id_seq")
    @SequenceGenerator(name = "hospital_operator_facility_mapping_id_seq", sequenceName = "hospital_operator_facility_mapping_id_seq", allocationSize = 1)
    private Long hospitalOperatorFacilityMappingId;

    @ManyToOne
    @JoinColumn(name = "npi")
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "hospital_operator_id")
    private HospitalOperator hospitalOperator;

    public HospitalOperatorFacilityMapping() {

    }

    public Long getHospitalOperatorFacilityMappingId() {
        return hospitalOperatorFacilityMappingId;
    }

    public void setHospitalOperatorFacilityMappingId(Long hospitalOperatorFacilityMappingId) {
        this.hospitalOperatorFacilityMappingId = hospitalOperatorFacilityMappingId;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public HospitalOperator getHospitalOperator() {
        return hospitalOperator;
    }

    public void setHospitalOperator(HospitalOperator hospitalOperator) {
        this.hospitalOperator = hospitalOperator;
    }
}
