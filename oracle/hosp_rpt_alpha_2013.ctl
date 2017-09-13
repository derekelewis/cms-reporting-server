load data
infile '/stage/HOSP10FY2013/hosp10_2013_ALPHA.CSV'
append
into table hosp_rpt_alpha
fields terminated by ',' optionally enclosed by '"'
(
    rpt_rec_num,
    wksht_cd,
    line_num,
    clmn_num,
    alphnmrc_itm_txt
)
