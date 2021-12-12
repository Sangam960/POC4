package com.poc4.controller;

import java.util.Optional;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc4.model.Customer;
import com.poc4.serviceimpl.CustomerServiceImpl;

@RestController
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@DeleteMapping("/deleteById/{custId}")
	public String deleteById(@PathVariable int custId)
	{
		customerServiceImpl.deleteCustomerById(custId);
		
		return "Customer Deleted successfully with id:"+custId;
	}
	
	@GetMapping("/getAllCustomer/{custId}")
	public Optional<Customer> getCustomerById(@PathVariable int custId)
	{
		Optional<Customer> customer=customerServiceImpl.getCustomerById(custId);
		
		return customer;
	}
	
	@PutMapping("/updateCustomer/{custId}")
	public String updateCustomer(@RequestBody Customer customer,@PathVariable int custId)
	{
		customerServiceImpl.updateCustomer(customer);
		
		return "User Updated Successfully with id:"+customer.getCustId();
	}
	
	
	
}
