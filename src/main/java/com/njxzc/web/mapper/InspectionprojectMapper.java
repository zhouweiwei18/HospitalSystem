package com.njxzc.web.mapper;

import com.njxzc.web.entity.Inspectionproject;
import com.njxzc.web.entity.InspectionprojectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionprojectMapper {
    long countByExample(InspectionprojectExample example);

    int deleteByExample(InspectionprojectExample example);

    int deleteByPrimaryKey(Integer inspectionnumber);

    int insert(Inspectionproject record);

    int insertSelective(Inspectionproject record);

    List<Inspectionproject> selectByExample(InspectionprojectExample example);

    Inspectionproject selectByPrimaryKey(Integer inspectionnumber);

    int updateByExampleSelective(@Param("record") Inspectionproject record, @Param("example") InspectionprojectExample example);

    int updateByExample(@Param("record") Inspectionproject record, @Param("example") InspectionprojectExample example);

    int updateByPrimaryKeySelective(Inspectionproject record);

    int updateByPrimaryKey(Inspectionproject record);
}