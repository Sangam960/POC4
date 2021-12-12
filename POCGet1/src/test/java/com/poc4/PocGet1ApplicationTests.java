package com.poc4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poc4.controller.CustomerController;
import com.poc4.model.Customer;
import com.poc4.serviceimpl.CustomerServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class PocGet1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Mock
	private CustomerServiceImpl customerServiceImpl;

	@InjectMocks
	CustomerController customerController;
	Customer customer = new Customer();

	@Test
	void addCustomerTest() {
		/*
		 * Mockito.doReturn("Customer added succesfully") .when(customerServiceImpl)
		 * .addCustomer(Mockito.any(Customer.class));
		 */	
		
		Mockito.when(customerServiceImpl.getAllCustomers()).thenReturn(new ArrayList<>());
		ResponseEntity<List<Customer>> output=customerController.getAllCustomers();
        assertEquals(HttpStatus.OK, output.getStatusCode());
	}
	
}
