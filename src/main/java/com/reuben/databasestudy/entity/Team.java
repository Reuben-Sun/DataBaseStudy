package com.reuben.databasestudy.entity;

import lombok.Data;

@Data
public class Team {     //管理员界面的队伍信息
    int id;
    String name;
    String account;
    String password;
}
