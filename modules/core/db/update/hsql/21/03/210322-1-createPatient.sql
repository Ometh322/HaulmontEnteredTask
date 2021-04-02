create table POLYCLINIC_PATIENT (
    ID bigint not null,
    --
    LAST_NAME varchar(255) not null,
    PATRONYMIC varchar(255),
    PHONE_NUMBER varchar(255),
    FIRST_NAME varchar(255) not null,
    --
    primary key (ID)
);