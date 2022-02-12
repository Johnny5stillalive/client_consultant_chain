package com.t3project.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.t3project.bean.Client;

public class ClientDAOImpl implements ClientDAO{

	
	private HibernateTemplate hibernateTemplate;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		
		hibernateTemplate = new HibernateTemplate(sessionFactory);
		
	}


	@Override
	public void saveOrUpdateClient(Client client) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Client> listAllClient() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Client editClient(int id) {
		// TODO Auto-generated method stub
		return null;
	}





}
