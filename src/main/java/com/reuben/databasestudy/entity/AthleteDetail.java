package com.reuben.databasestudy.entity;

import lombok.Data;

import java.util.List;

@Data
public class AthleteDetail {
    Athlete athlete;
    List<Event> events;
}
