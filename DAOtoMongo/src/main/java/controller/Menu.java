package controller;

import java.util.*;

public class Menu {

	Scanner reader = new Scanner(System.in);
	
	public Menu(){
		
		System.out.println("Insert the name of the bird: ");
		String name  = reader.nextLine();
		System.out.println("Insert the latinName of the bird: ");
		String latinName = reader.nextLine();
		System.out.println("Select a number of observations: ");
		int observations = Integer.parseInt(reader.nextLine());
		
		Bird addbird = new Bird(name, latinName, observations);
		
		
	}
	
	
}


