package com.njxzc.web.mapper;

import com.njxzc.web.entity.Inpatientprescription;
import com.njxzc.web.entity.InpatientprescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InpatientprescriptionMapper {
    long countByExample(InpatientprescriptionExample example);

    int deleteByExample(InpatientprescriptionExample example);

    int deleteByPrimaryKey(Integer prescriptionno);

    int insert(Inpatientprescription record);

    int insertSelective(Inpatientprescription record);

    List<Inpatientprescription> selectByExample(InpatientprescriptionExample example);

    Inpatientprescription selectByPrimaryKey(Integer prescriptionno);

    int updateByExampleSelective(@Param("record") Inpatientprescription record, @Param("example") InpatientprescriptionExample example);

    int updateByExample(@Param("record") Inpatientprescription record, @Param("example") InpatientprescriptionExample example);

    int updateByPrimaryKeySelective(Inpatientprescription record);

    int updateByPrimaryKey(Inpatientprescription record);
}