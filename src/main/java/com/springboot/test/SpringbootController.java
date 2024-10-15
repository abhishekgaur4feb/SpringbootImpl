package com.springboot.test;

import java.util.List;
import java.util.Optional;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

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
	public ResponseEntity<Employee> findemployeedetails(@PathVariable("id") int employeeid){
		 Employee employee_details=  employeeService.getEmployeedetailsById(employeeid);
		 if(employee_details==null) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		return ResponseEntity.of(Optional.of(employee_details));
	}
	
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);	
	}
	
	
	@PutMapping("/updateemployee/{id}")
	public Employee updateemployeeinfo(@RequestBody Employee employee,@PathVariable("id") int employeeid) {
		return employeeService.updateEmployeeDetails(employee,employeeid);	
	}
	
	
	
	
	@DeleteMapping("/deleteemployee/{id}")
	public ResponseEntity<Void> deleteEmployeeByID(@PathVariable("id") int employeeid) {
		try { 
		this.employeeService.deletEmployeeById(employeeid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	
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
