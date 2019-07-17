package com.web.dao;

import com.web.entity.OutpatientTest;
import com.web.entity.OutpatientTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutpatientTestMapper {
    long countByExample(OutpatientTestExample example);

    int deleteByExample(OutpatientTestExample example);

    int deleteByPrimaryKey(Integer patienttestno);

    int insert(OutpatientTest record);

    int insertSelective(OutpatientTest record);

    List<OutpatientTest> selectByExample(OutpatientTestExample example);

    OutpatientTest selectByPrimaryKey(Integer patienttestno);

    int updateByExampleSelective(@Param("record") OutpatientTest record, @Param("example") OutpatientTestExample example);

    int updateByExample(@Param("record") OutpatientTest record, @Param("example") OutpatientTestExample example);

    int updateByPrimaryKeySelective(OutpatientTest record);

    int updateByPrimaryKey(OutpatientTest record);
}