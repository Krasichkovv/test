-- begin TEST_SPACECRAFT
create table TEST_SPACECRAFT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    ROCKET varchar(255),
    BOOSTER varchar(255),
    LENGHT integer,
    DIAMETR integer,
    WEIGHT integer,
    TYPE_ID uuid,
    --
    primary key (ID)
)^
-- end TEST_SPACECRAFT
-- begin TEST_BOOSTER
create table TEST_BOOSTER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    LENGHT integer,
    --
    primary key (ID)
)^
-- end TEST_BOOSTER
-- begin TEST_ROCKET
create table TEST_ROCKET (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    DIAMETER varchar(255),
    --
    primary key (ID)
)^
-- end TEST_ROCKET
-- begin TEST_SPACECRAFT_TYPE
create table TEST_SPACECRAFT_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end TEST_SPACECRAFT_TYPE
