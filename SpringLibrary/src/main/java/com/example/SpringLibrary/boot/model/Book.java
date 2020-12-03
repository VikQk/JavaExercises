package com.example.SpringLibrary.boot.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "BOOK")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String title;
	private String author;
	
	
	
	public Book () {}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		
	}

	public Book(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", id=" + id + "]";
	}

	
}
