package com.web.dao;

import com.web.entity.Orderdetails;
import com.web.entity.OrderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailsMapper {
    long countByExample(OrderdetailsExample example);

    int deleteByExample(OrderdetailsExample example);

    int deleteByPrimaryKey(Integer orderdetailsid);

    int insert(Orderdetails record);

    int insertSelective(Orderdetails record);

    List<Orderdetails> selectByExample(OrderdetailsExample example);

    Orderdetails selectByPrimaryKey(Integer orderdetailsid);

    int updateByExampleSelective(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    int updateByExample(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    int updateByPrimaryKeySelective(Orderdetails record);

    int updateByPrimaryKey(Orderdetails record);
}