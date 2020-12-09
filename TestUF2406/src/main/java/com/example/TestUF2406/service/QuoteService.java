package com.example.TestUF2406.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestUF2406.model.Quote;
import com.example.TestUF2406.repository.QuoteRepository;

@Service
public class QuoteService {

	@Autowired
	QuoteRepository repository;

	public Iterable<Quote> findAll() {

		return repository.findAll();

	}

	public void insertQuote(Quote quote) {

		repository.save(quote);
		
	}

}
