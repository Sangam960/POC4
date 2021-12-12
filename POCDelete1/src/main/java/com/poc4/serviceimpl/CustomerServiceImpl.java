package com.poc4.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc4.model.Customer;
import com.poc4.repository.CustomerRepository;
import com.poc4.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerrep;
	
	@Override
	public void deleteCustomerById(int custId) {
	
		customerrep.deleteById(custId);
		
	}

	@Override
	public Optional<Customer> getCustomerById(int custId) {
	
		Optional<Customer> customer=customerrep.findById(custId);
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		
		customerrep.save(customer);
	
	}

}
