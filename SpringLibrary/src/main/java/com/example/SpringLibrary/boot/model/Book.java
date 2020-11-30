package com.example.SpringLibrary.boot.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "BOOK")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	
	//@ManyToOne(fetch = FetchType.LAZY)
	//@JsonIgnore
	//private Book book;
	
	public Book () {}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		
	}

	public Book(Long id2) {
		this.id = id2;
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
