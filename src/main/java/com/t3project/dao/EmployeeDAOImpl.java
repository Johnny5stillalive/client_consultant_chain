package com.t3project.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.t3project.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private HibernateTemplate hibernateTemplate;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		
		hibernateTemplate = new HibernateTemplate(sessionFactory);
		
	}

	
	@Override
	public void saveEmployee(Employee emp) {
		
		hibernateTemplate.saveOrUpdate(emp);
		
	}


	@Override
	public List<Employee> listAllEmployee() {
		
		List<Employee> listEmployee = hibernateTemplate.find("from Employee");
		if(listEmployee.size() > 0) {
			return listEmployee;
		}else 
			return null;	
	}


	@Override
	public void deleteEmployee(int id) {
		List<Employee> listEmployee = hibernateTemplate.find("from Employee as emp where emp.id = " + id);
		hibernateTemplate.delete(listEmployee.get(0));	
	}


	@Override
	public Employee editEmployee(int id) {
		List<Employee> listEmployee = hibernateTemplate.find("from Employee as emp where emp.id = " + id);
		if(listEmployee.size() > 0) {
			return listEmployee.get(0);
		}else
			return null;
	}


	@Override
	public void saveAndUpdatepdateEmployee(Employee emp) {
		hibernateTemplate.update(emp);
	}


	@Override
	public Employee loginAuth(String user, String userPassword) {
		List<Employee> listEmployee = hibernateTemplate.find("from Employee as emp where emp.name = '" + user + "' and emp.password = '" + userPassword + "'");
		if(listEmployee.size() > 0) {
			return listEmployee.get(0);
		}else
			return null;
	}
	
	

	
}
