package com.web.dao;

import com.web.entity.Hospitalizationadvice;
import com.web.entity.HospitalizationadviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalizationadviceMapper {
    long countByExample(HospitalizationadviceExample example);

    int deleteByExample(HospitalizationadviceExample example);

    int deleteByPrimaryKey(Integer hospitalizationadviceid);

    int insert(Hospitalizationadvice record);

    int insertSelective(Hospitalizationadvice record);

    List<Hospitalizationadvice> selectByExample(HospitalizationadviceExample example);

    Hospitalizationadvice selectByPrimaryKey(Integer hospitalizationadviceid);

    int updateByExampleSelective(@Param("record") Hospitalizationadvice record, @Param("example") HospitalizationadviceExample example);

    int updateByExample(@Param("record") Hospitalizationadvice record, @Param("example") HospitalizationadviceExample example);

    int updateByPrimaryKeySelective(Hospitalizationadvice record);

    int updateByPrimaryKey(Hospitalizationadvice record);

	List<Hospitalizationadvice> queryPatientUser();
}