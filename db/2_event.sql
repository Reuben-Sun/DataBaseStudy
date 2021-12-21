create table event
(
    ID   int auto_increment,
    NAME varchar(20) null,
    SEX  tinyint     null,
    constraint EVENT_ID_uindex
        unique (ID)
);

alter table event
    add primary key (ID);

INSERT INTO `2`.event (ID, NAME, SEX) VALUES (1, '铅球', 0);
INSERT INTO `2`.event (ID, NAME, SEX) VALUES (2, '50米', 0);
INSERT INTO `2`.event (ID, NAME, SEX) VALUES (3, '1000米', 0);