package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.AttendanceRecordMapper;
import com.web.entity.AttendanceRecord;
import com.web.entity.User;
import com.web.service.AttendanceRecordService;

@Service
public class AttendanceRecordServiceImpl implements AttendanceRecordService {

	@Autowired
	AttendanceRecordMapper attendanceRecordMapper;

	@Override
	public List<AttendanceRecord> getAttendanceRecord() {

		List<AttendanceRecord> list = attendanceRecordMapper.selectByExample(null);

		List<AttendanceRecord> rList = new ArrayList<AttendanceRecord>();

		// 这里提出所有state状态为1的用户，这些用户已经删除了
		for (AttendanceRecord ar : list) {
			if (ar.getIsdelete() == 0) {
				rList.add(ar);
			}
		}

		return rList;

	}

	@Override
	public int insert(AttendanceRecord record) {
		// TODO Auto-generated method stub
		return attendanceRecordMapper.insert(record);
	}

	@Override
	public AttendanceRecord selectByPrimaryKey(Integer attdid) {
		// TODO Auto-generated method stub
		return attendanceRecordMapper.selectByPrimaryKey(attdid);
	}

	@Override
	public Integer updateAttendanceRecordById(AttendanceRecord attendanceRecord) {
		// 这里只对用户做出修改的信息做出更新，不修改的信息不更新
		return attendanceRecordMapper.updateByPrimaryKeySelective(attendanceRecord);
	}

}
