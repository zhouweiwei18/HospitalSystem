package com.njxzc.web.mapper;

import com.njxzc.web.entity.Medicalrecord;
import com.njxzc.web.entity.MedicalrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalrecordMapper {
    long countByExample(MedicalrecordExample example);

    int deleteByExample(MedicalrecordExample example);

    int deleteByPrimaryKey(Integer medicalrecordid);

    int insert(Medicalrecord record);

    int insertSelective(Medicalrecord record);

    List<Medicalrecord> selectByExample(MedicalrecordExample example);

    Medicalrecord selectByPrimaryKey(Integer medicalrecordid);

    int updateByExampleSelective(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByExample(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByPrimaryKeySelective(Medicalrecord record);

    int updateByPrimaryKey(Medicalrecord record);
}