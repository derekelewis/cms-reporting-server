CREATE TABLE BATCH_JOB_INSTANCE (
  JOB_INSTANCE_ID NUMBER(19, 0) NOT NULL PRIMARY KEY,
  VERSION         NUMBER(19, 0),
  JOB_NAME        VARCHAR2(100) NOT NULL,
  JOB_KEY         VARCHAR2(32)  NOT NULL,
  CONSTRAINT JOB_INST_UN UNIQUE (JOB_NAME, JOB_KEY)
);

CREATE TABLE BATCH_JOB_EXECUTION (
  JOB_EXECUTION_ID           NUMBER(19, 0) NOT NULL PRIMARY KEY,
  VERSION                    NUMBER(19, 0),
  JOB_INSTANCE_ID            NUMBER(19, 0) NOT NULL,
  CREATE_TIME                TIMESTAMP     NOT NULL,
  START_TIME                 TIMESTAMP DEFAULT NULL,
  END_TIME                   TIMESTAMP DEFAULT NULL,
  STATUS                     VARCHAR2(10),
  EXIT_CODE                  VARCHAR2(2500),
  EXIT_MESSAGE               VARCHAR2(2500),
  LAST_UPDATED               TIMESTAMP,
  JOB_CONFIGURATION_LOCATION VARCHAR(2500) NULL,
  CONSTRAINT JOB_INST_EXEC_FK FOREIGN KEY (JOB_INSTANCE_ID)
  REFERENCES BATCH_JOB_INSTANCE (JOB_INSTANCE_ID)
);

CREATE TABLE BATCH_JOB_EXECUTION_PARAMS (
  JOB_EXECUTION_ID NUMBER(19, 0) NOT NULL,
  TYPE_CD          VARCHAR2(6)   NOT NULL,
  KEY_NAME         VARCHAR2(100) NOT NULL,
  STRING_VAL       VARCHAR2(250),
  DATE_VAL         TIMESTAMP DEFAULT NULL,
  LONG_VAL         NUMBER(19, 0),
  DOUBLE_VAL       NUMBER,
  IDENTIFYING      CHAR(1)       NOT NULL,
  CONSTRAINT JOB_EXEC_PARAMS_FK FOREIGN KEY (JOB_EXECUTION_ID)
  REFERENCES BATCH_JOB_EXECUTION (JOB_EXECUTION_ID)
);

CREATE TABLE BATCH_STEP_EXECUTION (
  STEP_EXECUTION_ID  NUMBER(19, 0) NOT NULL PRIMARY KEY,
  VERSION            NUMBER(19, 0) NOT NULL,
  STEP_NAME          VARCHAR2(100) NOT NULL,
  JOB_EXECUTION_ID   NUMBER(19, 0) NOT NULL,
  START_TIME         TIMESTAMP     NOT NULL,
  END_TIME           TIMESTAMP DEFAULT NULL,
  STATUS             VARCHAR2(10),
  COMMIT_COUNT       NUMBER(19, 0),
  READ_COUNT         NUMBER(19, 0),
  FILTER_COUNT       NUMBER(19, 0),
  WRITE_COUNT        NUMBER(19, 0),
  READ_SKIP_COUNT    NUMBER(19, 0),
  WRITE_SKIP_COUNT   NUMBER(19, 0),
  PROCESS_SKIP_COUNT NUMBER(19, 0),
  ROLLBACK_COUNT     NUMBER(19, 0),
  EXIT_CODE          VARCHAR2(2500),
  EXIT_MESSAGE       VARCHAR2(2500),
  LAST_UPDATED       TIMESTAMP,
  CONSTRAINT JOB_EXEC_STEP_FK FOREIGN KEY (JOB_EXECUTION_ID)
  REFERENCES BATCH_JOB_EXECUTION (JOB_EXECUTION_ID)
);

CREATE TABLE BATCH_STEP_EXECUTION_CONTEXT (
  STEP_EXECUTION_ID  NUMBER(19, 0)  NOT NULL PRIMARY KEY,
  SHORT_CONTEXT      VARCHAR2(2500) NOT NULL,
  SERIALIZED_CONTEXT CLOB,
  CONSTRAINT STEP_EXEC_CTX_FK FOREIGN KEY (STEP_EXECUTION_ID)
  REFERENCES BATCH_STEP_EXECUTION (STEP_EXECUTION_ID)
);

CREATE TABLE BATCH_JOB_EXECUTION_CONTEXT (
  JOB_EXECUTION_ID   NUMBER(19, 0)  NOT NULL PRIMARY KEY,
  SHORT_CONTEXT      VARCHAR2(2500) NOT NULL,
  SERIALIZED_CONTEXT CLOB,
  CONSTRAINT JOB_EXEC_CTX_FK FOREIGN KEY (JOB_EXECUTION_ID)
  REFERENCES BATCH_JOB_EXECUTION (JOB_EXECUTION_ID)
);

CREATE SEQUENCE BATCH_STEP_EXECUTION_SEQ START WITH 0 MINVALUE 0 MAXVALUE 9223372036854775807 NOCYCLE;

