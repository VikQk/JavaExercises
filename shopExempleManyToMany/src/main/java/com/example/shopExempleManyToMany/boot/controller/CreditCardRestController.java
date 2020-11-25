package com.example.shopExempleManyToMany.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopExempleManyToMany.boot.model.CreditCard;
import com.example.shopExempleManyToMany.boot.service.CreditCardService;

@RestController
@RequestMapping("/webapi")
public class CreditCardRestController {


	@Autowired
	CreditCardService service;
	
	@GetMapping("/creditcards")
	public Iterable<CreditCard> findAll() {

		return service.findAll();
	}
	
	
	

}
