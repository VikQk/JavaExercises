package Exercici101;


public class Book{
	public String title;
	public String publisher;
	public int year;
	
	public Book(String title, String publisher, int year) {
		
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		
		
						
	}
	public String title() {
		this.title();
		return this.title();
		
	}
	public String publisher() {
		this.publisher();
		return this.publisher();
		
	}
	public int year() {
		this.year();
		return this.year();
		
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", publisher=" + publisher + ", year=" + year + "]";
	}
	

}
