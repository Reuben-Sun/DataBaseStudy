package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Team;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeamMapper {
    @Insert("insert into team (name, account, password) values (#{name}, #{account}, #{password})")
    int insertTeam(Team team);
    @Delete("delete from team where id=#{id}")
    int deleteTeam(int id);
    @Select("select * from team")
    List<Team> selectAll();     //返回所有队伍信息
    @Update("update team set name=#{name}, account=#{account}, password=#{password} where id=#{id}")
    int updateTeam(Team team);
}
