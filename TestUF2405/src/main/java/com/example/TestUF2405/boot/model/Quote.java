package com.example.TestUF2405.boot.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Quote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String tag;
	private String sentence;
	private int numberWords;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "Book_id_fk")
	private Book book;
		
	public Quote() {}
	
	public Quote(int id, String sentence, int numberWords, Book book) {
		super();
		this.id = id;
		this.sentence = sentence;
		this.numberWords = numberWords;
		this.book = book;
	}
	public Quote (int id, String sentence, int numberWords) {
		this.id = id;
		this.sentence = sentence;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getNumberWords() {
		return numberWords;
	}
	public void setNumberWords(int numberWords) {
		this.numberWords = numberWords;
	}
	//public Book getBook() {
	//	return book;
//	}
	//public void setBook(Book book) {
//		this.book = book;
//0	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", sentence=" + sentence + ", numberWords=" + numberWords + "]";
	}
}
