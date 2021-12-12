package com.poc4.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.poc4.model.Customer;
import com.poc4.repository.CustomerRepository;
import com.poc4.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerepository;

	
	@Override
	public String addCustomer(Customer customer) {
		
		customerepository.save(customer);
		
		return "customer added";
	}
		
}
