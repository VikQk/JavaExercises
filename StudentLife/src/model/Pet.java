package model;

import java.util.*;

public class Pet {
	
	public String studentName;
	public String pet;
	public int petDay;
	public int petMonth;
	public int petYear;
	public int vacuneMonth;
	public int vacuneYear;
	
	ArrayList<Pet> pets = new ArrayList<Pet>();
	
	public Pet (String name, String yourpet, int petDay, int petMonth, int petYear) {
				
		this.studentName = name;
		this.pet = yourpet;
		this.petDay = petDay;
		this.petMonth = petMonth;
		this.petYear = petYear;
	}
	public Pet (int month, int year) {
		
		this.vacuneMonth = month;
		this.vacuneYear = year;
		
	}
	public void vacuneDate (int month, int year) {
		
		int mes = 10;
		if(month == mes) {
			System.out.println("Your pet need to vacunate this month! Call to the Veterinarian");
		}else {
			System.out.println("Remind " + (mes - month) + " months to the next vacune.");
		}
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public int getPetDay() {
		return petDay;
	}
	public void setPetDay(int petDay) {
		this.petDay = petDay;
	}
	public int getPetMonth() {
		return petMonth;
	}
	public void setPetMonth(int petMonth) {
		this.petMonth = petMonth;
	}
	public int getPetYear() {
		return petYear;
	}
	public void setPetYear(int petYear) {
		this.petYear = petYear;
	}
	
	public ArrayList<Pet> getPets() {
		return pets;
	}
	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}
	public void addPet(Pet newPet) {
		
		this.pets.add(newPet);
		
	}
	@Override
	public String toString() {
		return "Pet [studentName=" + studentName + ", pet=" + pet + ", petDay=" + petDay + ", petMonth=" + petMonth
				+ ", petYear=" + petYear + ", vacuneMonth=" + vacuneMonth + ", vacuneYear=" + vacuneYear + ", pets="
				+ pets + "]";
	}
	
}
