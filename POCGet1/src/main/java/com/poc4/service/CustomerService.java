package com.poc4.service;

import java.util.List;
import java.util.Optional;

import com.poc4.model.Customer;

public interface CustomerService {

	
	public List<Customer> getAllCustomers();
	
	public Optional<Customer> getCustomerById(int custId);
	
}
