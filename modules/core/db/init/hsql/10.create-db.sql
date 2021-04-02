-- begin POLYCLINIC_PATIENT
create table POLYCLINIC_PATIENT (
    ID bigint not null,
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LAST_NAME varchar(255) not null,
    PATRONYMIC varchar(255),
    PHONE_NUMBER varchar(255),
    FIRST_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end POLYCLINIC_PATIENT
-- begin POLYCLINIC_DOCTOR
create table POLYCLINIC_DOCTOR (
    ID bigint not null,
    UUID varchar(36),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    PATRONYMIC varchar(255),
    SPECIALIZATION varchar(255),
    NUM_OF_RECIPES integer,
    --
    primary key (ID)
)^
-- end POLYCLINIC_DOCTOR
-- begin POLYCLINIC_RECIPE
create table POLYCLINIC_RECIPE (
    ID bigint not null,
    UUID varchar(36),
    --
    DESCRIPTION varchar(255) not null,
    PRIORITY integer not null,
    DOCTOR_ID bigint not null,
    START_DATE timestamp not null,
    DURATION integer not null,
    --
    primary key (ID)
)^
-- end POLYCLINIC_RECIPE
-- begin POLYCLINIC_RECIPE_PATIENT_LINK
create table POLYCLINIC_RECIPE_PATIENT_LINK (
    RECIPE_ID bigint not null,
    PATIENT_ID bigint not null,
    primary key (RECIPE_ID, PATIENT_ID)
)^
-- end POLYCLINIC_RECIPE_PATIENT_LINK
