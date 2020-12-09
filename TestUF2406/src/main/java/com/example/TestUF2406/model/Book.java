package com.example.TestUF2406.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@NamedQueries({ @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
		@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b") })

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	@Column(name="TITLE")
	private String title;
	@Column(name="AUTHOR")
	private String author;
	//@OneToMany(mappedBy = "QUOTE",cascade = CascadeType.ALL)
	//private List<Quote> quotes = new ArrayList<>();

	Book() {
	}

	public Book(Long id, String name, String author) {
		this.id = id;
		this.title = name;
		this.author = author;
	}

	public Book(String name) {
		this.title = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	/*
	 * public List<Quote> getQuotes() { return quotes; }
	 * 
	 * public void setQuote(Quote quotes) { this.quotes.add(quotes); }
	 */
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

	@Override
	public String toString() {

		return "Book{" + "id=" + id + ", name='" + title + '\'' + ", author=" + '}';

	}

}
