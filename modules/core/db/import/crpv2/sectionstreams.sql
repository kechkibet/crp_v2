-- Create new columns
alter table sectionstreams add column CREATE_TS datetime(3) ;
alter table sectionstreams add column CREATED_BY varchar(50) ;
alter table sectionstreams add column UPDATE_TS datetime(3) ;
alter table sectionstreams add column UPDATED_BY varchar(50) ;
alter table sectionstreams add column DELETE_TS datetime(3) ;
alter table sectionstreams add column DELETED_BY varchar(50) ;
alter table sectionstreams add column VERSION integer ;
update sectionstreams set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import',
 VERSION = 0 ;
