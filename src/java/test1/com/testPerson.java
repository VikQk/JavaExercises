package test1.com;

public class testPerson {

	public static void main(String[] args) 
	{
		Person victor = new Person(null);
		victor.setAge(35);
		victor.setName("victor");
		victor.setWeight(75);
		victor.setYear(1982);
		
		
		boolean test=victor.isAdult();
		System.out.println("your age is accepted: " + test);
		
		victor.PrintPerson();
		
		victor.toString();
		
		int test2=victor.becomeOlder(0);
		System.out.println("At next year you gave: " + test2 + " years.");
		
		boolean test3=victor.bodyMassIndex();
		System.out.println("Is your weight acceptable?: " + test3);
		
	}

}
