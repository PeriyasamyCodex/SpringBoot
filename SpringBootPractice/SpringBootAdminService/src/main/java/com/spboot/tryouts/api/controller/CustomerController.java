package com.spboot.tryouts.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.tryouts.bean.Customer;
import com.spboot.tryouts.service.CustomerService;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/custList")
	public List<Customer> getCustomerList() {

		return customerService.getCustomerList();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addEmployee(@RequestBody Customer customer) {

		customerService.addCustomer(customer);
	}

	@RequestMapping("/cust/{custId}")
	public Customer getCustomerById(@PathVariable int custId) {

		return customerService.getCustomerById(custId);
	}

	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void updateCustomer(@RequestBody Customer customer) {

		customerService.updateCustomer(customer);
		
	}

	@RequestMapping(value="/remove",method=RequestMethod.DELETE)
	public void deleteCustomer(@RequestBody Customer customer) {

		customerService.deleteCustomer(customer);
		
	}

}