CREATE SEQUENCE BATCH_JOB_EXECUTION_SEQ START WITH 0 MINVALUE 0 MAXVALUE 9223372036854775807 NOCYCLE;

CREATE SEQUENCE BATCH_JOB_SEQ START WITH 0 MINVALUE 0 MAXVALUE 9223372036854775807 NOCYCLE;

CREATE INDEX batch_job_execution_idx1
  ON batch_job_execution (job_instance_id, job_execution_id);

CREATE INDEX batch_step_execution_idx1
  ON batch_step_execution (job_execution_id, step_execution_id);

CREATE INDEX batch_job_execution_params_idx1
  ON batch_job_execution_params (job_execution_id, identifying, double_val, long_val, date_val, string_val, type_cd, key_name);

CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE attestation_record_id_seq START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE payment_record_id_seq START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE hospital_operator_id_seq START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE hospital_operator_facility_mapping_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE attestation (
  record_id                  NUMBER(19, 0) NOT NULL,
  attestation_id             NUMBER(19, 0),
  attestation_month          VARCHAR2(255 CHAR),
  attestation_year           VARCHAR2(255 CHAR),
  business_state_territory   VARCHAR2(255 CHAR),
  ccn                        NUMBER(19, 0),
  certification_number       VARCHAR2(255 CHAR),
  chp_id                     VARCHAR2(255 CHAR),
  payment_year               VARCHAR2(255 CHAR),
  product_certification_year VARCHAR2(255 CHAR),
  product_classification     VARCHAR2(255 CHAR),
  product_name               VARCHAR2(255 CHAR),
  product_setting            VARCHAR2(255 CHAR),
  product_version            VARCHAR2(255 CHAR),
  program_type               VARCHAR2(255 CHAR),
  program_year               VARCHAR2(255 CHAR),
  provider_stage_number      VARCHAR2(255 CHAR),
  provider_type              VARCHAR2(255 CHAR),
  specialty                  VARCHAR2(255 CHAR),
  vendor_name                VARCHAR2(255 CHAR),
  npi                        NUMBER(19, 0) NOT NULL,
  PRIMARY KEY (record_id)
);

