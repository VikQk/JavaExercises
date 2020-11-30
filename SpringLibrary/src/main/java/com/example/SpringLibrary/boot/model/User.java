package com.example.SpringLibrary.boot.model;

import javax.persistence.*;;

@Entity
@Table(name="USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@OneToMany(mappedBy = "User", fetch = FetchType.LAZY,
	//cascade = CascadeType.ALL)
	private Long id;
	private String name;
	private String lastName;
		
	public User() {}
	
	public User(Long id) {
		super();
		this.id = id;
	}
	
	public User(String name, String lastName) {
		
		this.name = name;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	
}
