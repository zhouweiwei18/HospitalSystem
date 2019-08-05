package com.web.dao;

import com.web.entity.Worktime;
import com.web.entity.WorktimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorktimeMapper {
    long countByExample(WorktimeExample example);

    int deleteByExample(WorktimeExample example);

    int insert(Worktime record);

    int insertSelective(Worktime record);

    List<Worktime> selectByExample(WorktimeExample example);

    int updateByExampleSelective(@Param("record") Worktime record, @Param("example") WorktimeExample example);

    int updateByExample(@Param("record") Worktime record, @Param("example") WorktimeExample example);
}