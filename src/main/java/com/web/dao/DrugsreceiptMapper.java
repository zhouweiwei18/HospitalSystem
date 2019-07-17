package com.web.dao;

import com.web.entity.Drugsreceipt;
import com.web.entity.DrugsreceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugsreceiptMapper {
    long countByExample(DrugsreceiptExample example);

    int deleteByExample(DrugsreceiptExample example);

    int deleteByPrimaryKey(Integer receiptid);

    int insert(Drugsreceipt record);

    int insertSelective(Drugsreceipt record);

    List<Drugsreceipt> selectByExample(DrugsreceiptExample example);

    Drugsreceipt selectByPrimaryKey(Integer receiptid);

    int updateByExampleSelective(@Param("record") Drugsreceipt record, @Param("example") DrugsreceiptExample example);

    int updateByExample(@Param("record") Drugsreceipt record, @Param("example") DrugsreceiptExample example);

    int updateByPrimaryKeySelective(Drugsreceipt record);

    int updateByPrimaryKey(Drugsreceipt record);
}