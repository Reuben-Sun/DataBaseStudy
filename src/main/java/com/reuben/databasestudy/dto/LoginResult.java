package com.reuben.databasestudy.dto;

import lombok.Data;

@Data
public class LoginResult {
    int accountType;    //0代表管理员，1代表裁判，2代表队伍
    int id;
}
