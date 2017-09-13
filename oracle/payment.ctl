options(skip=2)
load data
infile '/stage/cmsreporting_input/HOSP_ProvidersPaidByEHR_03_2017_FINAL_modified_currency.csv'
into table payment
fields terminated by ',' optionally enclosed by '"'
(
    record_id expression "PAYMENT_RECORD_ID_SEQ.NEXTVAL",
    npi,
    ccn,
    a filler,
    b filler,
    c filler,
    d filler,
    e filler,
    f filler,
    g filler,
    h filler,
    stage_number,
    program_year,
    payment_amount
)
