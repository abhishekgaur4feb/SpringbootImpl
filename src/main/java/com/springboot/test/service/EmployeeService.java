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
	List<Employee> list= (List<Employee>) this.employeeRepository.findAll();
	return list;
	}
	
	//add employee
		public Employee addEmployee(Employee e) {
			 Employee result= employeeRepository.save(e);
			 return result;
		}
	
}
