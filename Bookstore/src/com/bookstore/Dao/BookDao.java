 package com.bookstore.Dao;

import java.sql.SQLException;

import com.model.Book;

public interface BookDao {
	
	public boolean insertBook(Book book) throws SQLException ;

}
