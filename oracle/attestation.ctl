options(skip=1)
load data
infile '/stage/cmsreporting_input/MU_REPORT_2015.CSV'
into table attestation
fields terminated by ',' optionally enclosed by '"'
(
    record_id expression "ATTESTATION_RECORD_ID_SEQ.NEXTVAL",
    certification_number,
    vendor_name,
    chp_id,
    product_name,
    product_version,
    product_classification,
    product_setting,
    product_certification_year,
    attestation_month,
    attestation_year,
    business_state_territory,
    provider_type,
    specialty,
    program_year,
    payment_year,
    provider_stage_number,
    program_type,
    x FILLER,
    y FILLER,
    attestation_id,
    npi,
    ccn
)
