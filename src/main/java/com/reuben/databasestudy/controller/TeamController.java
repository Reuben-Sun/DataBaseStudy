package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.Team;
import com.reuben.databasestudy.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    TeamMapper teamMapper;

    //返回所有的队伍信息
    @GetMapping("/selectAll")
    List<Team> selectAll(){
        List<Team> teams = teamMapper.selectAll();
        return teams;
    }
    //加一个队伍信息
    @PostMapping("/addTeam")
    int insertTeam(@RequestBody Team team){
        int i = teamMapper.insertTeam(team);
        return i;
    }
    //更新队伍信息
    @PostMapping("/updateTeam")
    int updateTeam(@RequestBody Team team){
        int i = teamMapper.updateTeam(team);
        return i;
    }
    //删除队伍信息
    @GetMapping("/deleteTeam")
    int deleteTeam(int id){
        int i = teamMapper.deleteTeam(id);
        return i;
    }
}
