package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.DrugsMapper;
import com.web.entity.Drugs;
import com.web.entity.DrugsExample;

import com.web.service.DrugsService;

@Service
public class DrugsServiceImpl implements DrugsService {
	
	@Autowired
	DrugsMapper drugsMapper;
	
	@Override
	public List<Drugs> getDrugs() {
		
		return drugsMapper.selectByExample(new DrugsExample());
	}

}
