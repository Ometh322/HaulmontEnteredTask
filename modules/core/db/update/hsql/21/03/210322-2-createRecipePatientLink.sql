alter table POLYCLINIC_RECIPE_PATIENT_LINK add constraint FK_RECPAT_ON_RECIPE foreign key (RECIPE_ID) references POLYCLINIC_RECIPE(ID);
alter table POLYCLINIC_RECIPE_PATIENT_LINK add constraint FK_RECPAT_ON_PATIENT foreign key (PATIENT_ID) references POLYCLINIC_PATIENT(ID);