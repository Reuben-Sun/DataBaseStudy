package com.reuben.databasestudy.entity;

import lombok.Data;

@Data
public class Referee {  //裁判
    int id;
    String name;
    String idNumber;
    String phone;
    int teamId;
    String account;   //账号
    String password;  //密码

}
