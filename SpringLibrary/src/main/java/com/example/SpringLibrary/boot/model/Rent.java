package com.example.SpringLibrary.boot.model;

import java.util.Date;
import java.util.List;
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
	
	//@OneToMany (mappedBy = "BOOK", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name = "Book_ID")
	//private List <Book> bookRent;

	public Rent () {}

	public Rent(Long id, Date timestamp, Date timeLimit, User user, List<Book> bookRent) {
		super();
		
		Id = id;
		
		//this.user = user;
		//this.bookRent = bookRent;
	}

	public Rent(int id2) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	
	public User getUser() {
		return userId;
	}

	public void setUser(User user) {
		this.userId = user;
	}

	//public List<Book> getBookRent() {
	//	return bookRent;
	//}

	//public void setBookRent(List<Book> bookRent) {
	//	this.bookRent = bookRent;
	//}

	
	
	
	
}
