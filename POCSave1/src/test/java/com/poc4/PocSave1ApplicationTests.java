package com.poc4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.poc4.controller.CustomerController;
import com.poc4.model.Customer;
import com.poc4.repository.CustomerRepository;
import com.poc4.serviceimpl.CustomerServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class PocSave1ApplicationTests {


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
		
		Mockito.when(customerServiceImpl.addCustomer(customer)).thenReturn("Customer saved successfully");
		String output=customerController.addCustomer(customer);
        assertEquals("Customer saved successfully", output);
	}
}
