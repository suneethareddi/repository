package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	List<Employee> listEmployeess();

	void deleteEmployee(Employee employee);
	public Employee editEmployee(int empid);

	
}
