load data
infile '/stage/HOSP10FY2014/hosp10_2014_RPT.CSV'
append
into table hosp_rpt
fields terminated by ',' optionally enclosed by '"'
(
    rpt_rec_num,
    prvdr_ctrl_type_cd,
    prvdr_num,
    npi,
    rpt_stus_cd,
    fy_bgn_dt date 'MM/DD/YYYY',
    fy_end_dt date 'MM/DD/YYYY',
    proc_dt date 'MM/DD/YYYY',
    initl_rpt_sw,
    last_rpt_sw,
    trnsmtl_num,
    fi_num,
    adr_vndr_cd,
    fi_creat_dt date 'MM/DD/YYYY',
    util_cd,
    npr_dt date 'MM/DD/YYYY',
    spec_ind,
    fi_rcpt_dt date 'MM/DD/YYYY'
)