CREATE TABLE provider (
  npi                                                          NUMBER(19, 0) NOT NULL,
  authorized_official_credential_text                          VARCHAR2(255 CHAR),
  authorized_official_first_name                               VARCHAR2(255 CHAR),
  authorized_official_last_name                                VARCHAR2(255 CHAR),
  authorized_official_middle_name                              VARCHAR2(255 CHAR),
  authorized_official_name_prefix_text                         VARCHAR2(255 CHAR),
  authorized_official_name_suffix_text                         VARCHAR2(255 CHAR),
  authorized_official_telephone_number                         VARCHAR2(255 CHAR),
  authorized_official_title                                    VARCHAR2(255 CHAR),
  deactivation_date                                            DATE,
  employer_identification_number                               VARCHAR2(255 CHAR),
  entity_type_code                                             NUMBER(10, 0),
  healthcare_provider_primary_taxonomy_switch1                 VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch10                VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch11                VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch12                VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch13                VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch14                VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch15                VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch2                 VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch3                 VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch4                 VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch5                 VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch6                 VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch7                 VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch8                 VARCHAR2(255 CHAR),
  healthcare_provider_primary_taxonomy_switch9                 VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code1                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code10                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code11                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code12                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code13                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code14                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code15                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code2                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code3                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code4                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code5                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code6                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code7                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code8                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_code9                           VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group1                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group10                         VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group11                         VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group12                         VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group13                         VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group14                         VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group15                         VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group2                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group3                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group4                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group5                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group6                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group7                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group8                          VARCHAR2(255 CHAR),
  healthcare_provider_taxonomy_group9                          VARCHAR2(255 CHAR),
  last_update_date                                             DATE,
  npi_deactivation_reason_code                                 VARCHAR2(255 CHAR),
  organization_subpart_flag                                    VARCHAR2(255 CHAR),
  other_provider_identifier1                                   VARCHAR2(255 CHAR),
  other_provider_identifier10                                  VARCHAR2(255 CHAR),
  other_provider_identifier11                                  VARCHAR2(255 CHAR),
  other_provider_identifier12                                  VARCHAR2(255 CHAR),
  other_provider_identifier13                                  VARCHAR2(255 CHAR),
  other_provider_identifier14                                  VARCHAR2(255 CHAR),
  other_provider_identifier15                                  VARCHAR2(255 CHAR),
  other_provider_identifier16                                  VARCHAR2(255 CHAR),
  other_provider_identifier17                                  VARCHAR2(255 CHAR),
  other_provider_identifier18                                  VARCHAR2(255 CHAR),
  other_provider_identifier19                                  VARCHAR2(255 CHAR),
  other_provider_identifier2                                   VARCHAR2(255 CHAR),
  other_provider_identifier20                                  VARCHAR2(255 CHAR),
  other_provider_identifier21                                  VARCHAR2(255 CHAR),
  other_provider_identifier22                                  VARCHAR2(255 CHAR),
  other_provider_identifier23                                  VARCHAR2(255 CHAR),
  other_provider_identifier24                                  VARCHAR2(255 CHAR),
  other_provider_identifier25                                  VARCHAR2(255 CHAR),
  other_provider_identifier26                                  VARCHAR2(255 CHAR),
  other_provider_identifier27                                  VARCHAR2(255 CHAR),
  other_provider_identifier28                                  VARCHAR2(255 CHAR),
  other_provider_identifier29                                  VARCHAR2(255 CHAR),
  other_provider_identifier3                                   VARCHAR2(255 CHAR),
  other_provider_identifier30                                  VARCHAR2(255 CHAR),
  other_provider_identifier31                                  VARCHAR2(255 CHAR),
  other_provider_identifier32                                  VARCHAR2(255 CHAR),
  other_provider_identifier33                                  VARCHAR2(255 CHAR),
  other_provider_identifier34                                  VARCHAR2(255 CHAR),
  other_provider_identifier35                                  VARCHAR2(255 CHAR),
  other_provider_identifier36                                  VARCHAR2(255 CHAR),
  other_provider_identifier37                                  VARCHAR2(255 CHAR),
  other_provider_identifier38                                  VARCHAR2(255 CHAR),
  other_provider_identifier39                                  VARCHAR2(255 CHAR),
  other_provider_identifier4                                   VARCHAR2(255 CHAR),
  other_provider_identifier40                                  VARCHAR2(255 CHAR),
  other_provider_identifier41                                  VARCHAR2(255 CHAR),
  other_provider_identifier42                                  VARCHAR2(255 CHAR),
  other_provider_identifier43                                  VARCHAR2(255 CHAR),
  other_provider_identifier44                                  VARCHAR2(255 CHAR),
  other_provider_identifier45                                  VARCHAR2(255 CHAR),
  other_provider_identifier46                                  VARCHAR2(255 CHAR),
  other_provider_identifier47                                  VARCHAR2(255 CHAR),
  other_provider_identifier48                                  VARCHAR2(255 CHAR),
  other_provider_identifier49                                  VARCHAR2(255 CHAR),
  other_provider_identifier5                                   VARCHAR2(255 CHAR),
  other_provider_identifier50                                  VARCHAR2(255 CHAR),
  other_provider_identifier6                                   VARCHAR2(255 CHAR),
  other_provider_identifier7                                   VARCHAR2(255 CHAR),
  other_provider_identifier8                                   VARCHAR2(255 CHAR),
  other_provider_identifier9                                   VARCHAR2(255 CHAR),
  other_provider_identifier_issuer1                            VARCHAR2(255 CHAR),
  other_provider_identifier_issuer10                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer11                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer12                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer13                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer14                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer15                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer16                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer17                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer18                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer19                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer2                            VARCHAR2(255 CHAR),
  other_provider_identifier_issuer20                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer21                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer22                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer23                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer24                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer25                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer26                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer27                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer28                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer29                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer3                            VARCHAR2(255 CHAR),
  other_provider_identifier_issuer30                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer31                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer32                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer33                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer34                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer35                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer36                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer37                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer38                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer39                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer4                            VARCHAR2(255 CHAR),
  other_provider_identifier_issuer40                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer41                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer42                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer43                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer44                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer45                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer46                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer47                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer48                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer49                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer5                            VARCHAR2(255 CHAR),
  other_provider_identifier_issuer50                           VARCHAR2(255 CHAR),
  other_provider_identifier_issuer6                            VARCHAR2(255 CHAR),
  other_provider_identifier_issuer7                            VARCHAR2(255 CHAR),
  other_provider_identifier_issuer8                            VARCHAR2(255 CHAR),
  other_provider_identifier_issuer9                            VARCHAR2(255 CHAR),
  other_provider_identifier_state1                             VARCHAR2(255 CHAR),
  other_provider_identifier_state10                            VARCHAR2(255 CHAR),
  other_provider_identifier_state11                            VARCHAR2(255 CHAR),
  other_provider_identifier_state12                            VARCHAR2(255 CHAR),
  other_provider_identifier_state13                            VARCHAR2(255 CHAR),
  other_provider_identifier_state14                            VARCHAR2(255 CHAR),
  other_provider_identifier_state15                            VARCHAR2(255 CHAR),
  other_provider_identifier_state16                            VARCHAR2(255 CHAR),
  other_provider_identifier_state17                            VARCHAR2(255 CHAR),
  other_provider_identifier_state18                            VARCHAR2(255 CHAR),
  other_provider_identifier_state19                            VARCHAR2(255 CHAR),
  other_provider_identifier_state2                             VARCHAR2(255 CHAR),
  other_provider_identifier_state20                            VARCHAR2(255 CHAR),
  other_provider_identifier_state21                            VARCHAR2(255 CHAR),
  other_provider_identifier_state22                            VARCHAR2(255 CHAR),
  other_provider_identifier_state23                            VARCHAR2(255 CHAR),
  other_provider_identifier_state24                            VARCHAR2(255 CHAR),
  other_provider_identifier_state25                            VARCHAR2(255 CHAR),
  other_provider_identifier_state26                            VARCHAR2(255 CHAR),
  other_provider_identifier_state27                            VARCHAR2(255 CHAR),
  other_provider_identifier_state28                            VARCHAR2(255 CHAR),
  other_provider_identifier_state29                            VARCHAR2(255 CHAR),
  other_provider_identifier_state3                             VARCHAR2(255 CHAR),
  other_provider_identifier_state30                            VARCHAR2(255 CHAR),
  other_provider_identifier_state31                            VARCHAR2(255 CHAR),
  other_provider_identifier_state32                            VARCHAR2(255 CHAR),
  other_provider_identifier_state33                            VARCHAR2(255 CHAR),
  other_provider_identifier_state34                            VARCHAR2(255 CHAR),
  other_provider_identifier_state35                            VARCHAR2(255 CHAR),
  other_provider_identifier_state36                            VARCHAR2(255 CHAR),
  other_provider_identifier_state37                            VARCHAR2(255 CHAR),
  other_provider_identifier_state38                            VARCHAR2(255 CHAR),
  other_provider_identifier_state39                            VARCHAR2(255 CHAR),
  other_provider_identifier_state4                             VARCHAR2(255 CHAR),
  other_provider_identifier_state40                            VARCHAR2(255 CHAR),
  other_provider_identifier_state41                            VARCHAR2(255 CHAR),
  other_provider_identifier_state42                            VARCHAR2(255 CHAR),
  other_provider_identifier_state43                            VARCHAR2(255 CHAR),
  other_provider_identifier_state44                            VARCHAR2(255 CHAR),
  other_provider_identifier_state45                            VARCHAR2(255 CHAR),
  other_provider_identifier_state46                            VARCHAR2(255 CHAR),
  other_provider_identifier_state47                            VARCHAR2(255 CHAR),
  other_provider_identifier_state48                            VARCHAR2(255 CHAR),
  other_provider_identifier_state49                            VARCHAR2(255 CHAR),
  other_provider_identifier_state5                             VARCHAR2(255 CHAR),
  other_provider_identifier_state50                            VARCHAR2(255 CHAR),
  other_provider_identifier_state6                             VARCHAR2(255 CHAR),
  other_provider_identifier_state7                             VARCHAR2(255 CHAR),
  other_provider_identifier_state8                             VARCHAR2(255 CHAR),
  other_provider_identifier_state9                             VARCHAR2(255 CHAR),
  other_provider_identifier_type_code1                         VARCHAR2(255 CHAR),
  other_provider_identifier_type_code10                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code11                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code12                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code13                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code14                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code15                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code16                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code17                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code18                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code19                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code2                         VARCHAR2(255 CHAR),
  other_provider_identifier_type_code20                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code21                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code22                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code23                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code24                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code25                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code26                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code27                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code28                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code29                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code3                         VARCHAR2(255 CHAR),
  other_provider_identifier_type_code30                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code31                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code32                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code33                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code34                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code35                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code36                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code37                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code38                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code39                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code4                         VARCHAR2(255 CHAR),
  other_provider_identifier_type_code40                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code41                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code42                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code43                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code44                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code45                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code46                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code47                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code48                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code49                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code5                         VARCHAR2(255 CHAR),
  other_provider_identifier_type_code50                        VARCHAR2(255 CHAR),
  other_provider_identifier_type_code6                         VARCHAR2(255 CHAR),
  other_provider_identifier_type_code7                         VARCHAR2(255 CHAR),
  other_provider_identifier_type_code8                         VARCHAR2(255 CHAR),
  other_provider_identifier_type_code9                         VARCHAR2(255 CHAR),
  parent_organization_legal_business_name                      VARCHAR2(255 CHAR),
  parent_organization_tin                                      VARCHAR2(255 CHAR),
  provider_business_mailing_address_city_name                  VARCHAR2(255 CHAR),
  provider_business_mailing_address_country_code               VARCHAR2(255 CHAR),
  provider_business_mailing_address_fax_number                 VARCHAR2(255 CHAR),
  provider_business_mailing_address_postal_code                VARCHAR2(255 CHAR),
  provider_business_mailing_address_state_name                 VARCHAR2(255 CHAR),
  provider_business_mailing_address_telephone_number           VARCHAR2(255 CHAR),
  provider_business_practice_location_address_city_name        VARCHAR2(255 CHAR),
  provider_business_practice_location_address_country_code     VARCHAR2(255 CHAR),
  provider_business_practice_location_address_fax_number       VARCHAR2(255 CHAR),
  provider_business_practice_location_address_postal_code      VARCHAR2(255 CHAR),
  provider_business_practice_location_address_state_name       VARCHAR2(255 CHAR),
  provider_business_practice_location_address_telephone_number VARCHAR2(255 CHAR),
  provider_credential_text                                     VARCHAR2(255 CHAR),
  provider_enumeration_date                                    DATE,
  provider_first_line_business_mailing_address                 VARCHAR2(255 CHAR),
  provider_first_line_business_practice_location_address       VARCHAR2(255 CHAR),
  provider_first_name                                          VARCHAR2(255 CHAR),
  provider_gender_code                                         VARCHAR2(255 CHAR),
  provider_last_name                                           VARCHAR2(255 CHAR),
  provider_license_number1                                     VARCHAR2(255 CHAR),
  provider_license_number10                                    VARCHAR2(255 CHAR),
  provider_license_number11                                    VARCHAR2(255 CHAR),
  provider_license_number12                                    VARCHAR2(255 CHAR),
  provider_license_number13                                    VARCHAR2(255 CHAR),
  provider_license_number14                                    VARCHAR2(255 CHAR),
  provider_license_number15                                    VARCHAR2(255 CHAR),
  provider_license_number2                                     VARCHAR2(255 CHAR),
  provider_license_number3                                     VARCHAR2(255 CHAR),
  provider_license_number4                                     VARCHAR2(255 CHAR),
  provider_license_number5                                     VARCHAR2(255 CHAR),
  provider_license_number6                                     VARCHAR2(255 CHAR),
  provider_license_number7                                     VARCHAR2(255 CHAR),
  provider_license_number8                                     VARCHAR2(255 CHAR),
  provider_license_number9                                     VARCHAR2(255 CHAR),
  provider_license_number_state_code1                          VARCHAR2(255 CHAR),
  provider_license_number_state_code10                         VARCHAR2(255 CHAR),
  provider_license_number_state_code11                         VARCHAR2(255 CHAR),
  provider_license_number_state_code12                         VARCHAR2(255 CHAR),
  provider_license_number_state_code13                         VARCHAR2(255 CHAR),
  provider_license_number_state_code14                         VARCHAR2(255 CHAR),
  provider_license_number_state_code15                         VARCHAR2(255 CHAR),
  provider_license_number_state_code2                          VARCHAR2(255 CHAR),
  provider_license_number_state_code3                          VARCHAR2(255 CHAR),
  provider_license_number_state_code4                          VARCHAR2(255 CHAR),
  provider_license_number_state_code5                          VARCHAR2(255 CHAR),
  provider_license_number_state_code6                          VARCHAR2(255 CHAR),
  provider_license_number_state_code7                          VARCHAR2(255 CHAR),
  provider_license_number_state_code8                          VARCHAR2(255 CHAR),
  provider_license_number_state_code9                          VARCHAR2(255 CHAR),
  provider_middle_name                                         VARCHAR2(255 CHAR),
  provider_name_prefix_text                                    VARCHAR2(255 CHAR),
  provider_name_suffix_text                                    VARCHAR2(255 CHAR),
  provider_organization_name                                   VARCHAR2(255 CHAR),
  provider_other_credential_text                               VARCHAR2(255 CHAR),
  provider_other_first_name                                    VARCHAR2(255 CHAR),
  provider_other_last_name                                     VARCHAR2(255 CHAR),
  provider_other_last_name_type_code                           VARCHAR2(255 CHAR),
  provider_other_middle_name                                   VARCHAR2(255 CHAR),
  provider_other_name_prefix_text                              VARCHAR2(255 CHAR),
  provider_other_name_suffix_text                              VARCHAR2(255 CHAR),
  provider_other_organization_name                             VARCHAR2(255 CHAR),
  provider_other_organization_name_type_code                   VARCHAR2(255 CHAR),
  provider_second_line_business_mailing_address                VARCHAR2(255 CHAR),
  provider_second_line_business_practice_location_address      VARCHAR2(255 CHAR),
  reactivation_date                                            DATE,
  replacement_npi                                              NUMBER(19, 0),
  sole_proprietor_flag                                         VARCHAR2(255 CHAR),
  PRIMARY KEY (npi)
);

