package com.njxzc.web.mapper;

import com.njxzc.web.entity.OutpatientMedicalRecord;
import com.njxzc.web.entity.OutpatientMedicalRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutpatientMedicalRecordMapper {
    long countByExample(OutpatientMedicalRecordExample example);

    int deleteByExample(OutpatientMedicalRecordExample example);

    int deleteByPrimaryKey(Integer medicalrecordno);

    int insert(OutpatientMedicalRecord record);

    int insertSelective(OutpatientMedicalRecord record);

    List<OutpatientMedicalRecord> selectByExample(OutpatientMedicalRecordExample example);

    OutpatientMedicalRecord selectByPrimaryKey(Integer medicalrecordno);

    int updateByExampleSelective(@Param("record") OutpatientMedicalRecord record, @Param("example") OutpatientMedicalRecordExample example);

    int updateByExample(@Param("record") OutpatientMedicalRecord record, @Param("example") OutpatientMedicalRecordExample example);

    int updateByPrimaryKeySelective(OutpatientMedicalRecord record);

    int updateByPrimaryKey(OutpatientMedicalRecord record);
}