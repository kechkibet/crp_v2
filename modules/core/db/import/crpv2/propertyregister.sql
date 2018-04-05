-- Create new columns
alter table propertyregister add column CREATE_TS datetime(3) ;
alter table propertyregister add column CREATED_BY varchar(50) ;
alter table propertyregister add column UPDATE_TS datetime(3) ;
alter table propertyregister add column UPDATED_BY varchar(50) ;
alter table propertyregister add column DELETE_TS datetime(3) ;
alter table propertyregister add column DELETED_BY varchar(50) ;
alter table propertyregister add column VERSION integer ;
update propertyregister set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import',
 VERSION = 0 ;
