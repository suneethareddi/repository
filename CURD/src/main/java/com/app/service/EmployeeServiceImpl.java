package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	 @Autowired
		private EmployeeDao employeeDao;

	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	public List<Employee> listEmployeess() {
		return employeeDao.listEmployeess();
	}

	public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmployee(employee);
	}

	@Override
	@Transactional(readOnly=true)
	public Employee editEmployee(int empid) {
		return employeeDao.editEmployee(empid);
	}
		
	 

}
