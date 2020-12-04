package com.evaluation.mapper;

import com.evaluation.entity.TeacherEntity;
import com.evaluation.entity.TeacherEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherEntityMapper {
    long countByExample(TeacherEntityExample example);

    int deleteByExample(TeacherEntityExample example);

    int deleteByPrimaryKey(Integer teaId);

    int insertBatch(List<TeacherEntity> records);

    int insert(TeacherEntity record);

    int insertSelective(TeacherEntity record);

    TeacherEntity selectOneByExample(TeacherEntityExample example);

    List<TeacherEntity> selectByExamplePaging(@Param("example") TeacherEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<TeacherEntity> selectByExample(TeacherEntityExample example);

    TeacherEntity selectByPrimaryKey(Integer teaId);

    int updateByExampleSelective(@Param("record") TeacherEntity record, @Param("example") TeacherEntityExample example);

    int updateByExample(@Param("record") TeacherEntity record, @Param("example") TeacherEntityExample example);

    int updateByPrimaryKeySelective(TeacherEntity record);

    int updateByPrimaryKey(TeacherEntity record);
}