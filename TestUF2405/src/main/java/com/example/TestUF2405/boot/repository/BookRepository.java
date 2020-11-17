package com.example.TestUF2405.boot.repository;

import java.awt.print.Book;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByLastName(String lastName);

	Book findById(int id);
}
