package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.AthleteDetail;
import com.reuben.databasestudy.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/athlete")
public class AthleteController {
    @Autowired
    AthleteService athleteService;

    @GetMapping("/selectById")
    AthleteDetail selectById(int id){
        AthleteDetail athleteById = athleteService.getAthleteById(id);
        return athleteById;
    }

    @GetMapping("/selectAll")
    List<AthleteDetail> selectAll(){
        List<AthleteDetail> allAthlete = athleteService.getAllAthlete();
        return  allAthlete;
    }

    @GetMapping("/selectByEvent")
    List<AthleteDetail> selectByEvent(Integer eventId){
        List<AthleteDetail> athleteByEvent = athleteService.getAthleteByEvent(eventId);
        return athleteByEvent;
    }

    @PostMapping("/addAthlete")
    int insertAthlete(@RequestBody AthleteDetail athleteDetail){
        int i = athleteService.insertAthlete(athleteDetail);
        return i;
    }
}