CREATE TABLE payment (
  record_id      NUMBER(19, 0) NOT NULL,
  npi            NUMBER(19, 0) NOT NULL,
  ccn            NUMBER(19, 0),
  stage_number   VARCHAR2(255 CHAR),
  program_year   VARCHAR2(255 CHAR),
  payment_amount NUMBER(9, 2),
  PRIMARY KEY (record_id)
);

CREATE TABLE hospital_operator (
  hospital_operator_id   NUMBER(19, 0)          NOT NULL,
  hospital_operator_name VARCHAR2(255 CHAR),
  is_for_profit          NUMBER(1, 0) DEFAULT 0 NOT NULL,
  PRIMARY KEY (hospital_operator_id)
);

CREATE TABLE hospital_operator_facility_mapping (
  hospital_operator_facility_mapping_id NUMBER(19, 0) NOT NULL,
  hospital_operator_id                  NUMBER(19, 0),
  npi                                   NUMBER(19, 0),
  PRIMARY KEY (hospital_operator_facility_mapping_id)
);

ALTER TABLE attestation
  ADD CONSTRAINT FKmh8532owhvpqa6jhxnq0mvmup FOREIGN KEY (npi) REFERENCES provider;

ALTER TABLE payment
  ADD CONSTRAINT FKtc6wu20h66q8pqkmscqkloqbc FOREIGN KEY (npi) REFERENCES provider;

