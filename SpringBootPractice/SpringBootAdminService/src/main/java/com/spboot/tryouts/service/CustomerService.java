package com.spboot.tryouts.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spboot.tryouts.bean.Customer;
import com.spboot.tryouts.repository.CustomerRepo;

@Service
public class CustomerService {
	
	

	@Autowired
	private CustomerRepo customerRepo;

	@Cacheable("customercache")
	public List<Customer> getCustomerList() {

		List<Customer> customers = new ArrayList<Customer>();

		customerRepo.findAll().forEach(t -> customers.add(t));

		return customers;
	}

	@Cacheable("customercache")
	public Customer getCustomerById(int custId) {

		return customerRepo.findById(custId).get();
	}

	public void updateCustomer(@RequestBody Customer customer) {

		customerRepo.save(customer);
	}

	public void deleteCustomer(@RequestBody Customer customer) {

		customerRepo.delete(customer);
	}

	public void addCustomer(Customer customer) {

		customerRepo.save(customer);
	}

}
