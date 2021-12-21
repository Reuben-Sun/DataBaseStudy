create table coach
(
    ID        int auto_increment,
    NAME      varchar(20) null,
    PHONE     varchar(20) null,
    SEX       tinyint     null,
    TEAM_ID   int         null,
    ID_NUMBER varchar(20) null,
    constraint COACH_ID_uindex
        unique (ID),
    constraint COACH_team_ID_fk
        foreign key (TEAM_ID) references team (ID)
            on update cascade
);

alter table coach
    add primary key (ID);

