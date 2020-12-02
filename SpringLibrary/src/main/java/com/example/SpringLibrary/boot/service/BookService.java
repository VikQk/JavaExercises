package com.example.SpringLibrary.boot.service;

import java.util.Optional;

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

	public void insertBook(Book book) {
		
		repository.save(book);
		//library.add(book);
	}
	
	public void deleteBook(Book book) {
		
		repository.delete(book);
		//library.remove(book);
		
	}
	public Optional<Book> findById (long id) {

		return repository.findById(id);
	}
	
}
