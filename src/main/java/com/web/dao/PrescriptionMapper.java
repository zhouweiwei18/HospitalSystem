package com.web.dao;

import com.web.entity.Prescription;
import com.web.entity.PrescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrescriptionMapper {
    long countByExample(PrescriptionExample example);

    int deleteByExample(PrescriptionExample example);

    int deleteByPrimaryKey(Integer prescriptionnumber);

    int insert(Prescription record);

    int insertSelective(Prescription record);

    List<Prescription> selectByExample(PrescriptionExample example);

    Prescription selectByPrimaryKey(Integer prescriptionnumber);

    int updateByExampleSelective(@Param("record") Prescription record, @Param("example") PrescriptionExample example);

    int updateByExample(@Param("record") Prescription record, @Param("example") PrescriptionExample example);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);
    
    /**
     * 查询所有
     * @return
     */
    List<Prescription> queryAll();
    
    
    Integer deletePrescriptionById(Integer prescriptionnumber);
}