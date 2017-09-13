load data
infile '/stage/HOSP10FY2013/hosp10_2013_NMRC_MODIFIED.CSV'
append
into table hosp_rpt_nmrc
fields terminated by ',' optionally enclosed by '"'
(
    rpt_rec_num,
    wksht_cd,
    line_num,
    clmn_num,
    itm_val_num
)
