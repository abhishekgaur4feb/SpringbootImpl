package com.springboot.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.test.entities.Employee;
import com.springboot.test.repository.EmployeeRepository;

@Component
public class EmployeeService {
    @Autowired
	private EmployeeRepository employeeRepository;
	
	
	//Find all employee
	public List<Employee> getAllEmployee(){
	return (List<Employee>) this.employeeRepository.findAll(); 
	}
	
	//add employee
		public Employee addEmployee(Employee employee) {
			 Employee result= employeeRepository.save(employee);
			 return result;
		}	
	

		//Get Employee by id
		public Employee getEmployeedetailsById(int employeeid) {
			Employee result= employeeRepository.findById(employeeid);	
			return result;
			
		}
		
		//Delete Employee Information by id
		public void deletEmployeeById(int employeeid) {
			 employeeRepository.deleteById(employeeid);
			
			
		}
		
		//delete all entries
		public void deleteAllEmployee() {
			employeeRepository.deleteAll();
			
		}



}
