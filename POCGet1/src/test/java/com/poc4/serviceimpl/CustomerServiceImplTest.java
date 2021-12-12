package com.poc4.serviceimpl;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poc4.model.Customer;
import com.poc4.repository.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class CustomerServiceImplTest {


	@InjectMocks
	private CustomerServiceImpl customerServiceImpl;

	@Mock
	CustomerRepository customeRep;
	Customer customer = new Customer();

	/*
	 * @Test void addCustomerTest() {
	 * 
	 * Mockito.when(customeRep.findAll()).thenReturn(new ArrayList<Customer>());
	 * String output=customerServiceImpl.getAllCustomers();
	 * assertEquals("customer added", output); }
	 */
}
