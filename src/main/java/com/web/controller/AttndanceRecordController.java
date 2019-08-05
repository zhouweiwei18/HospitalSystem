package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.AttendanceRecord;
import com.web.entity.User;
import com.web.service.AttendanceRecordService;

@Controller
public class AttndanceRecordController {
		
	@Resource
	AttendanceRecordService attendanceRecordService;
	
	@RequestMapping(value="/getAttendanceRecord")
	@ResponseBody          
	public List<AttendanceRecord> getAttendanceRecord(){
		
		return attendanceRecordService.getAttendanceRecord();
	}
	
	
	//添加记录
	@RequestMapping(value="/addAttendanceRecord")
	@ResponseBody
	public int insert(AttendanceRecord record){
		
		record.setIsdelete(0);
	
		
		int i = attendanceRecordService.insert(record);
		
		return i;
	}
	
	//赋初始值
	@RequestMapping(value="/selectAttendanceRecord")
	@ResponseBody
	public AttendanceRecord selectByPrimaryKey(Integer attdid){
		
		return attendanceRecordService.selectByPrimaryKey(attdid);
		
	}
	
	
	@RequestMapping("/saveUpdateAttendanceRecord")
	@ResponseBody
	public Integer saveUpdateAttendanceRecord(AttendanceRecord attendanceRecord){
		
		 attendanceRecordService.updateAttendanceRecordById(attendanceRecord);
		 return 1;
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(AttendanceRecord attendanceRecord) {

		attendanceRecord.setIsdelete(1);
		// 删除某个User用户(假删除)
		Integer i = attendanceRecordService.updateAttendanceRecordById(attendanceRecord);

		return i;

	}
}
