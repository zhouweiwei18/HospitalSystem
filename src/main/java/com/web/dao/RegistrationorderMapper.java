package com.web.dao;

import com.web.entity.Registrationorder;
import com.web.entity.RegistrationorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationorderMapper {
    long countByExample(RegistrationorderExample example);

    int deleteByExample(RegistrationorderExample example);

    int deleteByPrimaryKey(Integer registerid);

    int insert(Registrationorder record);

    int insertSelective(Registrationorder record);

    List<Registrationorder> selectByExample(RegistrationorderExample example);

    Registrationorder selectByPrimaryKey(Integer registerid);

    int updateByExampleSelective(@Param("record") Registrationorder record, @Param("example") RegistrationorderExample example);

    int updateByExample(@Param("record") Registrationorder record, @Param("example") RegistrationorderExample example);

    int updateByPrimaryKeySelective(Registrationorder record);

    int updateByPrimaryKey(Registrationorder record);
    
    
    /**
     * 关联查询
     * @param registrationorder
     * @return
     */
    List<Registrationorder> queryAll();

	Integer deleteRegistrationorderById(Integer registerid);
}