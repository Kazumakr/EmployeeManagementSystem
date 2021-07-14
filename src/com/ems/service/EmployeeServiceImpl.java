package com.ems.service;

import java.util.List;

import com.ems.dao.EmployeeDAO;
import com.ems.dao.EmployeeDAOMySQLImpl;
import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO empDAO = new EmployeeDAOMySQLImpl();
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		empDAO.addEmployee(e);
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		empDAO.deleteEmployee(id);
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return empDAO.findEmployee(e);
	}

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return empDAO.showAllEmployees();
	}
	
	@Override	
	public void updateEmployee(int id,String name,String dept,int daysAttended) {
		// TODO Auto-generated method stub
		empDAO.updateEmployee(id, name, dept, daysAttended);
	}
}
