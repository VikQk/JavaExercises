package com.example.TestUF2405.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.TestUF2405.boot.model.Quote;



public interface QuoteRepository extends CrudRepository<Quote, Integer> {

	//Quote findById(int id);
}
