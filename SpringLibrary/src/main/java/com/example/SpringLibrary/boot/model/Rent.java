package com.example.SpringLibrary.boot.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="RENT")
public class Rent {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)	
	private Long Id;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	@JsonIgnore
	private User userId;	
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "Book_ID")
	private Book bookId;
	@JoinColumn(name = "time")
	private String time;
	
	public Rent () {}

	public Rent( User user,Book book,String time) {
		super();
		
		this.userId = user;
		this.bookId = book;		
		this.time = time;
	}

	
	public Rent(Long id) {
		// TODO Auto-generated constructor stub
		this.Id = id;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Book getBookId() {
		return bookId;
	}

	public void setBookId(Book bookId) {
		this.bookId = bookId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
