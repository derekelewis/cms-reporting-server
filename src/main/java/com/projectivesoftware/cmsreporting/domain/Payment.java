/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Payment implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_record_id_seq")
    @SequenceGenerator(name = "payment_record_id_seq", sequenceName = "payment_record_id_seq", allocationSize = 1)
    private Long recordId;

    @ManyToOne
    @JoinColumn(name = "npi", nullable = false)
    private Provider provider;

    private Long ccn;

    private String stageNumber;

    private String programYear;

    @Column(columnDefinition = "NUMBER(9, 2)")
    @Basic
    private Double paymentAmount;

    public Payment() {

    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
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

    public String getStageNumber() {
        return stageNumber;
    }

    public void setStageNumber(String stageNumber) {
        this.stageNumber = stageNumber;
    }

    public String getProgramYear() {
        return programYear;
    }

    public void setProgramYear(String programYear) {
        this.programYear = programYear;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
