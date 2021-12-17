package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Athlete;
import com.reuben.databasestudy.entity.AthleteDetail;
import com.reuben.databasestudy.entity.Attend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AthleteDetailMapper {
    List<AthleteDetail> selectAll();
    AthleteDetail selectById(int id);
    int insertAthlete(Athlete athlete);
    int insertAttend(Attend attend);
}
