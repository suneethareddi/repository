package com.app.dao;

import java.util.List;

import com.app.model.Employ;

public interface EmployDao {
	public void addEmploy(Employ employ);
	public List<Employ> getAlldetails();
	public Employ getEmployeeById(int id);
	public void updateEmploy(Employ e);
	

}
