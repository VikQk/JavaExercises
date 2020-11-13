package Repository;

import javax.persistence.EntityManager;

import Model.Quote;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public class bookRepository {
	private EntityManager entityManager;

	public bookRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Book> findAll() {
		return entityManager.createQuery("from Book").getResultList();
	}
	public Optional<Book> save(Book book) {
		Optional<Book> resultSaved;
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(book);
			entityManager.getTransaction().commit();
			return resultSaved = Optional.of(book);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSaved = Optional.empty();
	}
	public Optional<Book> findByTitle(String title) {
		Book book = entityManager.createQuery("SELECT b FROM Book b WHERE b.title = :title", Book.class)
				.setParameter("title", title).getSingleResult();
		return book != null ? Optional.of(book) : Optional.empty();
	}
}
