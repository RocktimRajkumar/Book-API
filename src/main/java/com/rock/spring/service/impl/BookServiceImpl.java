package com.rock.spring.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rock.spring.dao.BookDAO;
import com.rock.spring.model.Book;
import com.rock.spring.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;

	@Override
	@Transactional
	public long saveBook(Book book) {
		return bookDAO.saveBook(book);
	}

	@Override
	@Transactional
	public Book getBook(long id) {
		return bookDAO.getBook(id);
	}

	@Override
	@Transactional
	public List<Book> getAll() {
		return bookDAO.getAll();
	}

	@Override
	@Transactional
	public void update(long id, Book book) {
		bookDAO.update(id, book);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
