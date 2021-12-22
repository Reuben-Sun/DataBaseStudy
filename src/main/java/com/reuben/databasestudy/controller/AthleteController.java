package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.dto.AthleteDetail;
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

    //插入一个运动员信息，组别默认
    @PostMapping("/addAthlete")
    int insertAthlete(@RequestBody AthleteDetail athleteDetail){
        int i = athleteService.insertAthlete(athleteDetail);
        return i;
    }

    @GetMapping("/selectByGroup")
    List<AthleteDetail> selectByGroup(int groupId){
        List<AthleteDetail> athleteByGroup = athleteService.getAthleteByGroup(groupId);
        return athleteByGroup;
    }

    //根据运动员Id和比赛Id，修改组别
    @GetMapping("/updateGroup")
    int updateGroup(int athleteId, int eventId, int groupId){
        int i = athleteService.updateAthleteGroup(athleteId, eventId, groupId);
        return i;
    }

    @GetMapping("/selectByTeam")
    List<AthleteDetail> selectByTeam(int teamId){
        List<AthleteDetail> details = athleteService.selectAthleteByTeam(teamId);
        return details;
    }

}
