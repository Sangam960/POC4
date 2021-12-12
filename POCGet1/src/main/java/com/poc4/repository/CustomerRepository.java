package com.poc4.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.poc4.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

	
}
