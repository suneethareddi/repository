package com.app.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Employ;
@Repository
@Transactional
public class EmployDaoImpl implements EmployDao {
	@Autowired
	private SessionFactory sessionfactory;


	public void addEmploy(Employ employ) {
		//((Session) sessionfactory).saveOrUpdate(employ);
		sessionfactory.getCurrentSession().save(employ);

	}

	@SuppressWarnings("unchecked")
	public List<Employ> getAlldetails() {
		
		return sessionfactory.getCurrentSession().createCriteria(Employ.class).list();
	}
	
	public Employ getEmployeeById(int id) {
		Criteria createCriteria = sessionfactory.getCurrentSession().createCriteria(Employ.class);
		createCriteria.add(Restrictions.eq("id", id));
		Employ uniqueResult = (Employ) createCriteria.uniqueResult();
		return uniqueResult;
	}
	
	public void updateEmploy(Employ e) {
		 sessionfactory.getCurrentSession().update(e);
		
	}

}
