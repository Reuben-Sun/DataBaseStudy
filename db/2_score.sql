create table score
(
    ID           int auto_increment,
    SCORE_NUMBER float   null,
    TYPE         tinyint null,
    SCORE_TYPE   tinyint null,
    ATHLETE_ID   int     null,
    EVENT_ID     int     null,
    REFEREE_ID   int     null,
    constraint SCORE_ID_uindex
        unique (ID),
    constraint SCORE_athlete_ID_fk
        foreign key (ATHLETE_ID) references athlete (ID)
            on update cascade,
    constraint SCORE_event_ID_fk
        foreign key (EVENT_ID) references event (ID)
            on update cascade,
    constraint SCORE_referee_ID_fk
        foreign key (REFEREE_ID) references referee (ID)
            on update cascade
);

alter table score
    add primary key (ID);

