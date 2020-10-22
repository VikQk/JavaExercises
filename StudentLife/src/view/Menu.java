package view;

import java.util.*;

public class Menu {
	
	private Scanner reader;
	private ArrayList<String> options;
	
	public Menu(Scanner reader) {
		this.reader = reader;
				
		System.out.println("Select a option: " +"\n 1.Add Student" + "\n 2.Add Apartmen" + "\n 3.View Student");
		String option = reader.nextLine();
		
		
		
	}

}
