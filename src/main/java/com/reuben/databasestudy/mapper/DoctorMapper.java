package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Doctor;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DoctorMapper {
    @Insert("insert into doctor (name, id_number, phone, team_id) values (#{name}, #{idNumber}, #{phone}, #{teamId})")
    int insertDoctor(Doctor doctor);
    @Delete("delete from doctor where id=#{id}")
    int deleteDoctor(int id);
    @Select("select * from doctor")
    List<Doctor> selectAll();
    @Select("select * from doctor where team_id=#{teamId}")
    Doctor selectByTeam(int teamId);
    @Update("update doctor set name=#{name}, id_number=#{idNumber}, phone=#{phone}, team_id=#{teamId} where id=#{id}")
    int updateDoctor(Doctor doctor);
}
