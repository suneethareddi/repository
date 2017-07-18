package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;
import com.app.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveEmployee(HttpServletRequest request)
	{
		Employee employee=new Employee();
		employee.setEmpId(Integer.parseInt(request.getParameter("empid")));
		employee.setEmpName(request.getParameter("empname"));
		employee.setEmpAddress(request.getParameter("empaddress"));
		employee.setEmpAge(Integer.parseInt(request.getParameter("empage")));
		employee.setSalary(Long.parseLong(request.getParameter("empsalary")));
		employeeService.addEmployee(employee);
		return new ModelAndView("index","message","Employee added to Database");
	}
	@RequestMapping(value="employee",method=RequestMethod.GET)
	public ModelAndView listEmployees(ModelMap map)
	{ 
		List<Employee> list=employeeService.listEmployeess();
		map.addAttribute("employees",list);
		return new ModelAndView("employeesList");
	}
	@RequestMapping(value="add",method=RequestMethod.GET)
	public ModelAndView addEmployee()
	{  return new ModelAndView("addEmployee");
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public ModelAndView deleteEmployee(@RequestParam("id")int empid,ModelMap map)
	{   
		Employee employee=new Employee();
		employee.setEmpId(empid);
		employeeService.deleteEmployee(employee);
		List<Employee> list=employeeService.listEmployeess();
		map.addAttribute("employees",list);
		return new ModelAndView("employeesList");
	}
	 
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView editEmployee(@RequestParam("id")int empid,ModelMap map)
	
	{ Employee e=
		employeeService.editEmployee(empid);
		return new ModelAndView("editEmployee","emp",e);
	}
	
	/*public String updateEmployee(@RequestParam())*/
	}
