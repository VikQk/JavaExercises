package com.example.shopExempleManyToMany.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopExempleManyToMany.boot.model.CreditCard;
import com.example.shopExempleManyToMany.boot.model.Customer;
import com.example.shopExempleManyToMany.boot.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public Iterable<Customer> findAll() {

		return repository.findAll();
	}
	
	public void insertCustomer (Customer customer) {

		repository.save(customer);
	}
	
	
	public Optional<Customer> findById (long id) {

		return repository.findById(id);
	}

}