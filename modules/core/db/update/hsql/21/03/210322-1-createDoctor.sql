create table POLYCLINIC_DOCTOR (
    ID bigint not null,
    UUID varchar(36),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    PATRONYMIC varchar(255),
    SPECIALIZATION varchar(255),
    --
    primary key (ID)
);