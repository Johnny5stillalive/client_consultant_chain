package com.t3project.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.t3project.bean.Client;
import com.t3project.bean.Consultant;

public class ConsultantDAOImpl implements ConsultantDAO{

private HibernateTemplate hibernateTemplate;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		
		hibernateTemplate = new HibernateTemplate(sessionFactory);
		
	}


	@Override
	public void saveOrUpdateConsultant(Consultant client) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Consultant> listAllConsultant() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteConsultant(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Client editConsultant(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
