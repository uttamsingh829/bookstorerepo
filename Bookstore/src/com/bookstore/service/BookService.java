package com.bookstore.service;

import java.sql.SQLException;

import com.model.Book;

public interface BookService {
	
	public void insertBook(Book book) throws SQLException;

}
