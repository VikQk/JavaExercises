package App;

public class Book {

	private String title;
	// change to object Author?
	private Object author;
	private int year;
	private String publisher;
	private  double cost;

	public Book(String title, String author, int year, String publisher, double cost) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.cost = cost;
	}
	
	public Book() {}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", publisher=" + publisher + ", cost=" + cost + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Object getAuthor() {
		return author;
	}

	public void setAuthor(Author author2) {
		this.author = author2;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
