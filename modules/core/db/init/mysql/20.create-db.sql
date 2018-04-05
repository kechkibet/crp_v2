-- begin PERSONS
alter table persons add constraint FK_PERSONS_PHOTO foreign key (PHOTO_ID) references SYS_FILE(ID)^
create index IDX_PERSONS_PHOTO on persons (PHOTO_ID)^
-- end PERSONS
-- begin PROPERTYREGISTER
alter table propertyregister add constraint FK_PROPERTYREGISTER_`VALUATIONROLL` foreign key (`VALUATIONROLL`) references valuationrolls(ID)^
alter table propertyregister add constraint FK_PROPERTYREGISTER_`SUBCOUNTY` foreign key (`SUBCOUNTY`) references subcounties(ID)^
alter table propertyregister add constraint FK_PROPERTYREGISTER_`RATEPAYER` foreign key (`RATEPAYER`) references persons(ID)^
create index IDX_PROPERTYREGISTER_`VALUATIONROLL` on propertyregister (`VALUATIONROLL`)^
create index IDX_PROPERTYREGISTER_`SUBCOUNTY` on propertyregister (`SUBCOUNTY`)^
create index IDX_PROPERTYREGISTER_`RATEPAYER` on propertyregister (`RATEPAYER`)^
-- end PROPERTYREGISTER
-- begin VALUATIONROLLS
alter table valuationrolls add constraint FK_VALUATIONROLLS_`SUBCOUNTY` foreign key (`SUBCOUNTY`) references subcounties(ID)^
create index IDX_VALUATIONROLLS_`SUBCOUNTY` on valuationrolls (`SUBCOUNTY`)^
-- end VALUATIONROLLS
