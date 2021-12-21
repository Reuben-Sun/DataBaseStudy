package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Score;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper {
    @Insert("insert into score (score_number, type, score_type, athlete_id, event_id, referee_id) values (#{scoreNumber}, #{type}, #{scoreType}, #{athleteId}, #{eventId}, #{refereeId})")
    int addScore(Score score);
    @Delete("delete from score where id=#{id}")
    int deleteScore(int id);
    @Select("select * from score")
    List<Score> selectAll();
    @Select("select * from score where athlete_id=#{athleteId} and event_id=#{eventId}")
    Score selectByAthlete(int athleteId, int eventId);
    @Select("select * from score where event_id=#{eventId}")
    List<Score> selectAEvent(int eventId);
}
