package com.rock.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rock.spring.dao.BookDAO;
import com.rock.spring.model.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long saveBook(Book book) {
		sessionFactory.getCurrentSession().save(book);
		return book.getId();
	}

	@Override
	public Book getBook(long id) {
		return sessionFactory.getCurrentSession().get(Book.class, id);
	}

	@Override
	public List<Book> getAll() {
		List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book").list();
		return list;
	}

	@Override
	public void update(long id, Book book) {

		Session session = sessionFactory.getCurrentSession();
		Book oldBook = session.byId(Book.class).load(id);
		oldBook.setTitle(book.getTitle());
		oldBook.setAuthor(book.getAuthor());
		session.flush();

	}

	@Override
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = session.byId(Book.class).load(id);
		session.delete(book);
	}

}
