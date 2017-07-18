package com.app.service;

import java.util.List;

import com.app.model.Employ;

public interface EmployService {
	public void addEmploy(Employ employ);
	public List<Employ> getAlldetails();
	public Employ getEmployeeById(int id);
	public void updateEmploy(Employ e);

}
