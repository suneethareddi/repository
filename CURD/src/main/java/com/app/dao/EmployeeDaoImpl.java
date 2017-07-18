package com.app.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao 
{
	
  @Autowired
  private HibernateTemplate ht;
  
	public void addEmployee(Employee employee) {
		Hibernate.initialize(Employee.class);
		ht.saveOrUpdate(employee);
	}

	public List<Employee> listEmployeess() {
		Hibernate.initialize(Employee.class);
		List<Employee> list=ht.loadAll(Employee.class);
		return list;
	}

	public void deleteEmployee(Employee employee) {
		Hibernate.initialize(Employee.class);
		ht.delete(employee);
	}

	@Override
	public Employee editEmployee(int empid) {
		
		Employee e=ht.load(Employee.class,empid);
		Hibernate.initialize(e);
	  return e;
	}
}
