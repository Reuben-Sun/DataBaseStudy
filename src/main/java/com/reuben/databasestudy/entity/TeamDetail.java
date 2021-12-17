package com.reuben.databasestudy.entity;

import lombok.Data;

import java.util.List;

@Data
public class TeamDetail {
    Team team;
    Coach coach;
    Doctor doctor;
    List<AthleteDetail> athleteDetails;
    List<Referee> referees;
}
