package com.web.service;

import java.util.List;

import com.web.entity.Hospitalizationadvice;
import com.web.entity.Hospitalizationprescription;
import com.web.entity.HospitalizationprescriptionExample;

public interface HospitalizationprescriptionService {
	
	/**
	 * 下拉全查询
	 * @param example
	 * @return
	 */
	List<Hospitalizationprescription> queryall(HospitalizationprescriptionExample example);
	
	/**
	 * 关联查询
	 * @return
	 */
	List<Hospitalizationprescription> querypatientdrugs();
	
	/**
	 * 根据主键查询
	 * @param pid
	 * @return
	 */
	Hospitalizationprescription selectByPrimaryKey(Integer pid);
	
	/**
	 * 修改
	 */
	Integer updateHospitalizationprescriptionById(Hospitalizationprescription hospitalizationprescription);	

	/**
	 * 添加
	 * @param hospitalizationprescription
	 * @return
	 */
	Integer insertHospitalizationprescription(Hospitalizationprescription hospitalizationprescription);

}

