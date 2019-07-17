package com.web.dao;

import com.web.entity.Hospitalizationcheck;
import com.web.entity.HospitalizationcheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalizationcheckMapper {
    long countByExample(HospitalizationcheckExample example);

    int deleteByExample(HospitalizationcheckExample example);

    int deleteByPrimaryKey(Integer hospitalizationcheckno);

    int insert(Hospitalizationcheck record);

    int insertSelective(Hospitalizationcheck record);

    List<Hospitalizationcheck> selectByExample(HospitalizationcheckExample example);

    Hospitalizationcheck selectByPrimaryKey(Integer hospitalizationcheckno);

    int updateByExampleSelective(@Param("record") Hospitalizationcheck record, @Param("example") HospitalizationcheckExample example);

    int updateByExample(@Param("record") Hospitalizationcheck record, @Param("example") HospitalizationcheckExample example);

    int updateByPrimaryKeySelective(Hospitalizationcheck record);

    int updateByPrimaryKey(Hospitalizationcheck record);
}