package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.ChargeitemMapper;
import com.web.dao.ChargestatusMapper;
import com.web.entity.Chargeitem;
import com.web.entity.Chargestatus;
import com.web.entity.ChargestatusExample;
import com.web.service.ChargeStatusService;

@Service
public class ChargeStatusServiceImpl implements ChargeStatusService {

	@Autowired
	ChargestatusMapper csm;
	
	@Autowired
	ChargeitemMapper cm;

	@Override
	public List<Chargestatus> queryAllChargeStatus() {

		return csm.queryAllInfo();
	}

	@Override
	public Chargestatus getChargeStatusById(Integer chargestatusid) {

		return csm.selectByPrimaryKey(chargestatusid);
	}

	@Override
	public Integer updateChargeStatusById(Chargestatus chargestatus) {
		
		//这里重新封装下数据
		Integer patientid = chargestatus.getChargeitem().getPatient().getPatientid();
		  
		chargestatus.setPatientid(patientid);
		 
		//更新chargestatus表
		int i = csm.updateByPrimaryKeySelective(chargestatus);
		
		//更新chargeitem表中的patientid
		//创建一个chargeitem对象
		Chargeitem item = new Chargeitem();
		item.setChargeid(chargestatus.getChargeitemno());
		item.setPatientid(patientid);
		int j = cm.updateByPrimaryKeySelective(item);
		
		return i&j;
	}

	@Override
	public Integer addChargestatus(Chargestatus chargestatus) {
		
		return csm.insert(chargestatus);
	}

}
