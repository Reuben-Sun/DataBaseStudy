package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Leader;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LeaderMapper {
    @Insert("insert into leader (name, id_number, phone, team_id) values (#{name}, #{idNumber}, #{phone}, #{teamId})")
    int insertLeader(Leader leader);
    @Delete("delete from leader where id=#{id}")
    int deleteLeader(int id);
    @Select("select * from leader")
    List<Leader> selectAll();
    @Select("select * from leader where team_id=#{teamId}")
    Leader selectByTeam(int teamId);
    @Update("update leader set name=#{name}, id_number=#{idNumber}, phone=#{phone}, team_id=#{teamId} where id=#{id}")
    int updateLeader(Leader leader);
}
