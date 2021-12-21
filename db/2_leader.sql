create table leader
(
    ID        int auto_increment,
    NAME      varchar(20) null,
    ID_NUMBER varchar(20) null,
    PHONE     varchar(20) null,
    TEAM_ID   int         null,
    constraint LEADER_ID_uindex
        unique (ID),
    constraint LEADER_team_ID_fk
        foreign key (TEAM_ID) references team (ID)
            on update cascade
);

alter table leader
    add primary key (ID);

