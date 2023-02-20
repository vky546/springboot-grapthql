package com.demo.graphqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.graphqldemo.entity.Book;
import com.demo.graphqldemo.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepo repo;

	@Override
	public Book crete(Book book) {
		
		return repo.save(book);
	}

	@Override
	public Book get(int bookId) {
		
		return repo.findById(bookId).orElseThrow(() -> new RuntimeException("book is not found by thi id !"));
	}

	@Override
	public List<Book> getAll() {
		
		return repo.findAll();
	}

}
