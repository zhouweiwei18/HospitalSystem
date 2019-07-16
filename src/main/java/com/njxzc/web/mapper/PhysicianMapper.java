package com.njxzc.web.mapper;

import com.njxzc.web.entity.Physician;
import com.njxzc.web.entity.PhysicianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhysicianMapper {
    long countByExample(PhysicianExample example);

    int deleteByExample(PhysicianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Physician record);

    int insertSelective(Physician record);

    List<Physician> selectByExample(PhysicianExample example);

    Physician selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Physician record, @Param("example") PhysicianExample example);

    int updateByExample(@Param("record") Physician record, @Param("example") PhysicianExample example);

    int updateByPrimaryKeySelective(Physician record);

    int updateByPrimaryKey(Physician record);
}