ALTER TABLE hospital_operator_facility_mapping
  ADD CONSTRAINT FKc1jjc3omjpy9dxu6khbc8eo04 FOREIGN KEY (hospital_operator_id) REFERENCES hospital_operator;

ALTER TABLE hospital_operator_facility_mapping
  ADD CONSTRAINT FK2ltjhtls8saa1tevym60trk2b FOREIGN KEY (npi) REFERENCES provider;

CREATE VIEW mu_attestation_medhost_enterprise AS
  SELECT
    hospital_operator.HOSPITAL_OPERATOR_NAME,
    provider.PROVIDER_OTHER_ORGANIZATION_NAME                       FACILITY_NAME,
    provider.PROVIDER_BUSINESS_PRACTICE_LOCATION_ADDRESS_CITY_NAME  CITY,
    provider.PROVIDER_BUSINESS_PRACTICE_LOCATION_ADDRESS_STATE_NAME STATE,
    payment.PAYMENT_AMOUNT,
    payment.STAGE_NUMBER,
    payment.PROGRAM_YEAR
  FROM PROVIDER
    JOIN payment
      ON PROVIDER.NPI = PAYMENT.NPI
    JOIN hospital_operator_facility_mapping
      ON provider.npi = HOSPITAL_OPERATOR_FACILITY_MAPPING.npi
    JOIN hospital_operator
      ON hospital_operator.HOSPITAL_OPERATOR_ID = hospital_operator_facility_mapping.HOSPITAL_OPERATOR_ID
         AND provider.npi IN (SELECT npi
                              FROM ATTESTATION
                              WHERE VENDOR_NAME = 'MEDHOST' AND PRODUCT_CLASSIFICATION = 'Complete EHR')
  ORDER BY PROVIDER_OTHER_ORGANIZATION_NAME, PROGRAM_YEAR;

