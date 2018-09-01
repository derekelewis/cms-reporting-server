/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class HospitalOperator implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_operator_id_seq")
    @SequenceGenerator(name = "hospital_operator_id_seq", sequenceName = "hospital_operator_id_seq", allocationSize = 1)
    private Long hospitalOperatorId;

    private String hospitalOperatorName;

    private Boolean isForProfit = false;

    public HospitalOperator() {

    }

    public Long getHospitalOperatorId() {
        return hospitalOperatorId;
    }

    public void setHospitalOperatorId(Long hospitalOperatorId) {
        this.hospitalOperatorId = hospitalOperatorId;
    }

    public String getHospitalOperatorName() {
        return hospitalOperatorName;
    }

    public void setHospitalOperatorName(String hospitalOperatorName) {
        this.hospitalOperatorName = hospitalOperatorName;
    }

    public Boolean getForProfit() {
        return isForProfit;
    }

    public void setForProfit(Boolean forProfit) {
        isForProfit = forProfit;
    }
}
