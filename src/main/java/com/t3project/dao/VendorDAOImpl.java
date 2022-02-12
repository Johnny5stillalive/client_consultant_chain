package com.t3project.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.t3project.bean.Client;
import com.t3project.bean.Vendor;

public class VendorDAOImpl implements VendorDAO {

private HibernateTemplate hibernateTemplate;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		
		hibernateTemplate = new HibernateTemplate(sessionFactory);
		
	}


	@Override
	public void saveorUpdateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Vendor> listAllVendor() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteVendor(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Client editVendor(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
