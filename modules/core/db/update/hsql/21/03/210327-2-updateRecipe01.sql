alter table POLYCLINIC_RECIPE alter column DURATION_TIME rename to DURATION_TIME__U56085 ^
alter table POLYCLINIC_RECIPE alter column DURATION_TIME__U56085 set null ;
alter table POLYCLINIC_RECIPE add column END_DATE timestamp ^
update POLYCLINIC_RECIPE set END_DATE = current_timestamp where END_DATE is null ;
alter table POLYCLINIC_RECIPE alter column END_DATE set not null ;
