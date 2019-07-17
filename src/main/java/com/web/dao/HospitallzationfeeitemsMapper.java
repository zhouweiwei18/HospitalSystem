package com.web.dao;

import com.web.entity.Hospitallzationfeeitems;
import com.web.entity.HospitallzationfeeitemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitallzationfeeitemsMapper {
    long countByExample(HospitallzationfeeitemsExample example);

    int deleteByExample(HospitallzationfeeitemsExample example);

    int deleteByPrimaryKey(Integer projecdid);

    int insert(Hospitallzationfeeitems record);

    int insertSelective(Hospitallzationfeeitems record);

    List<Hospitallzationfeeitems> selectByExample(HospitallzationfeeitemsExample example);

    Hospitallzationfeeitems selectByPrimaryKey(Integer projecdid);

    int updateByExampleSelective(@Param("record") Hospitallzationfeeitems record, @Param("example") HospitallzationfeeitemsExample example);

    int updateByExample(@Param("record") Hospitallzationfeeitems record, @Param("example") HospitallzationfeeitemsExample example);

    int updateByPrimaryKeySelective(Hospitallzationfeeitems record);

    int updateByPrimaryKey(Hospitallzationfeeitems record);
}