package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Author;
import repository.AuthorRepository;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		// Create our entity manager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Create our repositories ...
		AuthorRepository authorRepository = new AuthorRepository(entityManager);
		// Create an author
		//Author virginia = new Author("Virginia Wolf", "UK");
		//Author leon = new Author("Leon Tolstoi", "Russia");
		//Author victor = new Author("Victor Hugo", "French");
		//Author dante = new Author("Dante Alighieri", "Italy");
		//Author tolkien = new Author("J.R.R.Tolkien", "UK");

		//Optional<Author> savedAuthor1 = authorRepository.save(virginia);
		//Optional<Author> savedAuthor2 = authorRepository.save(leon);
		//Optional<Author> savedAuthor3 = authorRepository.save(victor);
		//Optional<Author> savedAuthor4 = authorRepository.save(dante);
		//Optional<Author> savedAuthor5 = authorRepository.save(tolkien);
		
		String name;
		String country;
		while (true) {
		System.out.println("Insert name of author(type quit to exit): ");
		String optionName = reader.nextLine();
		if (optionName.equals("quit")) {
			break;
		}
		System.out.println("Insert country of author: ");
		String optionCountry = reader.nextLine();
		Author testAuthor = new Author(optionName, optionCountry);
		Optional<Author> savedAuthor = authorRepository.save(testAuthor);
		}
		
		
		// System.out.println("Saved author: " + savedAuthor1.get());
		// Find all authors
		List<Author> authors = authorRepository.findAll();
		System.out.println("Authors:");
		for (Author authorToPrint : authors) {
			System.out.println(authorToPrint);
		}

		authors.forEach(System.out::println);

		// Find author by name
		Optional<Author> authorByName = authorRepository.findByName("Leon Tolstoi");
		System.out.println("Searching for an author by name: ");
		authorByName.ifPresent(System.out::println);
		authorByName = authorRepository.deleteByName("Leon Tolstoi");
		authorByName.ifPresent(System.out::println);
		// Close the entity manager and associated factory
		entityManager.close();
		entityManagerFactory.close();
	}
}