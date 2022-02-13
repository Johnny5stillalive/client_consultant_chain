package com.t3project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.t3project.dao.VendorDAO;
import com.t3project.bean.Vendor;
import com.t3project.service.VendorService;

public class VendorServiceImpl implements VendorService{
	
	@Autowired
	VendorDAO vendorDAO;

	@Override
	public void saveorUpdateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Vendor> listAllVendor() {
		// TODO Auto-generated method stub
		return vendorDAO.listAllVendor();
	}

	@Override
	public void deleteVendor(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vendor editVendor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
