package com.app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.SearchDao;
import com.app.model.Details;
@Controller
public class SearchController {


	@Autowired(required=true)
	private SearchDao searchdao;
	
	@RequestMapping("getEmployeesList")
	public String formDetails(Model model){
		List<Details> details = searchdao.getAllDetails();
		model.addAttribute("details", details);
		return "authorbooks";
	}
	@RequestMapping(value="searchtext")
	public String searchRecords(@RequestParam(value="employeename",required=false)String employeename,
			                    @RequestParam(value="emailid",required=false)String emailid,
			                    @RequestParam(value="status",required=false)String status,
			                    Model model){
		System.out.println("in controller");
		List<Details> details = searchdao.getDetails(employeename,emailid,status);
		model.addAttribute("details", details);
		return "authorbooks";
	}
	@RequestMapping(value="text")
	public String searchDate(@RequestParam(value="startdate",required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date startdate,
                             @RequestParam(value="enddate",required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date enddate,
                              Model model){
		    System.out.println("in controller");
	    	System.out.println(startdate+","+enddate);
		     @SuppressWarnings("unused")
			List<Details> details = searchdao.searchDate(startdate,enddate);
            return   "authorbooks";   
	}
	
	
	}
