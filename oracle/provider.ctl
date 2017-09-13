options(skip=1)
load data
infile '/stage/cmsreporting_input/npidata_20050523-20160710.csv'
into table provider
fields terminated by ',' optionally enclosed by '"'
(
    npi,
    entity_type_code,
    replacement_npi,
    employer_identification_number,
    provider_organization_name,
    provider_last_name,
    provider_first_name,
    provider_middle_name,
    provider_name_prefix_text,
    provider_name_suffix_text,
    provider_credential_text,
    provider_other_organization_name,
    provider_other_organization_name_type_code,
    provider_other_last_name,
    provider_other_first_name,
    provider_other_middle_name,
    provider_other_name_prefix_text,
    provider_other_name_suffix_text,
    provider_other_credential_text,
    provider_other_last_name_type_code,
    provider_first_line_business_mailing_address,
    provider_second_line_business_mailing_address,
    provider_business_mailing_address_city_name,
    provider_business_mailing_address_state_name,
    provider_business_mailing_address_postal_code,
    provider_business_mailing_address_country_code,
    provider_business_mailing_address_telephone_number,
    provider_business_mailing_address_fax_number,
    provider_first_line_business_practice_location_address,
    provider_second_line_business_practice_location_address,
    provider_business_practice_location_address_city_name,
    provider_business_practice_location_address_state_name,
    provider_business_practice_location_address_postal_code,
    provider_business_practice_location_address_country_code,
    provider_business_practice_location_address_telephone_number,
    provider_business_practice_location_address_fax_number,
    provider_enumeration_date date 'MM/DD/YYYY',
    last_update_date date 'MM/DD/YYYY',
    npi_deactivation_reason_code,
    deactivation_date date 'MM/DD/YYYY',
    reactivation_date date 'MM/DD/YYYY',
    provider_gender_code,
    authorized_official_last_name,
    authorized_official_first_name,
    authorized_official_middle_name,
    authorized_official_title,
    authorized_official_telephone_number,
    healthcare_provider_taxonomy_code1,
    provider_license_number1,
    provider_license_number_state_code1,
    healthcare_provider_primary_taxonomy_switch1,
    healthcare_provider_taxonomy_code2,
    provider_license_number2,
    provider_license_number_state_code2,
    healthcare_provider_primary_taxonomy_switch2,
    healthcare_provider_taxonomy_code3,
    provider_license_number3,
    provider_license_number_state_code3,
    healthcare_provider_primary_taxonomy_switch3,
    healthcare_provider_taxonomy_code4,
    provider_license_number4,
    provider_license_number_state_code4,
    healthcare_provider_primary_taxonomy_switch4,
    healthcare_provider_taxonomy_code5,
    provider_license_number5,
    provider_license_number_state_code5,
    healthcare_provider_primary_taxonomy_switch5,
    healthcare_provider_taxonomy_code6,
    provider_license_number6,
    provider_license_number_state_code6,
    healthcare_provider_primary_taxonomy_switch6,
    healthcare_provider_taxonomy_code7,
    provider_license_number7,
    provider_license_number_state_code7,
    healthcare_provider_primary_taxonomy_switch7,
    healthcare_provider_taxonomy_code8,
    provider_license_number8,
    provider_license_number_state_code8,
    healthcare_provider_primary_taxonomy_switch8,
    healthcare_provider_taxonomy_code9,
    provider_license_number9,
    provider_license_number_state_code9,
    healthcare_provider_primary_taxonomy_switch9,
    healthcare_provider_taxonomy_code10,
    provider_license_number10,
    provider_license_number_state_code10,
    healthcare_provider_primary_taxonomy_switch10,
    healthcare_provider_taxonomy_code11,
    provider_license_number11,
    provider_license_number_state_code11,
    healthcare_provider_primary_taxonomy_switch11,
    healthcare_provider_taxonomy_code12,
    provider_license_number12,
    provider_license_number_state_code12,
    healthcare_provider_primary_taxonomy_switch12,
    healthcare_provider_taxonomy_code13,
    provider_license_number13,
    provider_license_number_state_code13,
    healthcare_provider_primary_taxonomy_switch13,
    healthcare_provider_taxonomy_code14,
    provider_license_number14,
    provider_license_number_state_code14,
    healthcare_provider_primary_taxonomy_switch14,
    healthcare_provider_taxonomy_code15,
    provider_license_number15,
    provider_license_number_state_code15,
    healthcare_provider_primary_taxonomy_switch15,
    other_provider_identifier1,
    other_provider_identifier_type_code1,
    other_provider_identifier_state1,
    other_provider_identifier_issuer1,
    other_provider_identifier2,
    other_provider_identifier_type_code2,
    other_provider_identifier_state2,
    other_provider_identifier_issuer2,
    other_provider_identifier3,
    other_provider_identifier_type_code3,
    other_provider_identifier_state3,
    other_provider_identifier_issuer3,
    other_provider_identifier4,
    other_provider_identifier_type_code4,
    other_provider_identifier_state4,
    other_provider_identifier_issuer4,
    other_provider_identifier5,
    other_provider_identifier_type_code5,
    other_provider_identifier_state5,
    other_provider_identifier_issuer5,
    other_provider_identifier6,
    other_provider_identifier_type_code6,
    other_provider_identifier_state6,
    other_provider_identifier_issuer6,
    other_provider_identifier7,
    other_provider_identifier_type_code7,
    other_provider_identifier_state7,
    other_provider_identifier_issuer7,
    other_provider_identifier8,
    other_provider_identifier_type_code8,
    other_provider_identifier_state8,
    other_provider_identifier_issuer8,
    other_provider_identifier9,
    other_provider_identifier_type_code9,
    other_provider_identifier_state9,
    other_provider_identifier_issuer9,
    other_provider_identifier10,
    other_provider_identifier_type_code10,
    other_provider_identifier_state10,
    other_provider_identifier_issuer10,
    other_provider_identifier11,
    other_provider_identifier_type_code11,
    other_provider_identifier_state11,
    other_provider_identifier_issuer11,
    other_provider_identifier12,
    other_provider_identifier_type_code12,
    other_provider_identifier_state12,
    other_provider_identifier_issuer12,
    other_provider_identifier13,
    other_provider_identifier_type_code13,
    other_provider_identifier_state13,
    other_provider_identifier_issuer13,
    other_provider_identifier14,
    other_provider_identifier_type_code14,
    other_provider_identifier_state14,
    other_provider_identifier_issuer14,
    other_provider_identifier15,
    other_provider_identifier_type_code15,
    other_provider_identifier_state15,
    other_provider_identifier_issuer15,
    other_provider_identifier16,
    other_provider_identifier_type_code16,
    other_provider_identifier_state16,
    other_provider_identifier_issuer16,
    other_provider_identifier17,
    other_provider_identifier_type_code17,
    other_provider_identifier_state17,
    other_provider_identifier_issuer17,
    other_provider_identifier18,
    other_provider_identifier_type_code18,
    other_provider_identifier_state18,
    other_provider_identifier_issuer18,
    other_provider_identifier19,
    other_provider_identifier_type_code19,
    other_provider_identifier_state19,
    other_provider_identifier_issuer19,
    other_provider_identifier20,
    other_provider_identifier_type_code20,
    other_provider_identifier_state20,
    other_provider_identifier_issuer20,
    other_provider_identifier21,
    other_provider_identifier_type_code21,
    other_provider_identifier_state21,
    other_provider_identifier_issuer21,
    other_provider_identifier22,
    other_provider_identifier_type_code22,
    other_provider_identifier_state22,
    other_provider_identifier_issuer22,
    other_provider_identifier23,
    other_provider_identifier_type_code23,
    other_provider_identifier_state23,
    other_provider_identifier_issuer23,
    other_provider_identifier24,
    other_provider_identifier_type_code24,
    other_provider_identifier_state24,
    other_provider_identifier_issuer24,
    other_provider_identifier25,
    other_provider_identifier_type_code25,
    other_provider_identifier_state25,
    other_provider_identifier_issuer25,
    other_provider_identifier26,
    other_provider_identifier_type_code26,
    other_provider_identifier_state26,
    other_provider_identifier_issuer26,
    other_provider_identifier27,
    other_provider_identifier_type_code27,
    other_provider_identifier_state27,
    other_provider_identifier_issuer27,
    other_provider_identifier28,
    other_provider_identifier_type_code28,
    other_provider_identifier_state28,
    other_provider_identifier_issuer28,
    other_provider_identifier29,
    other_provider_identifier_type_code29,
    other_provider_identifier_state29,
    other_provider_identifier_issuer29,
    other_provider_identifier30,
    other_provider_identifier_type_code30,
    other_provider_identifier_state30,
    other_provider_identifier_issuer30,
    other_provider_identifier31,
    other_provider_identifier_type_code31,
    other_provider_identifier_state31,
    other_provider_identifier_issuer31,
    other_provider_identifier32,
    other_provider_identifier_type_code32,
    other_provider_identifier_state32,
    other_provider_identifier_issuer32,
    other_provider_identifier33,
    other_provider_identifier_type_code33,
    other_provider_identifier_state33,
    other_provider_identifier_issuer33,
    other_provider_identifier34,
    other_provider_identifier_type_code34,
    other_provider_identifier_state34,
    other_provider_identifier_issuer34,
    other_provider_identifier35,
    other_provider_identifier_type_code35,
    other_provider_identifier_state35,
    other_provider_identifier_issuer35,
    other_provider_identifier36,
    other_provider_identifier_type_code36,
    other_provider_identifier_state36,
    other_provider_identifier_issuer36,
    other_provider_identifier37,
    other_provider_identifier_type_code37,
    other_provider_identifier_state37,
    other_provider_identifier_issuer37,
    other_provider_identifier38,
    other_provider_identifier_type_code38,
    other_provider_identifier_state38,
    other_provider_identifier_issuer38,
    other_provider_identifier39,
    other_provider_identifier_type_code39,
    other_provider_identifier_state39,
    other_provider_identifier_issuer39,
    other_provider_identifier40,
    other_provider_identifier_type_code40,
    other_provider_identifier_state40,
    other_provider_identifier_issuer40,
    other_provider_identifier41,
    other_provider_identifier_type_code41,
    other_provider_identifier_state41,
    other_provider_identifier_issuer41,
    other_provider_identifier42,
    other_provider_identifier_type_code42,
    other_provider_identifier_state42,
    other_provider_identifier_issuer42,
    other_provider_identifier43,
    other_provider_identifier_type_code43,
    other_provider_identifier_state43,
    other_provider_identifier_issuer43,
    other_provider_identifier44,
    other_provider_identifier_type_code44,
    other_provider_identifier_state44,
    other_provider_identifier_issuer44,
    other_provider_identifier45,
    other_provider_identifier_type_code45,
    other_provider_identifier_state45,
    other_provider_identifier_issuer45,
    other_provider_identifier46,
    other_provider_identifier_type_code46,
    other_provider_identifier_state46,
    other_provider_identifier_issuer46,
    other_provider_identifier47,
    other_provider_identifier_type_code47,
    other_provider_identifier_state47,
    other_provider_identifier_issuer47,
    other_provider_identifier48,
    other_provider_identifier_type_code48,
    other_provider_identifier_state48,
    other_provider_identifier_issuer48,
    other_provider_identifier49,
    other_provider_identifier_type_code49,
    other_provider_identifier_state49,
    other_provider_identifier_issuer49,
    other_provider_identifier50,
    other_provider_identifier_type_code50,
    other_provider_identifier_state50,
    other_provider_identifier_issuer50,
    sole_proprietor_flag,
    organization_subpart_flag,
    parent_organization_legal_business_name,
    parent_organization_tin,
    authorized_official_name_prefix_text,
    authorized_official_name_suffix_text,
    authorized_official_credential_text,
    healthcare_provider_taxonomy_group1,
    healthcare_provider_taxonomy_group2,
    healthcare_provider_taxonomy_group3,
    healthcare_provider_taxonomy_group4,
    healthcare_provider_taxonomy_group5,
    healthcare_provider_taxonomy_group6,
    healthcare_provider_taxonomy_group7,
    healthcare_provider_taxonomy_group8,
    healthcare_provider_taxonomy_group9,
    healthcare_provider_taxonomy_group10,
    healthcare_provider_taxonomy_group11,
    healthcare_provider_taxonomy_group12,
    healthcare_provider_taxonomy_group13,
    healthcare_provider_taxonomy_group14,
    healthcare_provider_taxonomy_group15
)