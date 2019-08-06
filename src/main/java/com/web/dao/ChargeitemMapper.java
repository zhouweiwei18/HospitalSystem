package com.web.dao;

import com.web.entity.Chargeitem;
import com.web.entity.ChargeitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeitemMapper {
    long countByExample(ChargeitemExample example);

    int deleteByExample(ChargeitemExample example);

    int deleteByPrimaryKey(Integer chargeid);

    int insert(Chargeitem record);

    int insertSelective(Chargeitem record);

    List<Chargeitem> selectByExample(ChargeitemExample example);

    Chargeitem selectByPrimaryKey(Integer chargeid);

    int updateByExampleSelective(@Param("record") Chargeitem record, @Param("example") ChargeitemExample example);

    int updateByExample(@Param("record") Chargeitem record, @Param("example") ChargeitemExample example);

    int updateByPrimaryKeySelective(Chargeitem record);

    int updateByPrimaryKey(Chargeitem record);
    
    /**
     * 关联查询
     * @return
     */
    List<Chargeitem> queryAll();
    
}