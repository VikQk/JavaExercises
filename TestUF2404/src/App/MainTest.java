package App;

import java.util.*;

public class MainTest {	
	//update final
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Author> authors = start();
		while (true) {
			System.out.println("Que desea hacer:" + "\n1-Crear nuevo libro" + "\n2-Asignar un libro existente" + "\n3.Salir de la Aplicacion" + "\nSeleccione un numero:");
			String option = reader.nextLine();
			if(option.equals("1")) {
				createBook();
			}
			if (option.equals("2")) {
				assign(authors);
			}
			if (option.equals("3")) {
				break;
			}
		}
		
		System.out.println("See you in the sky!");
		}	

	public static ArrayList<Author> start(){	
		Book libro1 = new Book("Silmarillion","J.R.R.Tolkien", 1970, "unknow", 15);
		Book libro2 = new Book("Petter pan y wendy", "James Matthew Barrie", 1902, "unknow", 5);
		Book libro3 = new Book("The Hobbit","J.R.R.Tolkien", 1920,"George Allen & Unwin", 11);
		
		Author author1 = new Author("Pedro Perez", "Pedro_P@gmail.com",'M');
		Author author2 = new Author("Luisa Fernandez", "Luisa_Fdz@gmail.com", 'F');
		Author author3 = new Author("Antonio Lopez", "Toni_Lpz@gmail.com", 'M');
				
		author1.getBooks().add(libro1);
		author1.getBooks().add(libro2);
		author1.getBooks().add(libro3);
		
		ArrayList<Author> authors = new ArrayList<Author>();
		
		authors.add(author1);
		authors.add(author2);
		authors.add(author3);
		
		System.out.println(authors);
		return authors;
		
		}

	public static Book createBook(){
		//to-do
		
		Utils menu = new Utils();
		return menu.utils();
		
	}

	public static void assign(ArrayList<Author> authors){
			
		Book assign = createBook(); 
		
		System.out.println("A que autor asigna este libro?: "); 
		String selection = reader.nextLine(); 
		if(selection.equals("author1")) { 
		  authors.get(0).getBooks().add(assign);
		}
		if(selection.equals("author2")) { 
			  authors.get(1).getBooks().add(assign);
		}
		if(selection.equals("author3")) { 
			  authors.get(2).getBooks().add(assign);
		}
		  
		System.out.println(authors);
		 
	}


}
