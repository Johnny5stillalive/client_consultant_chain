package com.t3project.dao;
import java.util.List;

import com.t3project.bean.Employee;

public interface EmployeeDAO {
	
	 void saveEmployee(Employee emp);
	List<Employee> listAllEmployee();
	void deleteEmployee(int id);
	Employee editEmployee(int id);
	void saveAndUpdatepdateEmployee(Employee emp);
	Employee loginAuth(String user, String userPassword);
	
}
