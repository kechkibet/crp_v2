alter table propertyregister change column uploadStampDuty uploadStampDuty__UNUSED longblob;
alter table propertyregister change column status status__UNUSED varchar(255);
alter table propertyregister change column interest interest__UNUSED varchar(255);
alter table propertyregister change column uploadTitleDeed uploadTitleDeed__UNUSED longblob;
alter table propertyregister add column UPLOADTITLEDEED varchar(32) ;
alter table propertyregister add column INTEREST integer ;
alter table propertyregister add column STATUS boolean ;
alter table propertyregister add column UPLOADSTAMPDUTY varchar(32) ;
