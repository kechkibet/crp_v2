-- Create new columns
alter table valuationrolls add column CREATE_TS datetime(3) ;
alter table valuationrolls add column CREATED_BY varchar(50) ;
alter table valuationrolls add column UPDATE_TS datetime(3) ;
alter table valuationrolls add column UPDATED_BY varchar(50) ;
alter table valuationrolls add column VERSION integer ;
update valuationrolls set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import',
 VERSION = 0 ;
