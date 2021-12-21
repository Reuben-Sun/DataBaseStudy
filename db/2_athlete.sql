create table athlete
(
    ID           int auto_increment,
    NAME         varchar(20) null,
    ID_NUMBER    varchar(30) null,
    AGE          int         null,
    AGE_CLASS_ID int         null,
    SEX          tinyint     null,
    constraint ATHLETE_ID_uindex
        unique (ID),
    constraint ATHLETE_age_class_ID_fk
        foreign key (AGE_CLASS_ID) references age_class (ID)
            on update cascade
);

alter table athlete
    add primary key (ID);

INSERT INTO `2`.athlete (ID, NAME, ID_NUMBER, AGE, AGE_CLASS_ID, SEX) VALUES (1, '张文迪', '112233', 24, 2, 0);
INSERT INTO `2`.athlete (ID, NAME, ID_NUMBER, AGE, AGE_CLASS_ID, SEX) VALUES (2, '孙悟空', '114514', 2000, 3, 0);