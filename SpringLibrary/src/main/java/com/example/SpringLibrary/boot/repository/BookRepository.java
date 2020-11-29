package com.example.SpringLibrary.boot.repository;

import javax.persistence.Id;
import org.springframework.data.repository.CrudRepository;
import com.example.SpringLibrary.boot.model.Book;


public interface BookRepository extends CrudRepository<Book, Id> {

	
}
