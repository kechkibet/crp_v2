-- Create new columns
alter table subcounties add column CREATE_TS datetime(3) ;
alter table subcounties add column CREATED_BY varchar(50) ;
alter table subcounties add column UPDATE_TS datetime(3) ;
alter table subcounties add column UPDATED_BY varchar(50) ;
alter table subcounties add column DELETE_TS datetime(3) ;
alter table subcounties add column DELETED_BY varchar(50) ;
alter table subcounties add column VERSION integer ;
update subcounties set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import',
 VERSION = 0 ;
