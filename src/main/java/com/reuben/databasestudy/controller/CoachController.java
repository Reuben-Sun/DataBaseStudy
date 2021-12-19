package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.Coach;
import com.reuben.databasestudy.mapper.CoachMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    CoachMapper coachMapper;

    @GetMapping("/selectAll")
    List<Coach> selectAll(){
        List<Coach> coaches = coachMapper.selectAll();
        return coaches;
    }

    @GetMapping("/selectByTeam")
    Coach selectByTeam(int teamId){
        Coach coach = coachMapper.selectByTeam(teamId);
        return coach;
    }

    @PostMapping("/addCoach")
    int insertCoach(@RequestBody Coach coach){
        int i = coachMapper.insertCoach(coach);
        return i;
    }

    @PostMapping("/updateCoach")
    int updateCoach(@RequestBody Coach coach){
        int i = coachMapper.updateCoach(coach);
        return i;
    }

    @GetMapping("/deleteCoach")
    int deleteCoach(int id){
        int i = coachMapper.deleteCoach(id);
        return i;
    }

}
