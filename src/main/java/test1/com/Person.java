package test1.com;
import java.util.*;

public class Person {
	
	String name;
	int year;
	int weight;
	int age;
	
	public Person(String name) 
	{		
		this.name = name;
		this.year= 0;
		this.weight = 0;
		this.age=0;
				
	}

	@Override
	public String toString() {
		return this.name + " have " + this.age + " years " ;
	}
	
	public int becomeOlder(int year) 
	{
		return this.age = this.age+1;
		}
	
	public boolean isAdult() 
	{	
		if (this.year < 18) {
			return false;
		}
		return true;
	}
	
	public boolean bodyMassIndex() 
	{
		if (this.weight < 70) {
			return false;
		}
		return true;
	}			
	
	public void PrintPerson() 
	{
		System.out.println(this.name + " have " + this.age + " years.");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