CREATE VIEW mu_attestation_pulse AS
  SELECT
    hospital_operator.HOSPITAL_OPERATOR_NAME,
    provider.PROVIDER_OTHER_ORGANIZATION_NAME                       FACILITY_NAME,
    provider.PROVIDER_BUSINESS_PRACTICE_LOCATION_ADDRESS_CITY_NAME  CITY,
    provider.PROVIDER_BUSINESS_PRACTICE_LOCATION_ADDRESS_STATE_NAME STATE,
    payment.PAYMENT_AMOUNT,
    payment.STAGE_NUMBER,
    payment.PROGRAM_YEAR
  FROM PROVIDER
    JOIN payment
      ON PROVIDER.NPI = PAYMENT.NPI
    JOIN hospital_operator_facility_mapping
      ON provider.npi = HOSPITAL_OPERATOR_FACILITY_MAPPING.npi
    JOIN hospital_operator
      ON hospital_operator.HOSPITAL_OPERATOR_ID = hospital_operator_facility_mapping.HOSPITAL_OPERATOR_ID
         AND provider.npi IN (SELECT npi
                              FROM ATTESTATION
                              WHERE PRODUCT_NAME = 'PULSE')
  ORDER BY PROVIDER_OTHER_ORGANIZATION_NAME, PROGRAM_YEAR;

CREATE TABLE HOSP_RPT (
  RPT_REC_NUM        NUMBER  NOT NULL,
  PRVDR_CTRL_TYPE_CD CHAR(2) NULL,
  PRVDR_NUM          CHAR(6) NOT NULL,
  NPI                NUMBER  NULL,
  RPT_STUS_CD        CHAR(1) NOT NULL,
  FY_BGN_DT          DATE    NULL,
  FY_END_DT          DATE    NULL,
  PROC_DT            DATE    NULL,
  INITL_RPT_SW       CHAR(1) NULL,
  LAST_RPT_SW        CHAR(1) NULL,
  TRNSMTL_NUM        CHAR(2) NULL,
  FI_NUM             CHAR(5) NULL,
  ADR_VNDR_CD        CHAR(1) NULL,
  FI_CREAT_DT        DATE    NULL,
  UTIL_CD            CHAR(1) NULL,
  NPR_DT             DATE    NULL,
  SPEC_IND           CHAR(1) NULL,
  FI_RCPT_DT         DATE    NULL,
  PRIMARY KEY (rpt_rec_num)
);

CREATE TABLE HOSP_RPT_ALPHA (
  RPT_REC_NUM      NUMBER   NOT NULL,
  WKSHT_CD         CHAR(7)  NOT NULL,
  LINE_NUM         CHAR(5)  NOT NULL,
  CLMN_NUM         CHAR(5)  NOT NULL,
  ALPHNMRC_ITM_TXT CHAR(40) NOT NULL
);

ALTER TABLE HOSP_RPT_ALPHA
  ADD CONSTRAINT hosp_rpt_alpha_rpt_rec_num_key FOREIGN KEY (rpt_rec_num) REFERENCES hosp_rpt;

CREATE TABLE HOSP_RPT_NMRC (
  RPT_REC_NUM NUMBER  NOT NULL,
  WKSHT_CD    CHAR(7) NOT NULL,
  LINE_NUM    CHAR(5) NOT NULL,
  CLMN_NUM    CHAR(5) NOT NULL,
  ITM_VAL_NUM NUMBER  NOT NULL
);

ALTER TABLE hosp_rpt_nmrc
  ADD CONSTRAINT hosp_rpt_nmrc_rpt_rec_num_key FOREIGN KEY (rpt_rec_num) REFERENCES HOSP_RPT;

