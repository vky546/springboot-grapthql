package com.demo.graphqldemo.service;

import java.util.List;

import com.demo.graphqldemo.entity.Book;

public interface BookService {
	
	public Book crete(Book book);
	
	public Book get(int bookId);
	
	public List<Book> getAll();

}
