package com.example.SpringLibrary.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringLibrary.boot.model.Book;
import com.example.SpringLibrary.boot.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository repository;
	
	public Iterable<Book> findAll(){
		
		return repository.findAll();
	}

}
