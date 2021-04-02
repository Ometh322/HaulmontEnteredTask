alter table POLYCLINIC_RECIPE alter column DURATION_TIME rename to DURATION_TIME__U59091 ^
alter table POLYCLINIC_RECIPE add column DURATION_TIME date ^
update POLYCLINIC_RECIPE set DURATION_TIME = current_date where DURATION_TIME is null ;
alter table POLYCLINIC_RECIPE alter column DURATION_TIME set not null ;
