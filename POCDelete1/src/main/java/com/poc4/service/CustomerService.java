package com.poc4.service;

import java.util.Optional;

import com.poc4.model.Customer;

public interface CustomerService {

	
	public void deleteCustomerById(int custId);
	
	public Optional<Customer> getCustomerById(int custId);
	
	public void updateCustomer(Customer customer);
}
