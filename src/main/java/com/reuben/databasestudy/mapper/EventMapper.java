package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Event;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EventMapper {
    @Insert("insert into event (name, sex) values (#{name}, #{sex}")
    int insertEvent(Event event);
    @Delete("delete from event where id=#{id}")
    int deleteEvent(int id);
    @Select("select * from event")
    List<Event> selectAll();
    @Update("update event set name=#{name}, sex=#{sex} where id=#{id}")
    int updateEvent(Event event);
}
