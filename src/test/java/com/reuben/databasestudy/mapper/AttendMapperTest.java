package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Attend;
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
class AttendMapperTest {
    @Autowired
    AttendMapper attendMapper;
    @Test
    void selectByEvent() {
        List<Attend> attends = attendMapper.selectByEvent(1);
        assertEquals(2,attends.size());
    }
}