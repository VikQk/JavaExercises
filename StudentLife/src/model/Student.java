package model;

import view.Date;

public class Student extends Person{
	
	public String name;
	public String lastName;
	public Date birthDate;
	public String apartment;
	public String pet;	
	public int age;
		
	public Student (String name, String lastName, int day, int month, int year){
		
		this.name = name;
		this.lastName = lastName;
		this.birthDate = new Date(day, month, year);		
	}
	
	//getters y setters
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	
	public Student (String name, String lastName, String pet) {
		
		this.name = name;
		this.lastName = lastName;
		this.pet = pet;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", birthDate=" + birthDate + ", apartment="
				+ apartment + ", pet=" + pet + ", petDate=" + "]";
	}
	 
}