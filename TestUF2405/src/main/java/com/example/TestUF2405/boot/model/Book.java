package com.example.TestUF2405.boot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
//@NamedQueries({ @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
//@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b") })
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String title;	
	
    //private ArrayList<Quote> quotes = new ArrayList <Quote>();

public Book() {}

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


public Book(Integer id, String title, String author) {
	
	this.id = id;
	this.title = title;
	
}

/*
 * public void setQuotes(ArrayList<Quote> quotes) { this.quotes = quotes; }
 */

public String getTitle() {
		return title;
	}

public void setTitle(String name) {
		this.title = name;
	}
	
//public ArrayList<Quote> getQuotes() {
//	return quotes;
//}
//public void setQuote (Quote quotes) {
//		this.quotes.add(quotes);
//		quotes.setBook(this);
//	}

@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title +  "]";
}
}

