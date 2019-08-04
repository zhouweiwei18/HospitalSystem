package com.web.dao;

import com.web.entity.Chargestatus;
import com.web.entity.ChargestatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargestatusMapper {
	long countByExample(ChargestatusExample example);

    int deleteByExample(ChargestatusExample example);

    int deleteByPrimaryKey(Integer chargestatusid);

    int insert(Chargestatus record);

    int insertSelective(Chargestatus record);

    List<Chargestatus> selectByExample(ChargestatusExample example);

    Chargestatus selectByPrimaryKey(Integer chargestatusid);

    int updateByExampleSelective(@Param("record") Chargestatus record, @Param("example") ChargestatusExample example);

    int updateByExample(@Param("record") Chargestatus record, @Param("example") ChargestatusExample example);

    int updateByPrimaryKeySelective(Chargestatus record);

    int updateByPrimaryKey(Chargestatus record);

    //查询所有
	List<Chargestatus> queryAllInfo();
}