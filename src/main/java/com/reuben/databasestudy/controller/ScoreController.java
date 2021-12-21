package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.Score;
import com.reuben.databasestudy.mapper.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    ScoreMapper scoreMapper;

    @GetMapping("/selectAll")
    List<Score> selectAll(){
        List<Score> scores = scoreMapper.selectAll();
        return scores;
    }

    @GetMapping("/selectByAthlete")
    Score selectByAthlete(int athleteId, int eventId){
        Score score = scoreMapper.selectByAthlete(athleteId, eventId);
        return score;
    }

    @GetMapping("/selectByEvent")
    List<Score> selectByEvent(int eventId){
        List<Score> scores = scoreMapper.selectAEvent(eventId);
        return scores;
    }

    @GetMapping("/deleteScore")
    int deleteScore(int id){
        int i = scoreMapper.deleteScore(id);
        return i;
    }

    @PostMapping("/insertScore")
    int insertScore(@RequestBody Score score){
        int i = scoreMapper.addScore(score);
        return i;
    }
}
