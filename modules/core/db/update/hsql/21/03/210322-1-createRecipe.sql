create table POLYCLINIC_RECIPE (
    ID bigint not null,
    UUID varchar(36),
    --
    DESCRIPTION varchar(255) not null,
    PRIORITY varchar(50) not null,
    DOCTOR_ID bigint not null,
    DURATION_TIME time,
    START_DATE timestamp not null,
    --
    primary key (ID)
);