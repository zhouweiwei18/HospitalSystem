package com.web.dao;

import com.web.entity.Generate;
import com.web.entity.GenerateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GenerateMapper {
    long countByExample(GenerateExample example);

    int deleteByExample(GenerateExample example);

    int deleteByPrimaryKey(Integer receipt);

    int insert(Generate record);

    int insertSelective(Generate record);

    List<Generate> selectByExample(GenerateExample example);

    Generate selectByPrimaryKey(Integer receipt);

    int updateByExampleSelective(@Param("record") Generate record, @Param("example") GenerateExample example);

    int updateByExample(@Param("record") Generate record, @Param("example") GenerateExample example);

    int updateByPrimaryKeySelective(Generate record);

    int updateByPrimaryKey(Generate record);
}