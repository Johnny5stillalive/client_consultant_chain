package com.t3project.service;

import java.util.List;

import com.t3project.bean.Vendor;

public interface VendorService {

	void saveorUpdateVendor(Vendor vendor);
	List<Vendor> listAllVendor();
	void deleteVendor(int id);
	Vendor editVendor(int id);
}
