alter table persons add constraint FK_PERSONS_PHOTO foreign key (PHOTO_ID) references SYS_FILE(ID);
create index IDX_PERSONS_PHOTO on persons (PHOTO_ID);
