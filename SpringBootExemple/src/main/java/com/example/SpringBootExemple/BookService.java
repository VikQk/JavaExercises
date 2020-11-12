package com.example.SpringBootExemple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
		
	public List<Book> findAll() {
		
		List<Book> array = (List<Book>) repository.findAll();
		
		return array;
	}
	
	public void insertBook(Book book) {
		
		repository.save(book);
		//library.add(book);
	}
	
	public void deleteBook(Book book) {
		
		repository.delete(book);
		//library.remove(book);
		
	}

}
