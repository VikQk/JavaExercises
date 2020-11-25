package com.example.shopExempleManyToMany.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shopExempleManyToMany.boot.model.Product;
import com.example.shopExempleManyToMany.boot.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;

	public Iterable<Product> findAll() {

		return repository.findAll();
	}

	public void insertProduct (Product product) {

		repository.save(product);
	}

	public Product findById(long id) {

		return repository.findById(id);
	}

}