package com.springboot.test.repository;

import org.springframework.data.repository.CrudRepository;
import com.springboot.test.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
 public Employee findById(int id);
}
