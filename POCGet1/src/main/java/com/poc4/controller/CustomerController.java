package com.poc4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.poc4.model.Customer;
import com.poc4.serviceimpl.CustomerServiceImpl;

@RestController
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers()
	{
		List<Customer> customerList=customerServiceImpl.getAllCustomers();
		
		return new ResponseEntity<List<Customer>>(customerList,HttpStatus.OK);
	}
	
	@GetMapping("/getAllCustomers/{custId}")
	public Optional<Customer> getCustomerById(@PathVariable int custId)
	{
		Optional<Customer> customer=customerServiceImpl.getCustomerById(custId);
		
		return customer;
	}
	
	
}
