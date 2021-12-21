create table age_class
(
    ID      int auto_increment,
    NAME    varchar(20) null,
    MIN_AGE int         null,
    MAX_AGE int         null,
    constraint AGE_CLASS_ID_uindex
        unique (ID)
);

alter table age_class
    add primary key (ID);

INSERT INTO `2`.age_class (ID, NAME, MIN_AGE, MAX_AGE) VALUES (1, '少儿', 0, 14);
INSERT INTO `2`.age_class (ID, NAME, MIN_AGE, MAX_AGE) VALUES (2, '青少年', 15, 18);
INSERT INTO `2`.age_class (ID, NAME, MIN_AGE, MAX_AGE) VALUES (3, '成年人', 19, 100);