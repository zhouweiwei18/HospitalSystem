package com.web.service;

import java.util.List;

import com.web.entity.Doctoradvice;



public interface DoctoradviceService {

	/**
	 * 查询所有的医嘱名称
	 * @return
	 */
	List<Doctoradvice> getDoctoradvice();
}
