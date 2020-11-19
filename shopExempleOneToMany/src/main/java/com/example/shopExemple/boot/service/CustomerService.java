package com.example.shopExemple.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopExemple.boot.model.Customer;
import com.example.shopExemple.boot.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public Iterable<Customer> findAll() {

		return repository.findAll();
	}
}