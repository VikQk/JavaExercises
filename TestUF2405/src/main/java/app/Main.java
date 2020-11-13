package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.Book;
import Model.Quote;
import Repository.bookRepository;
import Repository.quoteRespository;

import java.util.List;
import java.util.Optional;


public class Main {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		
		quoteRespository quoteRepository = new quoteRespository(entityManager);
		bookRepository bookRepository = new bookRepository(entityManager);
		
		Book book1 = new Book ("Anna Karenina");
		Book book2 = new Book ("Orlando");
			
		
		Quote quote1 = new Quote(1,"All happy families are alike; each unhappy family is unhappy in its own way.", 15, book1);
		Quote quote2 = new Quote(1,"If you look for perfection, you'll never be content.", 10, book1);
		Quote quote3 = new Quote(1,"I think... if it is true that there are as many minds as there are heads, then there are as many kinds of love as there are hearts.", 28, book1);
		Quote quote4 = new Quote(1,"He stepped down, trying not to look long at her, as if she were the sun, yet he saw her, like the sun, even without looking.", 26, book1);
		Quote quote5 = new Quote(1,"Respect was invented to cover the empty place where love should be.", 12, book1);
		
		Quote quote6 = new Quote(2, "As long as she thinks of a man, nobody objects to a woman thinking.", 14, book2);
		Quote quote7 = new Quote(2, "Nothing thicker than a knife's blade separates happiness from melancholy.", 11, book2);
		Quote quote8 = new Quote(2, "Love, the poet said, is woman's whole existence", 9, book2);
		
		book1.setQuote(quote1);
		book1.setQuote(quote2);
		book1.setQuote(quote3);
		book1.setQuote(quote4);
		book1.setQuote(quote5);
		
		book2.setQuote(quote6);
		book2.setQuote(quote7);
		book2.setQuote(quote8);
					
		Optional<Quote> savedQuote1 = quoteRepository.save(quote1);
		Optional<Quote> savedQuote2 = quoteRepository.save(quote2);
		Optional<Quote> savedQuote3 = quoteRepository.save(quote3);
		Optional<Quote> savedQuote4 = quoteRepository.save(quote4);
		
			
	
	
}
}
