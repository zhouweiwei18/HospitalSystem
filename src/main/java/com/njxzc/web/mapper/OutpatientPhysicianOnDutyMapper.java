package com.njxzc.web.mapper;

import com.njxzc.web.entity.OutpatientPhysicianOnDuty;
import com.njxzc.web.entity.OutpatientPhysicianOnDutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutpatientPhysicianOnDutyMapper {
    long countByExample(OutpatientPhysicianOnDutyExample example);

    int deleteByExample(OutpatientPhysicianOnDutyExample example);

    int deleteByPrimaryKey(Integer outpatientdoctorid);

    int insert(OutpatientPhysicianOnDuty record);

    int insertSelective(OutpatientPhysicianOnDuty record);

    List<OutpatientPhysicianOnDuty> selectByExample(OutpatientPhysicianOnDutyExample example);

    OutpatientPhysicianOnDuty selectByPrimaryKey(Integer outpatientdoctorid);

    int updateByExampleSelective(@Param("record") OutpatientPhysicianOnDuty record, @Param("example") OutpatientPhysicianOnDutyExample example);

    int updateByExample(@Param("record") OutpatientPhysicianOnDuty record, @Param("example") OutpatientPhysicianOnDutyExample example);

    int updateByPrimaryKeySelective(OutpatientPhysicianOnDuty record);

    int updateByPrimaryKey(OutpatientPhysicianOnDuty record);
}