create table POLYCLINIC_RECIPE_PATIENT_LINK (
    RECIPE_ID bigint not null,
    PATIENT_ID bigint not null,
    primary key (RECIPE_ID, PATIENT_ID)
);
