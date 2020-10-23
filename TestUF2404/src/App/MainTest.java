package App;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		start();
		createBook();
		
		System.out.println("See you in the sky!");
		}	

	public static void start(){	
		Book libro1 = new Book("Silmarilion","J.R.R.Tolkien", 1970, "unknow", 15);
		Book libro2 = new Book("Petter pan y wendy", "James Matthew Barrie", 1902, "unknow", 5);
		Book libro3 = new Book("The Hobbit","J.R.R.Tolkien", 1920,"George Allen & Unwin", 11);
		
		Author author1 = new Author("Pedro Perez", "Pedro_P@gmail.com",'P');
		Author author2 = new Author("Luisa Fernandez", "Luisa_Fdz@gmail.com", 'L');
		Author author3 = new Author("Antonio Lopez", "Toni_Lpz@gmail.com", 'A');
		
		libro1.setAuthor(author2);
		libro2.setAuthor(author2);
		libro3.setAuthor(author2);
		
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		
		}

	public static void createBook(){
		//to-do
		Scanner reader = new Scanner(System.in);
		Author author2 = new Author("Luisa Fernandez", "Luisa_Fdz@gmail.com", 'L');
		
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
			
			Book testBook = new Book (ask1, ask2, ask3, ask4, ask5);
			
			testBook.setAuthor(author2);
			
			System.out.println(testBook);
		}
		
	}

	public static void assign(){
		
	}


}
