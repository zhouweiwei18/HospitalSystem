package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.dao.MedicalrecordMapper;
import com.web.entity.Medicalrecord;
import com.web.service.MedicalrecordService;

@Service
public class MedicalrecordServiceImpl implements MedicalrecordService {

	@Autowired
	MedicalrecordMapper medicalrecordMapper;

	@Override
	public List<Medicalrecord> getMedicalrecord() {

		List<Medicalrecord> list = medicalrecordMapper.queryAll();

		ArrayList<Medicalrecord> mlist = new ArrayList<Medicalrecord>();

		for (Medicalrecord m : list) {

			if (m.getIddelete().equals("0") ) {

				mlist.add(m);
			}
		}
		return mlist;
	}

	@Override
	public Integer addMedicalrecord(Medicalrecord medicalrecord) {

		return medicalrecordMapper.insertSelective(medicalrecord);
	}

	@Override
	public Medicalrecord getMedicalrecordById(Integer id) {

		return medicalrecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateMedicalRecordById(Medicalrecord medicalrecordid) {

		return medicalrecordMapper.updateByPrimaryKeySelective(medicalrecordid);
	}

	@Override
	public Integer deleteMedicalRecordById(Integer medicalrecordid) {
		
		return medicalrecordMapper.deleteMedicalRecordById(medicalrecordid);
	}

}
