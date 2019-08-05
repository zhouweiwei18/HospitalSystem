package com.web.service;

import java.util.List;

import com.web.entity.Hospitalizationadvice;
import com.web.entity.HospitalizationadviceExample;

public interface HospitalizationadviceService {
	
	/**
	 * 获取所有信息
	 * @param example
	 * @return
	 */
	List<Hospitalizationadvice> queryAllHospitalizationadvice(HospitalizationadviceExample example);
	
	/**
	 * 关联查询
	 * @return
	 */
	List<Hospitalizationadvice> queryPatientUser();
	
	/**
	 * 根据主键查询对象
	 * @param hospitalizationadvice
	 * @return
	 */
	Hospitalizationadvice selectByPrimaryKey(Integer hid);
	
	/**
	 * 修改
	 * @param hospitalizationadvice
	 * @return
	 */
	Integer updateHospitalizationadviceById(Hospitalizationadvice hospitalizationadvice);
	
	/**
	 * 添加
	 * @param hospitalizationadvice
	 * @return
	 */
	Integer insertHospitalizationadvice(Hospitalizationadvice hospitalizationadvice);

	//根据id查找住院号
	Integer getHospitalizationadviceId(Integer hospitalizationid);

}
