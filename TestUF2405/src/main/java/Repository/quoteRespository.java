package Repository;

import javax.persistence.EntityManager;

import Model.Quote;


import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public class quoteRespository {
	private EntityManager entityManager;

	public quoteRespository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Book> findAll() {
		return entityManager.createQuery("from Quote").getResultList();
	}
	public Optional<Quote> save(Quote quote) {
		Optional<Quote> resultSave;
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(quote);
			entityManager.getTransaction().commit();
			return resultSave = Optional.of(quote);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSave = Optional.empty();
	}
}