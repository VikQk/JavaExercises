package com.example.TestUF2405.boot.repository;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.TestUF2405.boot.model.Book;



public interface BookRepository extends CrudRepository<Book, Integer> {

	List<Book> getTitle(String title);

	Book findByTitle(String title);
}
