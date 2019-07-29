package com.web.dao;

import com.web.entity.Position;
import com.web.entity.PositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionMapper {
    long countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(Integer postnumber);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);

    Position selectByPrimaryKey(Integer postnumber);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
    
    /**
     * position表和department表的联表查询
     * @return
     */
    List<Position> queryPositionDept();
}