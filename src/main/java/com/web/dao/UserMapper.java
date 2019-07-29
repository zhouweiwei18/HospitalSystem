package com.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.entity.User;
import com.web.entity.UserExample;
import com.web.pojo.UserAndPartment;

public interface UserMapper {
	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer userid);

	//返回当前插入的对象
	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer userid);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	/**
	 * 根据用户id查询该用户所有信息(department)
	 * 
	 * @param id
	 * @return
	 */
	List<UserAndPartment> selectByUserId(Integer id);

	/**
	 * 同时更新User和department
	 * 
	 * @param uap
	 * @return
	 */
	//int updateUserAndDepart(User user);

	/**
	 * 关联查询(User Position Department)
	 * 
	 * @return
	 */
	List<User> queryAll(User user);
}