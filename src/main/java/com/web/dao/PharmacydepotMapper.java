package com.web.dao;

import com.web.entity.Pharmacydepot;
import com.web.entity.PharmacydepotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PharmacydepotMapper {
    long countByExample(PharmacydepotExample example);

    int deleteByExample(PharmacydepotExample example);

    int deleteByPrimaryKey(Integer pharmacydepotid);

    int insert(Pharmacydepot record);

    int insertSelective(Pharmacydepot record);

    List<Pharmacydepot> selectByExample(PharmacydepotExample example);

    Pharmacydepot selectByPrimaryKey(Integer pharmacydepotid);

    int updateByExampleSelective(@Param("record") Pharmacydepot record, @Param("example") PharmacydepotExample example);

    int updateByExample(@Param("record") Pharmacydepot record, @Param("example") PharmacydepotExample example);

    int updateByPrimaryKeySelective(Pharmacydepot record);

    int updateByPrimaryKey(Pharmacydepot record);
}