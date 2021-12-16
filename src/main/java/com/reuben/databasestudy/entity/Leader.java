package com.reuben.databasestudy.entity;

import lombok.Data;

@Data
public class Leader {   //领队
    int id;
    String name;
    String idNumber;
    String phone;
    int teamId;
}
