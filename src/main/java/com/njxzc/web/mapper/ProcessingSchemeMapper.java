package com.njxzc.web.mapper;

import com.njxzc.web.entity.ProcessingScheme;
import com.njxzc.web.entity.ProcessingSchemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessingSchemeMapper {
    long countByExample(ProcessingSchemeExample example);

    int deleteByExample(ProcessingSchemeExample example);

    int deleteByPrimaryKey(Integer processingschemeno);

    int insert(ProcessingScheme record);

    int insertSelective(ProcessingScheme record);

    List<ProcessingScheme> selectByExample(ProcessingSchemeExample example);

    ProcessingScheme selectByPrimaryKey(Integer processingschemeno);

    int updateByExampleSelective(@Param("record") ProcessingScheme record, @Param("example") ProcessingSchemeExample example);

    int updateByExample(@Param("record") ProcessingScheme record, @Param("example") ProcessingSchemeExample example);

    int updateByPrimaryKeySelective(ProcessingScheme record);

    int updateByPrimaryKey(ProcessingScheme record);
}