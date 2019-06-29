package com.rock.spring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rock.spring.dao.BookDAO;
import com.rock.spring.model.Book;

public class BookDAOImpl implements BookDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long saveBook(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book getBook(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAll() {
		List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book").list();
		return list;
	}

	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
