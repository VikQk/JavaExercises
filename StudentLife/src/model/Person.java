package model;
import java.util.*;

public class Person {
	
	ArrayList<Person> students = new ArrayList<Person>();
	
	
	public void addPerson(Person newStudent) {
		
		this.students.add(newStudent);		
	}
	

}
