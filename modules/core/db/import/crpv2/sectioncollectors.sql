-- Create new columns
alter table sectioncollectors add column CREATE_TS datetime(3) ;
alter table sectioncollectors add column CREATED_BY varchar(50) ;
alter table sectioncollectors add column VERSION integer ;
alter table sectioncollectors add column UPDATE_TS datetime(3) ;
alter table sectioncollectors add column UPDATED_BY varchar(50) ;
alter table sectioncollectors add column DELETE_TS datetime(3) ;
alter table sectioncollectors add column DELETED_BY varchar(50) ;
update sectioncollectors set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 VERSION = 0,
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
