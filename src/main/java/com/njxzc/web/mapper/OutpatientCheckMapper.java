package com.njxzc.web.mapper;

import com.njxzc.web.entity.OutpatientCheck;
import com.njxzc.web.entity.OutpatientCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutpatientCheckMapper {
    long countByExample(OutpatientCheckExample example);

    int deleteByExample(OutpatientCheckExample example);

    int deleteByPrimaryKey(Integer outpatientmedicalrecordid);

    int insert(OutpatientCheck record);

    int insertSelective(OutpatientCheck record);

    List<OutpatientCheck> selectByExample(OutpatientCheckExample example);

    OutpatientCheck selectByPrimaryKey(Integer outpatientmedicalrecordid);

    int updateByExampleSelective(@Param("record") OutpatientCheck record, @Param("example") OutpatientCheckExample example);

    int updateByExample(@Param("record") OutpatientCheck record, @Param("example") OutpatientCheckExample example);

    int updateByPrimaryKeySelective(OutpatientCheck record);

    int updateByPrimaryKey(OutpatientCheck record);
}