package com.evaluation.mapper;

import com.evaluation.entity.CourseTeaEntity;
import com.evaluation.entity.CourseTeaEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTeaEntityMapper {
    long countByExample(CourseTeaEntityExample example);

    int deleteByExample(CourseTeaEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insertBatch(List<CourseTeaEntity> records);

    int insert(CourseTeaEntity record);

    int insertSelective(CourseTeaEntity record);

    CourseTeaEntity selectOneByExample(CourseTeaEntityExample example);

    List<CourseTeaEntity> selectByExamplePaging(@Param("example") CourseTeaEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<CourseTeaEntity> selectByExample(CourseTeaEntityExample example);

    CourseTeaEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseTeaEntity record, @Param("example") CourseTeaEntityExample example);

    int updateByExample(@Param("record") CourseTeaEntity record, @Param("example") CourseTeaEntityExample example);

    int updateByPrimaryKeySelective(CourseTeaEntity record);

    int updateByPrimaryKey(CourseTeaEntity record);
}