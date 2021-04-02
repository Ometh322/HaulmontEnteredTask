alter table POLYCLINIC_RECIPE alter column PRIORITY rename to PRIORITY__U68852 ^
alter table POLYCLINIC_RECIPE alter column PRIORITY__U68852 set null ;
alter table POLYCLINIC_RECIPE add column PRIORITY integer ^
update POLYCLINIC_RECIPE set PRIORITY = 10 where PRIORITY is null ;
alter table POLYCLINIC_RECIPE alter column PRIORITY set not null ;
