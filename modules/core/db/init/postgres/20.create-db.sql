-- begin TEST_SPACECRAFT
alter table TEST_SPACECRAFT add constraint FK_TEST_SPACECRAFT_ON_TYPE foreign key (TYPE_ID) references TEST_SPACECRAFT_TYPE(ID)^
create index IDX_TEST_SPACECRAFT_ON_TYPE on TEST_SPACECRAFT (TYPE_ID)^
-- end TEST_SPACECRAFT