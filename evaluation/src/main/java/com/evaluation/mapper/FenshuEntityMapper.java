package com.evaluation.mapper;

import com.evaluation.entity.FenshuEntity;
import com.evaluation.entity.FenshuEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FenshuEntityMapper {
    long countByExample(FenshuEntityExample example);

    int deleteByExample(FenshuEntityExample example);

    int deleteByPrimaryKey(Integer fenshuId);

    int insertBatch(List<FenshuEntity> records);

    int insert(FenshuEntity record);

    int insertSelective(FenshuEntity record);

    FenshuEntity selectOneByExample(FenshuEntityExample example);

    List<FenshuEntity> selectByExamplePaging(@Param("example") FenshuEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<FenshuEntity> selectByExample(FenshuEntityExample example);

    FenshuEntity selectByPrimaryKey(Integer fenshuId);

    int updateByExampleSelective(@Param("record") FenshuEntity record, @Param("example") FenshuEntityExample example);

    int updateByExample(@Param("record") FenshuEntity record, @Param("example") FenshuEntityExample example);

    int updateByPrimaryKeySelective(FenshuEntity record);

    int updateByPrimaryKey(FenshuEntity record);
}