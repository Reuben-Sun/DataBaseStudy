package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Attend;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AttendMapper {
    @Select("select * from attend")
    List<Attend> selectAll();
    @Select("select * from attend where event_id=#{eventId}")
    List<Attend> selectByEvent(int eventId);
}
