package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Attend;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AttendMapper {
    @Select("select * from attend")
    List<Attend> selectAll();
    @Select("select * from attend where event_id=#{eventId}")
    List<Attend> selectByEvent(int eventId);
    @Select("select * from attend where group_id=#{groupId}")
    List<Attend> selectByGroup(int groupId);
    @Select("select * from attend where athlete_id=#{athleteId} and event_id=#{eventId}")
    Attend selectByEventAthlete(int athleteId, int eventId);
    @Update("update attend set group_id=#{groupId} where id=#{id}")
    int updateGroup(int id, int groupId);
}
