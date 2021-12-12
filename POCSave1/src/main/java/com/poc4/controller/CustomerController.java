package com.poc4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc4.model.Customer;
import com.poc4.serviceimpl.CustomerServiceImpl;

@RestController
public class CustomerController {

	@Autowired
	CustomerServiceImpl cust;
	
    @PostMapping("/addCustomer")
	public String addCustomer(@RequestBody Customer customer)
	{
		cust.addCustomer(customer);
		
		return "Customer saved successfully";
	}
}
