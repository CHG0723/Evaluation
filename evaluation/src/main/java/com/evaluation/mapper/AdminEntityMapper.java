package com.evaluation.mapper;

import com.evaluation.entity.AdminEntity;
import com.evaluation.entity.AdminEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminEntityMapper {
    long countByExample(AdminEntityExample example);

    int deleteByExample(AdminEntityExample example);

    int deleteByPrimaryKey(Integer userid);

    int insertBatch(List<AdminEntity> records);

    int insert(AdminEntity record);

    int insertSelective(AdminEntity record);

    AdminEntity selectOneByExample(AdminEntityExample example);

    List<AdminEntity> selectByExamplePaging(@Param("example") AdminEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<AdminEntity> selectByExample(AdminEntityExample example);

    AdminEntity selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") AdminEntity record, @Param("example") AdminEntityExample example);

    int updateByExample(@Param("record") AdminEntity record, @Param("example") AdminEntityExample example);

    int updateByPrimaryKeySelective(AdminEntity record);

    int updateByPrimaryKey(AdminEntity record);
}