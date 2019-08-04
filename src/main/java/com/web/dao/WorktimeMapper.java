package com.web.dao;

import com.web.entity.Worktime;
import com.web.entity.WorktimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorktimeMapper {
    long countByExample(WorktimeExample example);

    int deleteByExample(WorktimeExample example);

    int deleteByPrimaryKey(Integer wkid);

    int insert(Worktime record);

    int insertSelective(Worktime record);

    List<Worktime> selectByExample(WorktimeExample example);

    Worktime selectByPrimaryKey(Integer wkid);

    int updateByExampleSelective(@Param("record") Worktime record, @Param("example") WorktimeExample example);

    int updateByExample(@Param("record") Worktime record, @Param("example") WorktimeExample example);

    int updateByPrimaryKeySelective(Worktime record);

    int updateByPrimaryKey(Worktime record);

    //查询值班表信息(联合外键)
	List<Worktime> selectWorkInfo();
}