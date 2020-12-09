package com.example.TestUF2406.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@NamedQueries({ @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
		@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b") })

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private ArrayList<Quote> quotes;

	Book() {
	}

	public Book(Integer id, String name) {
		this.id = id;
		this.title = name;
	}

	public Book(String name) {
		this.title = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public ArrayList<Quote> getQuotes() {
		return quotes;
	}

	public void setQuote(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}

	@Override
	public String toString() {

		return "Book{" + "id=" + id + ", name='" + title + '\'' + ", author=" + '}';

	}

}
