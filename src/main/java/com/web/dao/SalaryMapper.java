package com.web.dao;

import com.web.entity.Salary;
import com.web.entity.SalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryMapper {
    long countByExample(SalaryExample example);

    int deleteByExample(SalaryExample example);

    int deleteByPrimaryKey(Integer salaryid);

    int insert(Salary record);

    int insertSelective(Salary record);

    List<Salary> selectByExample(SalaryExample example);

    Salary selectByPrimaryKey(Integer salaryid);

    int updateByExampleSelective(@Param("record") Salary record, @Param("example") SalaryExample example);

    int updateByExample(@Param("record") Salary record, @Param("example") SalaryExample example);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    //查询所有
	List<Salary> queryAllInfo();
}