CREATE TABLE HOSP_ROLLUP
(
  RPT_REC_NUM NUMBER        NOT NULL,
  LABEL       CHAR(30 BYTE) NOT NULL,
  ITEM        NUMBER
);

ALTER TABLE HOSP_ROLLUP
  ADD CONSTRAINT hosp_rollup_rpt_rec_num_key FOREIGN KEY (RPT_REC_NUM) REFERENCES hosp_rpt;

CREATE INDEX hosp_rpt_nmrc_idx1
  ON HOSP_RPT_NMRC (RPT_REC_NUM, WKSHT_CD);

CREATE OR REPLACE FUNCTION get_hosp_rpt_total_discharges(n_npi IN NUMBER, v_report_year IN VARCHAR2)
  RETURN NUMBER
IS
  total_discharges NUMBER;
  c_ccn            CHAR(6);
  n_rpt_rec_num    NUMBER;
  BEGIN
    SELECT DISTINCT ccn
    INTO c_ccn
    FROM PAYMENT
    WHERE npi = n_npi;
    SELECT rpt_rec_num
    INTO n_rpt_rec_num
    FROM HOSP_RPT
    WHERE PRVDR_NUM = c_ccn AND to_date(v_report_year, 'yyyy') BETWEEN fy_bgn_dt AND fy_end_dt;
    SELECT ITM_VAL_NUM
    INTO total_discharges
    FROM HOSP_RPT_NMRC
    WHERE RPT_REC_NUM = n_rpt_rec_num AND WKSHT_CD = 'S300001' AND CLMN_NUM = '01500' AND LINE_NUM = '01400';
    RETURN total_discharges;
  END;
/

CREATE OR REPLACE FUNCTION get_hosp_rpt_medicare_share_ratio(n_npi IN NUMBER, v_report_year IN VARCHAR2)
  RETURN NUMBER
IS
  n_medicare_share_ratio   NUMBER;
  c_ccn                    CHAR(6);
  n_rpt_rec_num            NUMBER;
  n_total_discharges       NUMBER;
  n_inpatient_part_a_days  NUMBER;
  n_inpatient_part_c_days  NUMBER;
  n_total_inpatient_days   NUMBER;
  n_total_charges          NUMBER;
  n_charity_charge_charges NUMBER;
  BEGIN
    SELECT DISTINCT ccn
    INTO c_ccn
    FROM PAYMENT
    WHERE npi = n_npi;
    SELECT rpt_rec_num
    INTO n_rpt_rec_num
    FROM HOSP_RPT
    WHERE PRVDR_NUM = c_ccn AND to_date(v_report_year, 'yyyy') BETWEEN fy_bgn_dt AND fy_end_dt;
    SELECT get_hosp_rpt_total_discharges(n_npi, v_report_year)
    INTO n_total_discharges
    FROM dual;
    SELECT sum(ITM_VAL_NUM)
    INTO n_inpatient_part_a_days
    FROM HOSP_RPT_NMRC
    WHERE RPT_REC_NUM = n_rpt_rec_num AND WKSHT_CD = 'S300001' AND CLMN_NUM = '00600' AND
          LINE_NUM IN ('00100', '00800', '00900', '01000', '01100', '01200');
    SELECT sum(ITM_VAL_NUM)
    INTO n_inpatient_part_c_days
    FROM HOSP_RPT_NMRC
    WHERE RPT_REC_NUM = n_rpt_rec_num AND WKSHT_CD = 'S300001' AND CLMN_NUM = '00600' AND LINE_NUM = '00200';
    SELECT sum(ITM_VAL_NUM)
    INTO n_total_inpatient_days
    FROM HOSP_RPT_NMRC
    WHERE RPT_REC_NUM = n_rpt_rec_num AND WKSHT_CD = 'S300001' AND CLMN_NUM = '00800' AND
          LINE_NUM IN ('00100', '00800', '00900', '01000', '01100', '01200');
    SELECT itm_val_num
    INTO n_total_charges
    FROM HOSP_RPT_NMRC
    WHERE RPT_REC_NUM = n_rpt_rec_num AND WKSHT_CD = 'C000001' AND CLMN_NUM = '00800' AND LINE_NUM = '20000';
    SELECT itm_val_num
    INTO n_charity_charge_charges
    FROM HOSP_RPT_NMRC
    WHERE RPT_REC_NUM = n_rpt_rec_num AND WKSHT_CD = 'S100000' AND CLMN_NUM = '00300' AND LINE_NUM = '02000';

    n_medicare_share_ratio := (n_inpatient_part_a_days + n_inpatient_part_c_days) /
                              (n_total_inpatient_days *
                               ((n_total_charges - n_charity_charge_charges) / n_total_charges));

    RETURN trunc(n_medicare_share_ratio, 2);
  END;
/

CREATE OR REPLACE FUNCTION get_estimated_mu_incentive_payment_amount(n_npi IN NUMBER, v_report_year IN VARCHAR2)
  RETURN NUMBER
