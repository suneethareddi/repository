package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	public List<Employee> listEmployeess();
	public void deleteEmployee(Employee employee);
    public Employee editEmployee(int empid);
    /*public Employee updateEmployee(Employee employee);*/
}
