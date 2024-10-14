package com.springboot.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entities.Employee;
import com.springboot.test.service.EmployeeService;

@RestController
public class SpringbootController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		return employeeService.getAllEmployee();	
		
	}
	
	@GetMapping("/employee/{id}")
	public Employee findemployeedetails(@PathVariable("id") int employeeid){
		return employeeService.getEmployeedetailsById(employeeid);
		
	}
	
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);		
	}
	
	
	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployeeByID(@PathVariable("id") int employeeid) {
		 employeeService.deletEmployeeById(employeeid);
		 return "Deleted Successfully";
	}

	
	@DeleteMapping("/deleteallemployee")
	public void deleteallEmployee() {
		 employeeService.deleteAllEmployee();	
	}
	
	@GetMapping("/home")
	public String firstHandler() {
		System.out.println("This is Home Page");
		return "home";
	}
	
	
	
	@GetMapping("/contact")
	public String ContactHandler() {
		System.out.println("This is Contact Page");
		return "contact";
	}
	
	
	
	
}
