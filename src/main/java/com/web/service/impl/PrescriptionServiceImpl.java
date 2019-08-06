package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.PrescriptionMapper;
import com.web.entity.PrescriptionExample;
import com.web.entity.Medicalrecord;
import com.web.entity.Prescription;
import com.web.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	PrescriptionMapper prescriptionMapper;

	@Override
	public List<Prescription> getPrescription() {

		List<Prescription> list = prescriptionMapper.queryAll();

		ArrayList<Prescription> plist = new ArrayList<Prescription>();

		for (Prescription p : list) {

			if (p.getIsdelete() == 0) {

				plist.add(p);
			}
		}
		return plist;
	}

	@Override
	public Integer addPrescription(Prescription prescription) {

		return prescriptionMapper.insertSelective(prescription);
	}

	@Override
	public Prescription getPrescriptionById(Integer pid) {

		return prescriptionMapper.selectByPrimaryKey(pid);
	}

	@Override
	public Integer updatePrescriptionByNumber(Prescription prescriptionnumber) {

		return prescriptionMapper.updateByPrimaryKeySelective(prescriptionnumber);
	}

	@Override
	public Integer deletePrescriptionById(Integer prescriptionnumber) {
		
		return prescriptionMapper.deletePrescriptionById(prescriptionnumber);
	}

}
