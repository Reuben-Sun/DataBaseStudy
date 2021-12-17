package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.AthleteDetail;
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
class AthleteDetailMapperTest {
    @Autowired
    AthleteDetailMapper athleteDetailMapper;

    @Test
    void selectById() {
        AthleteDetail detail = athleteDetailMapper.selectById(1);
        assertEquals("张文迪", detail.getAthlete().getName());
    }
}