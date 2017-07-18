package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployDao;
import com.app.model.Employ;
@Service
public class EmployServiceImpl implements EmployService{
	@Autowired
	private EmployDao dao;

	public void addEmploy(Employ employ) {
		dao.addEmploy(employ);
				
	}

	public List<Employ> getAlldetails() {
		return dao.getAlldetails();
		
	}
	
	public Employ getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}
	public void updateEmploy(Employ e) {
		dao.updateEmploy(e);
		
	}

}
