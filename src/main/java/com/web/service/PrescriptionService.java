package com.web.service;

import java.util.List;

import com.web.entity.Prescription;

public interface PrescriptionService {

	/**
	 * 查询所有
	 * 
	 * @return
	 */

	List<Prescription> getPrescription();

	/**
	 * 增加
	 * 
	 * @param prescription
	 * @return
	 */

	Integer addPrescription(Prescription prescription);

	/**
	 * 根据id获取
	 * 
	 * @param pid
	 * @return
	 */
	Prescription getPrescriptionById(Integer pid);

	/**
	 * 保存更改
	 * 
	 * @param prescriptionnumber
	 * @return
	 */
	

	Integer updatePrescriptionByNumber(Prescription prescriptionnumber);

	Integer deletePrescriptionById(Integer prescriptionnumber);

}
