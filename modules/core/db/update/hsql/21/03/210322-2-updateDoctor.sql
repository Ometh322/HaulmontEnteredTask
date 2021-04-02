alter table POLYCLINIC_DOCTOR add column NUM_OF_RECIPES integer ^
update POLYCLINIC_DOCTOR set NUM_OF_RECIPES = 0 where NUM_OF_RECIPES is null ;
alter table POLYCLINIC_DOCTOR alter column NUM_OF_RECIPES set not null ;
