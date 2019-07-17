package com.web.dao;

import com.web.entity.Icu;
import com.web.entity.IcuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcuMapper {
    long countByExample(IcuExample example);

    int deleteByExample(IcuExample example);

    int deleteByPrimaryKey(Integer icuid);

    int insert(Icu record);

    int insertSelective(Icu record);

    List<Icu> selectByExample(IcuExample example);

    Icu selectByPrimaryKey(Integer icuid);

    int updateByExampleSelective(@Param("record") Icu record, @Param("example") IcuExample example);

    int updateByExample(@Param("record") Icu record, @Param("example") IcuExample example);

    int updateByPrimaryKeySelective(Icu record);

    int updateByPrimaryKey(Icu record);
}