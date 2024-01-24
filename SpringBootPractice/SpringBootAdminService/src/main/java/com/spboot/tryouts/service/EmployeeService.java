package com.spboot.tryouts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spboot.tryouts.bean.Employee;
import com.spboot.tryouts.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	

	@Cacheable("employeecache")
	public List<Employee> getEmployeeList() {

		List<Employee> employees = new ArrayList<Employee>();

		employeeRepo.findAll().forEach(t -> employees.add(t));		

		return employees;
	}

	@Cacheable("employeecache")
	public Employee getEmployeeById(int empId) {

		return employeeRepo.findById(empId).get();
	}

	public void updateEmployee(@RequestBody Employee employee) {

		employeeRepo.save(employee);
	}
	
	public void addEmployee(@RequestBody Employee employee) {

		employeeRepo.save(employee);
	}

	public void deleteEmployee(@RequestBody Employee employee) {

		employeeRepo.delete(employee);
	}

}
