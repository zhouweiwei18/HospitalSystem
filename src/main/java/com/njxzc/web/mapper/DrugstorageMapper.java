package com.njxzc.web.mapper;

import com.njxzc.web.entity.Drugstorage;
import com.njxzc.web.entity.DrugstorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugstorageMapper {
    long countByExample(DrugstorageExample example);

    int deleteByExample(DrugstorageExample example);

    int deleteByPrimaryKey(Integer dsid);

    int insert(Drugstorage record);

    int insertSelective(Drugstorage record);

    List<Drugstorage> selectByExample(DrugstorageExample example);

    Drugstorage selectByPrimaryKey(Integer dsid);

    int updateByExampleSelective(@Param("record") Drugstorage record, @Param("example") DrugstorageExample example);

    int updateByExample(@Param("record") Drugstorage record, @Param("example") DrugstorageExample example);

    int updateByPrimaryKeySelective(Drugstorage record);

    int updateByPrimaryKey(Drugstorage record);
}