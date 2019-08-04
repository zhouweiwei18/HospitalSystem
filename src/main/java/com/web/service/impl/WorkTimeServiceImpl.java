package com.web.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.WorktimeMapper;
import com.web.entity.Worktime;
import com.web.service.WorkTimeService;
import com.web.utils.DateTimeUtil;

@Service
public class WorkTimeServiceImpl implements WorkTimeService {

	@Autowired
	WorktimeMapper worktimeMapper;

	@Override
	public List<Worktime> queryWorkTimeInfo() {

		List<Worktime> list = worktimeMapper.selectWorkInfo();

		// 得到当前日期(格式化)
		String nowTime = DateTimeUtil.dateToStr(new Date());

		// 遍历list,识别日期
		for (Worktime worktime : list) {
			try {
				// 如果小于当前时间，给日期天备注
				if (DateTimeUtil.compare(worktime.getWorktime(), nowTime)) {
					String tempDate = worktime.getWorktime() + "     (已过期)";
					worktime.setWorktime(tempDate);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public Worktime queryWorkTimeById(Integer wkid) {

		return worktimeMapper.selectByPrimaryKey(wkid);
	}

	@Override
	public Integer updateWorkTimeById(Worktime worktime) {

		return worktimeMapper.updateByPrimaryKeySelective(worktime);
	}

	@Override
	public Integer addWorkTime(Worktime worktime) {

		return worktimeMapper.insert(worktime);
	}

}
