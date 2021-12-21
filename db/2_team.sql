create table team
(
    ID       int auto_increment,
    NAME     varchar(20) null,
    ACCOUNT  varchar(20) null,
    PASSWORD varchar(20) null,
    constraint TEAM_ID_uindex
        unique (ID)
);

alter table team
    add primary key (ID);

