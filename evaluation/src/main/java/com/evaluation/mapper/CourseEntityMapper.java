package com.evaluation.mapper;

import com.evaluation.entity.CourseEntity;
import com.evaluation.entity.CourseEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseEntityMapper {
    long countByExample(CourseEntityExample example);

    int deleteByExample(CourseEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insertBatch(List<CourseEntity> records);

    int insert(CourseEntity record);

    int insertSelective(CourseEntity record);

    CourseEntity selectOneByExample(CourseEntityExample example);

    List<CourseEntity> selectByExamplePaging(@Param("example") CourseEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<CourseEntity> selectByExample(CourseEntityExample example);

    CourseEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseEntity record, @Param("example") CourseEntityExample example);

    int updateByExample(@Param("record") CourseEntity record, @Param("example") CourseEntityExample example);

    int updateByPrimaryKeySelective(CourseEntity record);

    int updateByPrimaryKey(CourseEntity record);
}