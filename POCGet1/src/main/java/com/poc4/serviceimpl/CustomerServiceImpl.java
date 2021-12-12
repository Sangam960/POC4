package com.poc4.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.poc4.model.Customer;
import com.poc4.repository.CustomerRepository;
import com.poc4.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerrep;
	
	@Override
	public List<Customer> getAllCustomers() {
		
    List<Customer> customerList=customerrep.findAll();
	
    return customerList;
	}

	@Override
	public Optional<Customer> getCustomerById(int custId) {
		
		Optional<Customer> customer=customerrep.findById(custId);
		
		return customer;
	}
	
}
