package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.Leader;
import com.reuben.databasestudy.mapper.LeaderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leader")
public class LeaderController {
    @Autowired
    LeaderMapper leaderMapper;

    @GetMapping("/selectByTeam")
    Leader selectByTeam(int teamId){
        Leader leader = leaderMapper.selectByTeam(teamId);
        return leader;
    }

    @PostMapping("/insertLeader")
    int insertLeader(@RequestBody Leader leader){
        int i = leaderMapper.insertLeader(leader);
        return i;
    }

    @DeleteMapping("/deleteLeader")
    int deleteLeader(int id){
        int i = leaderMapper.deleteLeader(id);
        return i;
    }

    @GetMapping("/selectAll")
    List<Leader> selectAll(){
        List<Leader> leaders = leaderMapper.selectAll();
        return leaders;
    }
}
