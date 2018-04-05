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
    `uploadTitleDeed` varchar(32),
    `sizeInHa` integer,
    interest integer,
    `leaseStartDate` date,
    `leaseExpiry` integer,
    status boolean,
    `uploadStampDuty` varchar(32),
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
    `rollType` integer not null,
    `landUse` integer not null,
    `siteValue` varchar(255),
    `valuationMethod` integer,
    `ratingMethod` integer,
    `annualRate` varchar(255),
    `rentBasedOn` integer,
    exempt varchar(255),
    `rateableValue` varchar(255),
    `sizeInHa` integer,
    `subCounty` integer,
    --
    primary key (ID)
)^
-- end VALUATIONROLLS
-- begin CRPV2_CADASTRE
create table CRPV2_CADASTRE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    POLYGON_GEOMETRY varchar(255),
    --
    primary key (ID)
)^
-- end CRPV2_CADASTRE
-- begin ACCOUNTCATEGORY
create table accountcategory (
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
    description varchar(255),
    --
    primary key (ID)
)^
-- end ACCOUNTCATEGORY
-- begin CHARTOFACCOUNTS
create table chartofaccounts (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    code varchar(255),
    name varchar(255),
    `accountType` varchar(255),
    category integer,
    --
    primary key (ID)
)^
-- end CHARTOFACCOUNTS
-- begin DEPARTMENTS
create table departments (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `deptName` varchar(255),
    `ministryID` integer,
    --
    primary key (ID)
)^
-- end DEPARTMENTS
-- begin MINISTRIES
create table ministries (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `ministryName` varchar(255),
    --
    primary key (ID)
)^
-- end MINISTRIES
-- begin REVENUECATEGORY
create table revenuecategory (
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
    `subCounty` integer,
    --
    primary key (ID)
)^
-- end REVENUECATEGORY
-- begin REVENUESTREAMS
create table revenuestreams (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    category integer,
    `revenueCode` integer,
    `revenueName` varchar(255),
    price varchar(255),
    status varchar(255),
    `defaultDebitAC` integer,
    `defaultCreditAC` integer,
    `revenuceCode` integer,
    department integer,
    --
    primary key (ID)
)^
-- end REVENUESTREAMS
-- begin ACTIVITYCODES
create table activitycodes (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `countyActivityCode` varchar(255),
    description varchar(255),
    `unitOfMeasure` varchar(255),
    `permitYearlyAmount` integer,
    status varchar(255),
    --
    primary key (ID)
)^
-- end ACTIVITYCODES
-- begin BUSINESSES
create table businesses (
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
    description varchar(255),
    `regNo` varchar(255),
    email varchar(255),
    `phoneNumber` varchar(255),
    address varchar(255),
    status varchar(255),
    town varchar(255),
    street varchar(255),
    `buildingName` varchar(255),
    --
    primary key (ID)
)^
-- end BUSINESSES
-- begin BUSINESSPERMITS
create table businesspermits (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    status varchar(255),
    `amountPaid` integer,
    `expiryDate` date,
    `creationDate` date,
    `permitPayer` integer,
    description varchar(255),
    `businessID` integer,
    `activityCode` integer,
    `propertyRegisterID` integer,
    `numberOfEmployees` integer,
    `certificateNo` integer,
    `rcptNumber` integer,
    `invoiceNumber` integer,
    --
    primary key (ID)
)^
-- end BUSINESSPERMITS
-- begin INVOICELINES
create table invoicelines (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    amount integer,
    description varchar(255),
    `invoiceID` integer,
    `streamID` integer,
    qty double precision,
    `unitPrice` integer,
    --
    primary key (ID)
)^
-- end INVOICELINES
-- begin INVOICES
create table invoices (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    partner integer,
    date date,
    `dueDate` date,
    status varchar(255),
    `dueAmount` integer,
    `invoiceType` varchar(255),
    `metaData` varchar(255),
    --
    primary key (ID)
)^
-- end INVOICES
-- begin OFFLINESTREAMS
create table offlinestreams (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    collector integer,
    section integer,
    stream integer,
    --
    primary key (ID)
)^
-- end OFFLINESTREAMS
-- begin PAYMENTMODES
create table paymentmodes (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `modeName` varchar(255),
    `debitAccount` integer,
    --
    primary key (ID)
)^
-- end PAYMENTMODES
-- begin PAYMENTS
create table payments (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `invoiceID` integer,
    `paymentType` varchar(255),
    `originID` varchar(255),
    amount integer,
    description varchar(255),
    `createdDate` datetime(3) not null,
    --
    primary key (ID)
)^
-- end PAYMENTS
-- begin PORTALUSERROLES
create table portaluserroles (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `userID` integer,
    role varchar(255),
    --
    primary key (ID)
)^
-- end PORTALUSERROLES
-- begin PORTALUSERS
create table portalusers (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    username varchar(255),
    password varchar(255),
    `fullName` varchar(255),
    --
    primary key (ID)
)^
-- end PORTALUSERS
-- begin PROPERTYCHARGES
create table propertycharges (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `propertyID` integer not null,
    `amountCharged` varchar(255) not null,
    `chargeType` varchar(255) not null,
    `dateCharged` date not null,
    `cronJobID` varchar(255),
    `invoiceID` integer,
    --
    primary key (ID)
)^
-- end PROPERTYCHARGES
-- begin RECONFILES
create table reconfiles (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `totalToReconcile` varchar(255),
    `totalAmount` varchar(255),
    collector integer,
    `invoiceID` integer,
    `startDate` date,
    `endDate` date,
    --
    primary key (ID)
)^
-- end RECONFILES
-- begin REVENUECOLLECTIONTRANSACTIONS
create table revenuecollectiontransactions (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    VERSION integer,
    --
    `revenueStream` integer,
    `revenueCollector` integer,
    datetime datetime(3),
    description varchar(255),
    `paymentMode` varchar(255),
    `paymentID` varchar(255),
    `revenueSection` integer,
    amount integer,
    `offlineID` varchar(255),
    `citizenID` integer,
    `paymentModeID` integer,
    `reconStatus` integer,
    `reconFileID` integer,
    --
    primary key (ID)
)^
-- end REVENUECOLLECTIONTRANSACTIONS
-- begin REVENUECOLLECTORS
create table revenuecollectors (
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
    `idNumber` varchar(255),
    `deviceSN` varchar(255),
    `devicePIN` integer,
    `offlineCreditLimit` integer,
    `offlineRcptNumber` integer,
    `isBackOffice` boolean,
    `reconPerson` integer,
    --
    primary key (ID)
)^
-- end REVENUECOLLECTORS
