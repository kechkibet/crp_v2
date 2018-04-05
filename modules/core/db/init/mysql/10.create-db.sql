-- begin PERSONS
create table persons (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `personFirstName` varchar(255),
    PHOTO_ID varchar(32),
    `personLastName` varchar(255),
    `idNumber` varchar(255),
    `phoneNumber` varchar(255),
    address varchar(255),
    `emailAddress` varchar(255),
    --
    primary key (ID)
)^
-- end PERSONS
-- begin PROPERTYREGISTER
create table propertyregister (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `gpsLongitude` varchar(255),
    `gpsLatitude` varchar(255),
    `gpsAltitude` varchar(255),
    `lrNumber` varchar(255),
    `physicalLocation` varchar(255),
    `valuationRoll` integer not null,
    `subCounty` integer,
    `uploadTitleDeed` longblob,
    `sizeInHa` integer,
    interest varchar(255),
    `leaseStartDate` date,
    `leaseExpiry` integer,
    status varchar(255),
    `uploadStampDuty` longblob,
    `sellingValue` integer,
    `ratePayer` integer not null,
    --
    primary key (ID)
)^
-- end PROPERTYREGISTER
-- begin SUBCOUNTIES
create table subcounties (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    name varchar(255),
    `iebcCode` varchar(255),
    --
    primary key (ID)
)^
-- end SUBCOUNTIES
-- begin VALUATIONROLLS
create table valuationrolls (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `valuationCode` integer,
    name varchar(255) not null,
    `rollType` varchar(255) not null,
    `landUse` varchar(255) not null,
    `siteValue` varchar(255),
    `valuationMethod` varchar(255),
    `ratingMethod` varchar(255),
    `annualRate` varchar(255),
    `rentBasedOn` varchar(255),
    exempt varchar(255),
    `rateableValue` varchar(255),
    `sizeInHa` integer,
    `subCounty` integer,
    --
    primary key (ID)
)^
-- end VALUATIONROLLS
