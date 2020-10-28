package App;

import java.util.*;

public class Utils {
	
	
	

	public static Book utils() {
		
		Scanner reader = new Scanner (System.in);
		Book testBook = new Book();
		while (true) {
			System.out.println("Introduce el nombre del libro(En blanco o 0, termina el proceso): ");
			String ask1 = reader.nextLine();
			if (ask1.isEmpty()) {
				break;
			}
			System.out.println("Introduce el autor: ");
			String ask2 = reader.nextLine();
			if (ask2.isEmpty()) {
				break;
			}
			System.out.println("Introduce el año: ");
			int ask3 = Integer.valueOf(reader.nextLine());
			if (ask3==0) {
				break;
			}
			System.out.println("Introduce la editorial: ");
			String ask4 = reader.nextLine();
			if (ask4.isEmpty()) {
				break;
			}
			System.out.println("Introduce su precio: ");
			int ask5 = Integer.valueOf(reader.nextLine());
			if (ask5==0){
				break;
			}			
			
			testBook = new Book (ask1, ask2, ask3, ask4, ask5);
			
			
		}
		return testBook;
	}
}
	

