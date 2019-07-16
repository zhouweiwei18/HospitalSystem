package com.njxzc.web.mapper;

import com.njxzc.web.entity.Supply;
import com.njxzc.web.entity.SupplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplyMapper {
    long countByExample(SupplyExample example);

    int deleteByExample(SupplyExample example);

    int deleteByPrimaryKey(Integer productnumber);

    int insert(Supply record);

    int insertSelective(Supply record);

    List<Supply> selectByExample(SupplyExample example);

    Supply selectByPrimaryKey(Integer productnumber);

    int updateByExampleSelective(@Param("record") Supply record, @Param("example") SupplyExample example);

    int updateByExample(@Param("record") Supply record, @Param("example") SupplyExample example);

    int updateByPrimaryKeySelective(Supply record);

    int updateByPrimaryKey(Supply record);
}