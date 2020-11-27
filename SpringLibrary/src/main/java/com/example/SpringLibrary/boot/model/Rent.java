package com.example.SpringLibrary.boot.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Rent {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int Id;
	
	private Date timestamp;
	private Date timeLimit;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name="USER", nullable = true)
	@JsonIgnore
	private User user;	
	
	@OneToMany (mappedBy = "BOOK", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List <Book> bookRent;

	public Rent () {}

	public Rent(int id, Date timestamp, Date timeLimit, User user, List<Book> bookRent) {
		super();
		Date date = new Date();
		Id = id;
		this.timestamp = date;
		this.timeLimit = timeLimit;
		this.user = user;
		this.bookRent = bookRent;
	}

	public Rent(int id2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Date getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(Date timeLimit) {
		this.timeLimit = timeLimit;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Book> getBookRent() {
		return bookRent;
	}

	public void setBookRent(List<Book> bookRent) {
		this.bookRent = bookRent;
	}

	@Override
	public String toString() {
		return "Rent [Id=" + Id + ", timestamp=" + timestamp + ", timeLimit=" + timeLimit + ", user=" + user
				+ ", bookRent=" + bookRent + "]";
	}
	
	
	
}
