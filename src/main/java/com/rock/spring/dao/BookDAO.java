package com.rock.spring.dao;

import java.util.List;

import com.rock.spring.model.Book;

public interface BookDAO {

	// Save the record
	public long saveBook(Book book);
	
	// Get a single record
	public Book getBook(long id);
	
	// Get all record
	public List<Book> getAll();
	
	// update a record
	public void update(long id, Book book);
	
	// delete a record
	public void delete(long id);
	
}
