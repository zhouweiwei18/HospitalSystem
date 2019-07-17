package com.web.dao;

import com.web.entity.Hospitalizationprescription;
import com.web.entity.HospitalizationprescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalizationprescriptionMapper {
    long countByExample(HospitalizationprescriptionExample example);

    int deleteByExample(HospitalizationprescriptionExample example);

    int deleteByPrimaryKey(Integer prescriptionno);

    int insert(Hospitalizationprescription record);

    int insertSelective(Hospitalizationprescription record);

    List<Hospitalizationprescription> selectByExample(HospitalizationprescriptionExample example);

    Hospitalizationprescription selectByPrimaryKey(Integer prescriptionno);

    int updateByExampleSelective(@Param("record") Hospitalizationprescription record, @Param("example") HospitalizationprescriptionExample example);

    int updateByExample(@Param("record") Hospitalizationprescription record, @Param("example") HospitalizationprescriptionExample example);

    int updateByPrimaryKeySelective(Hospitalizationprescription record);

    int updateByPrimaryKey(Hospitalizationprescription record);
}