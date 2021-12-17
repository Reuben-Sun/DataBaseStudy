package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.AthleteDetail;
import com.reuben.databasestudy.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/athlete")
public class AthleteController {
    @Autowired
    AthleteService athleteService;

    @GetMapping("/selectAll")
    AthleteDetail selectAll(int id){
        AthleteDetail athleteById = athleteService.getAthleteById(id);
        return athleteById;
    }
}
