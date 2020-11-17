package com.example.TestUF2405.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestUF2405.boot.model.Quote;
import com.example.TestUF2405.boot.repository.QuoteRepository;

@Service
public class QuoteService {
	
	@Autowired
	QuoteRepository repository;
	
	
	public Iterable<Quote> findAll(){
		
		return repository.findAll();
		
	}

}
