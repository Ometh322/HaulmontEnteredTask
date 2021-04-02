alter table POLYCLINIC_RECIPE add column DURATION integer ^
update POLYCLINIC_RECIPE set DURATION = 0 where DURATION is null ;
alter table POLYCLINIC_RECIPE alter column DURATION set not null ;
