package com.example.TestUF2406.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestUF2406.model.Book;
import com.example.TestUF2406.repository.BookRepository;

@Service
public class BookService {

	
	@Autowired
	BookRepository repository;
	
	public Iterable<Book> findAll(){
		
		return repository.findAll();
		
	}
	 public void saveBook(Book book) {
		 
		 repository.save(book);
	 }
	 public void insertBook(Book book) {
			
			repository.save(book);
			
		}
	
}
