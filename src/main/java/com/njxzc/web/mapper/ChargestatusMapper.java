package com.njxzc.web.mapper;

import com.njxzc.web.entity.Chargestatus;
import com.njxzc.web.entity.ChargestatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargestatusMapper {
    long countByExample(ChargestatusExample example);

    int deleteByExample(ChargestatusExample example);

    int deleteByPrimaryKey(Integer chargeno);

    int insert(Chargestatus record);

    int insertSelective(Chargestatus record);

    List<Chargestatus> selectByExample(ChargestatusExample example);

    Chargestatus selectByPrimaryKey(Integer chargeno);

    int updateByExampleSelective(@Param("record") Chargestatus record, @Param("example") ChargestatusExample example);

    int updateByExample(@Param("record") Chargestatus record, @Param("example") ChargestatusExample example);

    int updateByPrimaryKeySelective(Chargestatus record);

    int updateByPrimaryKey(Chargestatus record);
}