package com.app.dao;


import java.util.Date;
import java.util.List;

import com.app.model.Details;


public interface SearchDao {
	
	
	List<Details> getDetails(String employeename, String emailid, String status);

	public List<Details> getAllDetails();
     

	public List<Details> searchDate(Date startdate,Date enddate);

	

}