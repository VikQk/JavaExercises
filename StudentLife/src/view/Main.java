package view;

import java.util.*;

import model.Pet;
import model.Student;

public class Main {
	//update final
	public static void main(String[] args){
		Scanner reader = new Scanner (System.in);
		
		//CREAR MENU, por parametros introduce datos de student y poder agregar un apartment.
		
		/*
		 * System.out.println("Enter a name: "); String ask1 = reader.nextLine();
		 * System.out.println("Enter a last name: "); String ask2 = reader.nextLine();
		 * System.out.println("Enter the day of your birthdate: "); int day =
		 * reader.nextInt(); System.out.println("Enter the month of your birthdate: ");
		 * int month = reader.nextInt();
		 * System.out.println("Enter the year of your birthdate: "); int year =
		 * reader.nextInt(); System.out.println("do you have a pet? Enter his name:");
		 * String ask3 = reader.nextLine();
		 * System.out.println("Enter a day birthdate of the pet: "); int petDay =
		 * reader.nextInt(); System.out.println("Month: "); int petMonth =
		 * reader.nextInt(); System.out.println("Year: "); int petYear =
		 * reader.nextInt();
		 */
		Student name = new Student("luis", "perez", 12, 6, 1990);
		
		Menu menu = new Menu(reader);
			
		
		
		
		
		
	}

}
