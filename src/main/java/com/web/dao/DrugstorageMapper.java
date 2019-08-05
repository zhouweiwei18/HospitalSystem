package com.web.dao;

import com.web.entity.Drugstorage;
import com.web.entity.DrugstorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugstorageMapper {
    long countByExample(DrugstorageExample example);

    int deleteByExample(DrugstorageExample example);

    int deleteByPrimaryKey(Integer drugstorageid);

    int insert(Drugstorage record);

    int insertSelective(Drugstorage record);

    List<Drugstorage> selectByExample(DrugstorageExample example);

    Drugstorage selectByPrimaryKey(Integer drugstorageid);

    int updateByExampleSelective(@Param("record") Drugstorage record, @Param("example") DrugstorageExample example);

    int updateByExample(@Param("record") Drugstorage record, @Param("example") DrugstorageExample example);

    int updateByPrimaryKeySelective(Drugstorage record);

    int updateByPrimaryKey(Drugstorage record);
    
    //下面是自己添加的方法
    List<Drugstorage>  getAll();
}