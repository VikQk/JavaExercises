package controller;

import java.util.*;
import java.util.List;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import dao.AuthorDAO;
import model.Author;
import model.Bird;
import model.Book;

public class Controller {
	
	static Scanner reader = new Scanner(System.in);

	//create MongoClientURI and MongoClient and MongoDatabase
	//that is connecting our project to MongoDB Atlas,
	//particularly database city
	public static MongoDatabase init() {

		MongoClientURI connectionString = new MongoClientURI(
				"mongodb+srv://VikQk:Viktor09111982@cluster0.sslzu.mongodb.net/test");
		MongoClient mongoClient = new MongoClient(connectionString);

		MongoDatabase database = mongoClient.getDatabase("city");

		return database;

	}

	//create authorDAO java object and set DATA SOURCE, that is
	//authorDAO is working with MONGO CITY database (MongoDatabase object) created at init()
	public static AuthorDAO setSource(MongoDatabase database) {

		AuthorDAO authorDAO = new AuthorDAO();
		authorDAO.setDataSource(database);
		
		return authorDAO;

	}
	
	//get authorDAO and create 
	//books, one author and CALL to authorDAO.saveAurthor
	public static void add(AuthorDAO authorDAO) {
		
		String name;
		String latinName;
		int observations;
		
		Menu menu = new Menu();
		
		List<Bird> birds = new ArrayList<Bird>();
		
		while (true) {
						
			System.out.println("Insert the name of the bird: ");
			name  = reader.nextLine();
			System.out.println("Insert the latinName of the bird: ");
			latinName = reader.nextLine();
			System.out.println("Select a number of observations: ");
			observations = Integer.parseInt(reader.nextLine());
									
			}

		birds.add(new Bird(name, latinName, observations));
		
		Author birdsDb = new Author("Virgina", "Wolf", 59 , birds);

		authorDAO.saveAuthor(birdsDb);
	}

	//CALL to printAll from AuthorDAO class thanks to object authorDAO
	public static void printAll(AuthorDAO authorDAO) {

		authorDAO.printAll();
	}

}