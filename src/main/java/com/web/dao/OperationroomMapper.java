package com.web.dao;

import com.web.entity.Operationroom;
import com.web.entity.OperationroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationroomMapper {
    long countByExample(OperationroomExample example);

    int deleteByExample(OperationroomExample example);

    int deleteByPrimaryKey(Integer operationroomid);

    int insert(Operationroom record);

    int insertSelective(Operationroom record);

    List<Operationroom> selectByExample(OperationroomExample example);

    Operationroom selectByPrimaryKey(Integer operationroomid);

    int updateByExampleSelective(@Param("record") Operationroom record, @Param("example") OperationroomExample example);

    int updateByExample(@Param("record") Operationroom record, @Param("example") OperationroomExample example);

    int updateByPrimaryKeySelective(Operationroom record);

    int updateByPrimaryKey(Operationroom record);
}