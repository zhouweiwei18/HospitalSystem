package com.web.dao;

import com.web.entity.Drugs;
import com.web.entity.DrugsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugsMapper {
    long countByExample(DrugsExample example);

    int deleteByExample(DrugsExample example);

    int deleteByPrimaryKey(Integer drugsid);

    int insert(Drugs record);

    int insertSelective(Drugs record);

    List<Drugs> selectByExample(DrugsExample example);

    Drugs selectByPrimaryKey(Integer drugsid);

    int updateByExampleSelective(@Param("record") Drugs record, @Param("example") DrugsExample example);

    int updateByExample(@Param("record") Drugs record, @Param("example") DrugsExample example);

    int updateByPrimaryKeySelective(Drugs record);

    int updateByPrimaryKey(Drugs record);
    
    List<Drugs>  getAll();
    
    Drugs  getDrugByid(Integer drugsid);
    
    int  updateDrugs(Drugs drugs);
    
    int delsup(Integer drugsid);
}