IS
  n_medicare_share_ratio         NUMBER;
  c_first_incentive_payment_year VARCHAR2(4);
  n_transition_factor            NUMBER;
  n_estimated_payment_amount     NUMBER;
  n_total_discharges             NUMBER;
  BEGIN
    SELECT get_hosp_rpt_medicare_share_ratio(n_npi, v_report_year)
    INTO n_medicare_share_ratio
    FROM dual;
    SELECT min(PROGRAM_YEAR)
    INTO c_first_incentive_payment_year
    FROM PAYMENT
    WHERE npi = n_npi;
    IF c_first_incentive_payment_year = '2011' AND v_report_year = '2011'
    THEN
      n_transition_factor := 1.00;
    ELSIF c_first_incentive_payment_year = '2011' AND v_report_year = '2012'
      THEN
        n_transition_factor := 0.75;
    ELSIF c_first_incentive_payment_year = '2011' AND v_report_year = '2013'
      THEN
        n_transition_factor := 0.50;
    ELSIF c_first_incentive_payment_year = '2011' AND v_report_year = '2014'
      THEN
        n_transition_factor := 0.25;
    ELSIF c_first_incentive_payment_year = '2012' AND v_report_year = '2012'
      THEN
        n_transition_factor := 1.00;
    ELSIF c_first_incentive_payment_year = '2012' AND v_report_year = '2013'
      THEN
        n_transition_factor := 0.75;
    ELSIF c_first_incentive_payment_year = '2012' AND v_report_year = '2014'
      THEN
        n_transition_factor := 0.50;
    ELSIF c_first_incentive_payment_year = '2012' AND v_report_year = '2015'
      THEN
        n_transition_factor := 0.25;
    ELSIF c_first_incentive_payment_year = '2013' AND v_report_year = '2013'
      THEN
        n_transition_factor := 1.00;
    ELSIF c_first_incentive_payment_year = '2013' AND v_report_year = '2014'
      THEN
        n_transition_factor := 0.75;
    ELSIF c_first_incentive_payment_year = '2013' AND v_report_year = '2015'
      THEN
        n_transition_factor := 0.50;
    ELSIF c_first_incentive_payment_year = '2013' AND v_report_year = '2016'
      THEN
        n_transition_factor := 0.25;
    ELSIF c_first_incentive_payment_year = '2014' AND v_report_year = '2014'
      THEN
        n_transition_factor := 0.75;
    ELSIF c_first_incentive_payment_year = '2014' AND v_report_year = '2015'
      THEN
        n_transition_factor := 0.50;
    ELSIF c_first_incentive_payment_year = '2014' AND v_report_year = '2016'
      THEN
        n_transition_factor := 0.25;
    ELSIF c_first_incentive_payment_year = '2015' AND v_report_year = '2015'
      THEN
        n_transition_factor := 0.50;
    ELSIF c_first_incentive_payment_year = '2015' AND v_report_year = '2016'
      THEN
        n_transition_factor := 0.25;
    END IF;

    SELECT get_hosp_rpt_total_discharges(n_npi, v_report_year)
    INTO n_total_discharges
    FROM dual;

    n_estimated_payment_amount := 2000000 * n_transition_factor;

    IF (n_total_discharges >= 1150) AND (n_total_discharges <= 23000)
    THEN
      n_estimated_payment_amount := n_estimated_payment_amount + ((n_total_discharges - 1150) * 200);
    ELSIF (n_total_discharges > 23000)
      THEN
        n_estimated_payment_amount := n_estimated_payment_amount + (23000 - 1150) * 200;
    END IF;

    SELECT get_hosp_rpt_medicare_share_ratio(n_npi, v_report_year)
    INTO n_medicare_share_ratio
    FROM dual;

    RETURN n_estimated_payment_amount * n_medicare_share_ratio;
  END;
/

CREATE VIEW mu_estimated_payment AS
  SELECT
    hospital_operator.HOSPITAL_OPERATOR_NAME,
    provider.PROVIDER_ORGANIZATION_NAME,
    PROVIDER_OTHER_ORGANIZATION_NAME,
    provider.PROVIDER_BUSINESS_PRACTICE_LOCATION_ADDRESS_CITY_NAME                AS city,
    provider.PROVIDER_BUSINESS_PRACTICE_LOCATION_ADDRESS_STATE_NAME               AS state,
    provider.npi,
    payment.PAYMENT_AMOUNT,
    payment.PROGRAM_YEAR,
    payment.STAGE_NUMBER,
    get_hosp_rpt_total_discharges(provider.npi, payment.PROGRAM_YEAR)             AS total_discharages,
    get_hosp_rpt_medicare_share_ratio(provider.npi, payment.PROGRAM_YEAR)         AS medicare_share_ratio,
    get_estimated_mu_incentive_payment_amount(provider.npi, payment.PROGRAM_YEAR) AS estimated_payment_amount
  FROM PROVIDER
    JOIN PAYMENT
      ON provider.npi = payment.NPI
    JOIN hospital_operator_facility_mapping
      ON provider.npi = HOSPITAL_OPERATOR_FACILITY_MAPPING.NPI
    JOIN hospital_operator
      ON hospital_operator.HOSPITAL_OPERATOR_ID = HOSPITAL_OPERATOR_FACILITY_MAPPING.HOSPITAL_OPERATOR_ID
  ORDER BY HOSPITAL_OPERATOR_NAME, npi, stage_number, PROGRAM_YEAR;