package com.example.SpringBootExemple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	
	static List<Book> library= new ArrayList<Book>();
	
	static {
		Book book1 = new Book ("Anna Karenina", "BASGA15-252S38", 568, 1872, "Leon Tolstoi");
		Book book2 = new Book ("The lighthouse", "BSDGA15-278912", 356, 1926, "Virginia Wolf");
		Book book3 = new Book ("War and Peace", "BAgyg15-250092", 528, 1872, "Leon Tolstoi");
		Book book4 = new Book ("Orlando", "yuplA15-340112", 356, 1926, "Virginia Wolf");
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
	}
	public List<Book> findAll() {
		return library;
	}
	
	public void insertBook(Book book) {
		
		repository.save(book);
	}
	
	public void deleteBook(Book book) {
		
		repository.delete(book);
	}

}
