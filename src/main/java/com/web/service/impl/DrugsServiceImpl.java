package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.DrugsMapper;
import com.web.entity.Drugs;
import com.web.entity.DrugsExample;
import com.web.entity.DrugsExample.Criteria;
import com.web.service.DrugsService;


@Service
public class DrugsServiceImpl implements DrugsService {
	
	
	@Autowired
	DrugsMapper drugsMapper;
	

	@Override
	public List<Drugs> getAll() {
		
		/*List<Drugs>  list = drugsMapper.getAll();
		
		ArrayList<Drugs> arrayList = new ArrayList<>();
		
		for (Drugs a : list) {
			
			if(a.getSpecifications()=="1") {
				
				arrayList.add(a);
				
			}
			
		}
		
		 return   arrayList;*/
		
		return  drugsMapper.getAll();
	}


	@Override
	public Drugs getDrugByid(Integer drugsid) {
			
		return drugsMapper.getDrugByid(drugsid);
	}


	@Override
	public int updateDrugs(Drugs drugs) {
		
		
		return drugsMapper.updateByPrimaryKeySelective(drugs);
	}


	@Override
	public int insertdrugs(Drugs drugs) {
		
		return  drugsMapper.insert(drugs);
	}


	@Override
	public int delsup(Integer drugsid) {
		
		return drugsMapper.delsup(drugsid);
	}



	
}
