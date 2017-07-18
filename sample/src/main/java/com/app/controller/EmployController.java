package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.Employ;
import com.app.service.EmployService;

@Controller
public class EmployController {
	@Autowired
	private EmployService service;
	
	
    @RequestMapping(value="add",method=RequestMethod.POST)
public String addEmploy(@ModelAttribute("employ") Employ e){
		
		/*if(e.getEmpName() == 0){divyasai
			//new employ, add it sunitha krishanan sgcdfgdafchda
			this.service.addEmploy(e);
		}
		else{
			//existing employ, call update
			this.service.updateEmploy(e);
		}*/
		service.addEmploy(e);
		return "addEmploy";
		
	}
    @RequestMapping(value="list",method=RequestMethod.GET)
    public String listEmploys(Model model)
    { 
    	List<Employ> list=service.getAlldetails();
    	for (Employ employ : list) {
    		System.out.println(employ.getEmpName());
		}
    	model.addAttribute("employ",list);
    	System.out.println(service.getAlldetails().size());
		return "listEmploys";
    	
    	
    }
    
    @RequestMapping(value="getPage")
    public String getPage(){
    		
    		return "addEmploy";
    		
    	}
    @RequestMapping(value="getDeatils")
    public String getEmployeeById(@RequestParam("id") int id,Model model){
    	Employ emp = service.getEmployeeById(id);
    	model.addAttribute("emp", emp);
    	System.out.println("getDeatilsgetDeatilsgetDeatilsgetDeatilsgetDeatilsgetDeatils"+emp.getEmpName());
    	model.addAttribute("employ", new Employ());
    		return "editEmployee";
    		
    	}
    
    @RequestMapping(value="edit",method=RequestMethod.PUT)
    public @ResponseBody String edit(@ModelAttribute Employ employ,Model model){
    	service.updateEmploy(employ);
    	System.out.println("Iam okkkkkk");
    		//System.out.println("i value is "+employee.getId());
    		return "successPage";
    		
    	}
    
}
