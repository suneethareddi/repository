package com.app.dao;


import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Details;

@Repository
@Transactional
public class SearchDaoImpl implements SearchDao {

	@Autowired
	private SessionFactory sessionfactory;

	@SuppressWarnings("unchecked")
	public List<Details> getDetails(String employeename, String emailid, String status) {

		Criteria crt = sessionfactory.getCurrentSession().createCriteria(Details.class);
		System.out.println(employeename+emailid+status);
		if(!employeename.isEmpty()){
	   crt.add(Restrictions.like("employeename", employeename, MatchMode.START));
		}
		if(!emailid.isEmpty()){
	   crt.add(Restrictions.like("emailid",emailid,MatchMode.START));
		}
		if(!status.isEmpty()){
	   crt.add(Restrictions.like("status",status,MatchMode.START));
		}
			   return crt.list();
	}
	

	@SuppressWarnings("unchecked")
	public List<Details> getAllDetails() {

		return sessionfactory.getCurrentSession().createCriteria(Details.class).list();
	}

	@SuppressWarnings("unchecked")
	public List<Details> searchDate(Date startdate, Date enddate) {

		Criteria crt = sessionfactory.getCurrentSession().createCriteria(Details.class);
		if(!((startdate==null) && (enddate == null))){
			  crt.add(Restrictions.ge("regdate", startdate));
			  crt.add(Restrictions.le("regdate", enddate));
			}

		return crt.list();
	}
	}

	
	

	