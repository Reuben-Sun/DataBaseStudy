create table referee
(
    ID        int auto_increment,
    NAME      varchar(20) null,
    ID_NUMBER varchar(20) null,
    PHONE     varchar(20) null,
    TEAM_ID   int         null,
    ACCOUNT   varchar(20) null,
    PASSWORD  varchar(20) null,
    constraint REFEREE_ID_uindex
        unique (ID),
    constraint REFEREE_team_ID_fk
        foreign key (TEAM_ID) references team (ID)
            on update cascade
);

alter table referee
    add primary key (ID);

