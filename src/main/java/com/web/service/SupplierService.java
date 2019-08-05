package com.web.service;

import java.util.List;

import com.web.entity.Supplier;

public interface SupplierService {
	
	
	List<Supplier>   getAllsupplier();
		
	Supplier selectSupplierByid(Integer supplierid);
	
	int updatesupplier(Supplier supplier);
	
	int delSupplierByid(Integer  supplierid);
	
	int addsupplier(Supplier supplier);

}
