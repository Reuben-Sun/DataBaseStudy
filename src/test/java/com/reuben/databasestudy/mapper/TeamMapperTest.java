package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Team;
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
class TeamMapperTest {

    @Autowired
    TeamMapper teamMapper;

    @Test
    void insertTeam() {

        Team team = new Team();
        team.setName("23333");
        team.setAccount("1111111");
        team.setPassword("2222222");
        int i = teamMapper.insertTeam(team);

        assertEquals(1, i);

        List<Team> teams = teamMapper.selectAll();
        assertEquals(1, teams.size());
        assertEquals("23333",teams.get(0).getName());
    }

}