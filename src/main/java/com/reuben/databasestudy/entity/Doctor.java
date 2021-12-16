package com.reuben.databasestudy.entity;

import lombok.Data;

@Data
public class Doctor {
    int id;
    String name;
    String idNumber;    //身份证
    String phone;
    int teamId;
}
