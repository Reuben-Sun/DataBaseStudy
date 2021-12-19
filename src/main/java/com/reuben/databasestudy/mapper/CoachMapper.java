package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Coach;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CoachMapper {
    @Insert("insert into coach (name, phone, sex, team_id, id_number) values (#{name}, #{phone}, #{sex}, #{teamId}, #{idNumber})")
    int insertCoach(Coach coach);
    @Delete("delete from coach where id=#{id}")
    int deleteCoach(int id);
    @Select("select * from coach")
    List<Coach> selectAll();
    @Select("select * from coach where team_id=#{teamId}")
    Coach selectByTeam(int teamId);
    @Update("update coach set name=#{name}, phone=#{phone}, sex=#{sex}, team_id=#{teamId}, id_number=#{idNumber}")
    int updateCoach(Coach coach);
}
