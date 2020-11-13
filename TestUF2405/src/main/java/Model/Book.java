package Model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinTable(
			name= "Book",
			joinColumns= {@JoinColumn(name="idBook")},
			inverseJoinColumns = {@JoinColumn(name="idQuote")}
			)
	
            private ArrayList<Quote> quotes;

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


public Book(Integer id, String title, ArrayList<Quote> quotes) {
	
	this.id = id;
	this.title = title;
	this.quotes = quotes;
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

public void setQuote (Quote quote) {
		this.quotes.add(quote);
	}

@Override
public String toString() {

		return "Book{" + "id=" + id + ", name='" + title + '\'' + ", author="  + '}';


	}


}

