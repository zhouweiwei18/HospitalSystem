package com.web.dao;

import com.web.entity.Checkproject;
import com.web.entity.CheckprojectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckprojectMapper {
    long countByExample(CheckprojectExample example);

    int deleteByExample(CheckprojectExample example);

    int deleteByPrimaryKey(Integer checkprojectno);

    int insert(Checkproject record);

    int insertSelective(Checkproject record);

    List<Checkproject> selectByExample(CheckprojectExample example);

    Checkproject selectByPrimaryKey(Integer checkprojectno);

    int updateByExampleSelective(@Param("record") Checkproject record, @Param("example") CheckprojectExample example);

    int updateByExample(@Param("record") Checkproject record, @Param("example") CheckprojectExample example);

    int updateByPrimaryKeySelective(Checkproject record);

    int updateByPrimaryKey(Checkproject record);
}