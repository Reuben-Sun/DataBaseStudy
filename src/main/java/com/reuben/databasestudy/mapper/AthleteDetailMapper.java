package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.AthleteDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AthleteDetailMapper {
    List<AthleteDetail> selectById(int id);
}
