package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.Employ;
import com.app.service.EmployService;

@Controller
@RequestMapping("user")
public class JSONController {
	
	@Autowired
	private EmployService employService;
	
	
	@RequestMapping("/data")
	@ResponseBody
	public List<Employ> getList(){
		List<Employ> alldetails = employService.getAlldetails();
		return alldetails;
	}

	
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	@ResponseBody
	public String addEmploy(@ModelAttribute("employ") Employ e){
		employService.addEmploy(e);
			return "ok";
		}
	
	
	
	@RequestMapping(value="edit",method=RequestMethod.PUT)
    public @ResponseBody String edit(Employ employ,Model model){
		employService.updateEmploy(employ);
    	System.out.println("Iam okkkkkk");
    		//System.out.println("i value is "+employee.getId());
    		return "success";
    		
    	}
    
}
