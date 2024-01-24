package com.spboot.tryouts.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.tryouts.bean.Employee;
import com.spboot.tryouts.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/empList")
	public List<Employee> getEmployeeList() {

		return employeeService.getEmployeeList();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {

		employeeService.addEmployee(employee);
	}

	@RequestMapping("/emp/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {

		return employeeService.getEmployeeById(empId);
	}

	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {

		employeeService.updateEmployee(employee);
	}

	@RequestMapping(value="/remove",method=RequestMethod.DELETE)
	public void deleteEmployee(@RequestBody Employee employee) {

		employeeService.deleteEmployee(employee);
	}

}
