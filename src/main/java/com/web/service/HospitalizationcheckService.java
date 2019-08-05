package com.web.service;

import java.util.List;

import com.web.entity.Hospitalizationadvice;
import com.web.entity.Hospitalizationcheck;
import com.web.entity.HospitalizationcheckExample;

public interface HospitalizationcheckService {
	
	/**
	 * 下拉全查询
	 * @param example
	 * @return
	 */
	List<Hospitalizationcheck> queryAll(HospitalizationcheckExample example);
	
	/**
	 * 关联查询
	 * @return
	 */
	List<Hospitalizationcheck> queryPatientUserCheck();
	
	/**
	 * 根据主键查询
	 * @param hid
	 * @return
	 */
	Hospitalizationcheck selectByPrimaryKey(Integer hid);
	
	/**
	 * 修改
	 * @param hospitalizationcheck
	 * @return
	 */
	Integer updateHospitalizationcheckById(Hospitalizationcheck hospitalizationcheck);
	
	/**
	 * 添加
	 * @param hospitalizationcheck
	 * @return
	 */
	Integer insertHospitalizationcheck(Hospitalizationcheck hospitalizationcheck);
		

}
