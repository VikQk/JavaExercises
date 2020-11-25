package com.example.shopExempleManyToMany.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopExempleManyToMany.boot.model.CreditCard;
import com.example.shopExempleManyToMany.boot.repository.CreditCardRepository;


@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository repository;


	public Iterable<CreditCard> findAll() {

		return repository.findAll();
	}

	public void insertCreditCard (CreditCard creditcard) {

		repository.save(creditcard);
	}

}
