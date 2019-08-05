package com.web.service;

import java.util.List;

import com.web.entity.Registrationorder;
import com.web.entity.User;


public interface RegistrationorderService {
	
	
	/**
	 * 查询所有的科室名称
	 * @return
	 */
	List<Registrationorder> getRegistrationorder();
	
   /**
    * 根据病历id增加
    */
	Integer addRegistrationorder(Registrationorder registrationorder);

    //List<Registrationorder> getRegistrationorder();


	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	
	Registrationorder getRegistrationorderById(Integer id);

	
	/**
	 * 根据病历id修改用户信息
	 * 
	 * @param Registrationorder
	 * @return
	 */
	Integer updateRegistrationorderById(Registrationorder registerid);
	
	
	
	
}
