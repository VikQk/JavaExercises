package model;
import java.util.*;

public class Person {
	
	private ArrayList<Person> students;
	private String dbName;
	
	public Person (String name) {
		
		this.students = new ArrayList<Person>();
		this.dbName = name;
	}	

	public ArrayList<Person> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Person> students) {
		this.students = students;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
	@Override
	public String toString() {
		return "Person [students=" + students + ", dbName=" + dbName + "]";
	}

}
