package com.reuben.databasestudy.entity;

import lombok.Data;

@Data
public class Attend {   //参加关系表
    int id;
    int athleteId;
    int eventId;
    int type;
    int groupId;
    int orderNumber;

}
