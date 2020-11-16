package com.example.shopExemple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public Iterable<Customer> findAll() {

		return repository.findAll();
	}
}