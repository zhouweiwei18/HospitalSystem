package com.web.service;

import java.util.List;

import com.web.entity.Prescription;

public interface PrescriptionService {
	
	/**
	 * 查询所有
	 * @return
	 */

	List<Prescription> getPrescription();

	
	/**
	 * 增加
	 * @param prescription
	 * @return
	 */
	
	Integer addPrescription(Prescription prescription);

	

	
	
}
