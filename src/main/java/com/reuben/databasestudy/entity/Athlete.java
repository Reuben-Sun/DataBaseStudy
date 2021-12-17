package com.reuben.databasestudy.entity;

import lombok.Data;

@Data
public class Athlete {
    int id;
    String name;
    String idNumber;
    int age;
    int ageClassId;
    int sex;
}
