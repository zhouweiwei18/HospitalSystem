package com.web.dao;

import com.web.entity.Processingscheme;
import com.web.entity.ProcessingschemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessingschemeMapper {
    long countByExample(ProcessingschemeExample example);

    int deleteByExample(ProcessingschemeExample example);

    int deleteByPrimaryKey(Integer processingschemeno);

    int insert(Processingscheme record);

    int insertSelective(Processingscheme record);

    List<Processingscheme> selectByExample(ProcessingschemeExample example);

    Processingscheme selectByPrimaryKey(Integer processingschemeno);

    int updateByExampleSelective(@Param("record") Processingscheme record, @Param("example") ProcessingschemeExample example);

    int updateByExample(@Param("record") Processingscheme record, @Param("example") ProcessingschemeExample example);

    int updateByPrimaryKeySelective(Processingscheme record);

    int updateByPrimaryKey(Processingscheme record);
}