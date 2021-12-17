package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.TeamDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeamDetailMapper {
    List<TeamDetail> selectAll();
}
