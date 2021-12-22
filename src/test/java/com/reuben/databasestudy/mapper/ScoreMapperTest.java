package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Score;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback
class ScoreMapperTest {
    @Autowired
    ScoreMapper scoreMapper;

    @Test
    void addScore() {
        Score score = new Score();
        score.setAthleteId(1);
        score.setEventId(1);
        score.setScoreNumber(10.0f);
        score.setRefereeId(1);
        int i = scoreMapper.addScore(score);
        List<Score> scores = scoreMapper.selectAll();
        assertEquals(1,scores.size());
    }
}