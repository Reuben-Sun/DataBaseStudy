package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Referee;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.ListResourceBundle;

@Mapper
public interface RefereeMapper {
    @Insert("insert into referee (name, id_number, phone, team_id, account, password) values (#{name}, #{idNumber}, #{phone}, #{team_id}, #{account}, #{password})")
    int insertReferee(Referee referee);
    @Delete("delete from referee where id=#{id}")
    int deleteReferee(int id);
    @Select("select * from referee")
    List<Referee> selectAll();
    @Select("select * from referee where team_id=#{teamId}")
    List<Referee> selectByTeam(int teamId);
    @Select("select * from referee where id=#{id}")
    Referee selectById(int id);
    @Select("select * from referee where account=#{account}")
    Referee selectPassword(String account);
    @Update("update referee set name=#{name}, id_number=#{idNumber}, phone=#{phone}, team_id=#{teamId}, account=#{account}, password=#{password}")
    int updateReferee(Referee referee);
}
