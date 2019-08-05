package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.DrugstorageMapper;
import com.web.entity.BedExample.Criteria;
import com.web.entity.Drugstorage;
import com.web.entity.DrugstorageExample;
import com.web.service.DrugStorageService;


@Service
public class DrugStorageServiceImpl implements DrugStorageService {
	
	
	@Autowired
	DrugstorageMapper drugstorageMapper;

	@Override
	public List<Drugstorage> getAllDrugStorage() {
		
		
		
		List<Drugstorage> selectByExample = drugstorageMapper.getAll();
		
		ArrayList<Drugstorage> arrayList = new ArrayList<>();
		
		for (Drugstorage a : selectByExample) {
			
			if(a.getIsdelete()==1) {
				
				arrayList.add(a);
			}

		}
		
		return arrayList;
	}

}
