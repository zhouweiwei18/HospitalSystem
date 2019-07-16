package com.njxzc.web.mapper;

import com.njxzc.web.entity.PositionMenu;
import com.njxzc.web.entity.PositionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionMenuMapper {
    long countByExample(PositionMenuExample example);

    int deleteByExample(PositionMenuExample example);

    int deleteByPrimaryKey(Integer postid);

    int insert(PositionMenu record);

    int insertSelective(PositionMenu record);

    List<PositionMenu> selectByExample(PositionMenuExample example);

    PositionMenu selectByPrimaryKey(Integer postid);

    int updateByExampleSelective(@Param("record") PositionMenu record, @Param("example") PositionMenuExample example);

    int updateByExample(@Param("record") PositionMenu record, @Param("example") PositionMenuExample example);

    int updateByPrimaryKeySelective(PositionMenu record);

    int updateByPrimaryKey(PositionMenu record);
}