package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.AgeClass;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AgeClassMapper {
    @Insert("insert into age_class (name, min_age, max_age) values (#{name}, #{minAge}, #{maxAge})")
    int insertAgeClass(AgeClass ageClass);
    @Delete("delete from age_class where id=#{id}")
    int deleteAgeClass(int id);
    @Select("select * from age_class")
    List<AgeClass> selectAll();
    @Update("update age_class set name=#{name}, min_age=#{minAge}, max_age=#{maxAge} where id=#{id}")
    int updateAgeClass(AgeClass ageClass);
}
