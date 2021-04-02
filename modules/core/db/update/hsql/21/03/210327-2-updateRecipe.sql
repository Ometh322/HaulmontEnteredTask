alter table POLYCLINIC_RECIPE alter column DURATION_TIME rename to DURATION_TIME__U78778 ^
alter table POLYCLINIC_RECIPE alter column DURATION_TIME__U78778 set null ;
alter table POLYCLINIC_RECIPE add column DURATION_TIME timestamp ^
update POLYCLINIC_RECIPE set DURATION_TIME = current_timestamp where DURATION_TIME is null ;
alter table POLYCLINIC_RECIPE alter column DURATION_TIME set not null ;
