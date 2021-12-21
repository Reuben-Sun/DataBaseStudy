package com.reuben.databasestudy.dto;

import com.reuben.databasestudy.entity.Athlete;
import com.reuben.databasestudy.entity.Event;
import lombok.Data;

import java.util.List;

@Data
public class AthleteDetail {
    Athlete athlete;
    List<Event> events;
}
