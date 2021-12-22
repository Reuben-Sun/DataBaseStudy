package com.reuben.databasestudy.service;

import com.reuben.databasestudy.entity.Athlete;
import com.reuben.databasestudy.dto.AthleteDetail;
import com.reuben.databasestudy.entity.Event;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback
class AthleteServiceTest {

    @Autowired
    AthleteService athleteService;


    @Test
    @Transactional
    void insertAthlete() {
        AthleteDetail detail = new AthleteDetail();
        Athlete athlete = new Athlete();
        athlete.setAge(20);
        athlete.setName("大刘");
        athlete.setIdNumber("11112222");
        athlete.setSex(0);
        athlete.setAgeClassId(1);
        athlete.setTeamId(4);
        List<Event> events = new ArrayList<Event>();
        Event event1 = new Event();
        event1.setId(1);
        Event event2= new Event();
        event2.setId(3);
//        event1.setName("铅球");
//        event1.setSex(0);
        events.add(event1);
        events.add(event2);

        detail.setAthlete(athlete);
        detail.setEvents(events);
        athleteService.insertAthlete(detail);

        AthleteDetail allAthlete = athleteService.getAthleteById(detail.getAthlete().getId());
        assertEquals(1, allAthlete.getEvents().size());




    }
}