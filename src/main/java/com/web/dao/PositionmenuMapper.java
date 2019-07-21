package com.web.dao;

import com.web.entity.Positionmenu;
import com.web.entity.PositionmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionmenuMapper {
	long countByExample(PositionmenuExample example);

    int deleteByExample(PositionmenuExample example);

    int deleteByPrimaryKey(Integer pmid);

    int insert(Positionmenu record);

    int insertSelective(Positionmenu record);

    List<Positionmenu> selectByExample(PositionmenuExample example);

    Positionmenu selectByPrimaryKey(Integer pmid);

    int updateByExampleSelective(@Param("record") Positionmenu record, @Param("example") PositionmenuExample example);

    int updateByExample(@Param("record") Positionmenu record, @Param("example") PositionmenuExample example);

    int updateByPrimaryKeySelective(Positionmenu record);

    int updateByPrimaryKey(Positionmenu record);
    
    /**
     * 根据职位id查询菜单id集合
     * @param poId
     * @return
     */
    List<Integer> selctMenuByPoId(@Param("poId") Integer poId);
}