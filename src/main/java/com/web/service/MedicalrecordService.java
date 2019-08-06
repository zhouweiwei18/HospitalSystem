package com.web.service;

import java.util.List;

import com.web.entity.Medicalrecord;

public interface MedicalrecordService {

	/**
	 * 查询所有的科室名称
	 * 
	 * @return
	 */
	List<Medicalrecord> getMedicalrecord();

	/**
	 * 添加
	 * 
	 * @param medicalrecord
	 * @return
	 */
	Integer addMedicalrecord(Medicalrecord medicalrecord);

	/**
	 * 根据id获取
	 */
	Medicalrecord getMedicalrecordById(Integer id);

	/**
	 * 保存更改
	 * 
	 * @param medicalrecord
	 * @return
	 */
	Integer updateMedicalRecordById(Medicalrecord medicalrecordid);

	/**
	 * 
	 * @param medicalrecordid
	 * @return
	 */
	Integer deleteMedicalRecordById(Integer medicalrecordid);

}
