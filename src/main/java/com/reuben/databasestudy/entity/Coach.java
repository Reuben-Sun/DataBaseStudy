package com.reuben.databasestudy.entity;

import lombok.Data;

@Data
public class Coach {
    int id;
    String name;
    String phone;
    int sex;
    int teamId;
    String idNumber;   //身份证
}
