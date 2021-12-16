package com.reuben.databasestudy.entity;

import lombok.Data;

@Data
public class Score {    //打分关系表
    int id;
    float scoreNumber;  //得分
    int type;           //比赛类型
    int scoreType;      //得分类型
    int athleteId;
    int eventId;
    int refereeId;
}
