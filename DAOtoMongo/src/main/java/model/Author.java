package model;

import java.util.List;

public class Author {

	private String name;
	private String surname;
	private int age;
	private List<Bird> books;

	public Author(String name, String surname, int age, List<Bird> books) {
		//super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", surname=" + surname + ", age=" + age + ", book=" + books + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Bird> getBooks() {
		return books;
	}

	public void setBook(List<Bird> books) {
		this.books = books;
	}

}