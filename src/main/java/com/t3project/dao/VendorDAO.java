package com.t3project.dao;

import java.util.List;

import com.t3project.bean.Client;
import com.t3project.bean.Vendor;

public interface VendorDAO {

	void saveorUpdateVendor(Vendor vendor);
	List<Vendor> listAllVendor();
	void deleteVendor(int id);
	Vendor editVendor(int id);
}
