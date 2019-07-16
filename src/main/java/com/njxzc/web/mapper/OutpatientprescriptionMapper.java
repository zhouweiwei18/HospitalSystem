package com.njxzc.web.mapper;

import com.njxzc.web.entity.Outpatientprescription;
import com.njxzc.web.entity.OutpatientprescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutpatientprescriptionMapper {
    long countByExample(OutpatientprescriptionExample example);

    int deleteByExample(OutpatientprescriptionExample example);

    int deleteByPrimaryKey(Integer prescriptionnumber);

    int insert(Outpatientprescription record);

    int insertSelective(Outpatientprescription record);

    List<Outpatientprescription> selectByExample(OutpatientprescriptionExample example);

    Outpatientprescription selectByPrimaryKey(Integer prescriptionnumber);

    int updateByExampleSelective(@Param("record") Outpatientprescription record, @Param("example") OutpatientprescriptionExample example);

    int updateByExample(@Param("record") Outpatientprescription record, @Param("example") OutpatientprescriptionExample example);

    int updateByPrimaryKeySelective(Outpatientprescription record);

    int updateByPrimaryKey(Outpatientprescription record);
}