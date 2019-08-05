package com.web.service;

import java.util.List;

import com.web.entity.Drugs;

public interface DrugsService {

	List<Drugs> getDrugs = null;

	List<Drugs> getDrugs();

	List<Drugs> getAll();

	Drugs getDrugByid(Integer drugsid);

	int updateDrugs(Drugs drugs);

	int insertdrugs(Drugs drugs);
	
	int delsup(Integer drugsid);

	

}
