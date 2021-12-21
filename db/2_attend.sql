create table attend
(
    ID           int auto_increment,
    ATHLETE_ID   int     null,
    EVENT_ID     int     null,
    TYPE         tinyint null,
    GROUP_ID     int     null,
    ORDER_NUMBER int     null,
    constraint ATTEND_ID_uindex
        unique (ID),
    constraint ATTEND_athlete_ID_fk
        foreign key (ATHLETE_ID) references athlete (ID)
            on update cascade,
    constraint ATTEND_event_ID_fk
        foreign key (EVENT_ID) references event (ID)
            on update cascade
);

alter table attend
    add primary key (ID);

INSERT INTO `2`.attend (ID, ATHLETE_ID, EVENT_ID, TYPE, GROUP_ID, ORDER_NUMBER) VALUES (1, 1, 1, 0, 1, 1);
INSERT INTO `2`.attend (ID, ATHLETE_ID, EVENT_ID, TYPE, GROUP_ID, ORDER_NUMBER) VALUES (2, 1, 2, 0, 1, 1);
INSERT INTO `2`.attend (ID, ATHLETE_ID, EVENT_ID, TYPE, GROUP_ID, ORDER_NUMBER) VALUES (3, 1, 3, 0, 2, 1);
INSERT INTO `2`.attend (ID, ATHLETE_ID, EVENT_ID, TYPE, GROUP_ID, ORDER_NUMBER) VALUES (4, 2, 1, 0, 1, 3);