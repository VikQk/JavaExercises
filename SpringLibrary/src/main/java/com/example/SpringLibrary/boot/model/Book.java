package com.example.SpringLibrary.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "BOOK")
public class Book {
	
	@Id
	private int id;
	private String title;
	private String author;
	
	
	public Book () {}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, String author, int id) {
		super();
		this.title = title;
		this.author = author;
		this.id = id;
	}

	public Book(int id2) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", id=" + id + "]";
	}

	
}
