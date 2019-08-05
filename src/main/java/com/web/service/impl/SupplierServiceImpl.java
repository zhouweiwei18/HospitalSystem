package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.SupplierMapper;
import com.web.entity.Supplier;
import com.web.entity.SupplierExample;
import com.web.entity.DrugsExample.Criteria;
import com.web.service.SupplierService;


@Service
public class SupplierServiceImpl implements SupplierService{
	
	@Autowired
	SupplierMapper  supplierMapper;

	
      //  查询所有的供应商
	@Override
	public List<Supplier> getAllsupplier() {
		
		SupplierExample example = new SupplierExample();
		
		List<Supplier>  list = supplierMapper.selectByExample(example);
		
		ArrayList<Supplier> lista =  new ArrayList<>();
		
		for (Supplier a : list) {
			
			if(a.getIsdelete()==1) {
				
				lista.add(a);
	
			}
			
		}

		return lista;
	}


     //根据id  查询供应商信息
	@Override
	public Supplier selectSupplierByid(Integer supplierid) {
		
		return supplierMapper.selectByPrimaryKey(supplierid);
	}

     //修改用户信息
	@Override
	public int updatesupplier(Supplier supplier) {
		
		   SupplierExample example  = new SupplierExample();
		   example.createCriteria().andSupplieridEqualTo(supplier.getSupplierid());
		   return supplierMapper.updateByExample(supplier, example);
	}


	@Override
	public int delSupplierByid(Integer supplierid) {
		
		return supplierMapper.delSupplierByid(supplierid);
	}


	@Override
	public int addsupplier(Supplier supplier) {
		
		return supplierMapper.insert(supplier);
	}

}
