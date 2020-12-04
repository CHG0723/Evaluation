package com.evaluation.mapper;

import com.evaluation.entity.StudentEntity;
import com.evaluation.entity.StudentEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentEntityMapper {
    long countByExample(StudentEntityExample example);

    int deleteByExample(StudentEntityExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insertBatch(List<StudentEntity> records);

    int insert(StudentEntity record);

    int insertSelective(StudentEntity record);

    StudentEntity selectOneByExample(StudentEntityExample example);

    List<StudentEntity> selectByExamplePaging(@Param("example") StudentEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<StudentEntity> selectByExample(StudentEntityExample example);

    StudentEntity selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByExample(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByPrimaryKeySelective(StudentEntity record);

    int updateByPrimaryKey(StudentEntity record);
}