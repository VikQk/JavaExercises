package com.example.TestUF2405.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.TestUF2405.boot.model.Book;
import com.example.TestUF2405.boot.repository.BookRepository;

@Service
public class BookService {

	
	@Autowired
	BookRepository repository;
	
	public Iterable<Book> findAll(){
		
		return repository.findAll();
		
	}
	
}
