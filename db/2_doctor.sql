create table doctor
(
    ID        int auto_increment,
    NAME      varchar(20) null,
    ID_NUMBER varchar(20) null,
    PHONE     varchar(20) null,
    TEAM_ID   int         null,
    constraint DOCTOR_ID_uindex
        unique (ID),
    constraint DOCTOR_team_ID_fk
        foreign key (TEAM_ID) references team (ID)
            on update cascade
);

alter table doctor
    add primary key (ID);

