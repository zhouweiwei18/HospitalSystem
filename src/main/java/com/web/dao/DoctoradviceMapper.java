package com.web.dao;

import com.web.entity.Doctoradvice;
import com.web.entity.DoctoradviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctoradviceMapper {
    long countByExample(DoctoradviceExample example);

    int deleteByExample(DoctoradviceExample example);

    int deleteByPrimaryKey(Integer doctoradviceid);

    int insert(Doctoradvice record);

    int insertSelective(Doctoradvice record);

    List<Doctoradvice> selectByExample(DoctoradviceExample example);

    Doctoradvice selectByPrimaryKey(Integer doctoradviceid);

    int updateByExampleSelective(@Param("record") Doctoradvice record, @Param("example") DoctoradviceExample example);

    int updateByExample(@Param("record") Doctoradvice record, @Param("example") DoctoradviceExample example);

    int updateByPrimaryKeySelective(Doctoradvice record);

    int updateByPrimaryKey(Doctoradvice record);
}