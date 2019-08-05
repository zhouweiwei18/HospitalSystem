package com.web.service;

import java.util.List;

import com.web.entity.AttendanceRecord;

public interface AttendanceRecordService {

	List<AttendanceRecord> getAttendanceRecord();
	
	/**
	 * 
	 * 添加记录
	 * @param record
	 * @return
	 */
	
	int insert(AttendanceRecord record);
	
	
	AttendanceRecord selectByPrimaryKey(Integer attdid);
	
	Integer updateAttendanceRecordById(AttendanceRecord attendanceRecord);

}
