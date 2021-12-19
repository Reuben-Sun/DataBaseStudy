package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.Referee;
import com.reuben.databasestudy.mapper.RefereeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/referee")
public class RefereeController {
    @Autowired
    RefereeMapper refereeMapper;

    @GetMapping("/selectAll")
    List<Referee> selectAll(){
        List<Referee> referees = refereeMapper.selectAll();
        return referees;
    }

    @GetMapping("/selectByTeam")
    List<Referee> selectByTeam(int teamId){
        List<Referee> referees = refereeMapper.selectByTeam(teamId);
        return referees;
    }

    @PostMapping("/insertReferee")
    int insertReferee(@RequestBody Referee referee){
        int i = refereeMapper.insertReferee(referee);
        return i;
    }

    @PostMapping("/updateReferee")
    int updateReferee(@RequestBody Referee referee){
        int i = refereeMapper.updateReferee(referee);
        return i;
    }

    @GetMapping("/deleteReferee")
    int deleteReferee(int id){
        int i = refereeMapper.deleteReferee(id);
        return i;
    }


}
