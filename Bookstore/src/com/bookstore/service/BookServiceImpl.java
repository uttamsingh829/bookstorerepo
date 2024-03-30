package com.bookstore.service;

import java.sql.SQLException;

import com.bookstore.Dao.BookDAOImpl;
import com.bookstore.Dao.BookDao;
import com.model.Book;


public class BookServiceImpl  implements BookService{
	
	// declare instance variable
	String jdbcURL ;
	String jdbcUsername ;
	String jdbcPassword ;
	
	// intialse valuee through Constructor

	public BookServiceImpl(String jdbcURL , String jdbcUsername, String jdbcPassword) {
		
		this.jdbcURL =jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
 //
	private BookDao  bookDao = new BookDAOImpl();

	@Override
	public void insertBook(Book book) throws SQLException {
		
		System.out.println("BookServiceImpl :"+book.getTitle() +" "+ book.getAuthor()+ " "+ book.getPrice());

		bookDao.insertBook(book);
		
	}

}
