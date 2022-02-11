package com.t3project.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class ClientDAOImpl implements ClientDAO{

	
	private HibernateTemplate hibernateTemplate;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		
		hibernateTemplate = new HibernateTemplate(sessionFactory);
		
	}
}
