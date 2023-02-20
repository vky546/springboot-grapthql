package com.demo.graphqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.graphqldemo.entity.Book;
import com.demo.graphqldemo.payloads.BookInput;
import com.demo.graphqldemo.service.BookService;

@Controller
@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@MutationMapping("creteBook")
	@PostMapping
	public Book createBook(@Argument BookInput book) {
		Book book1 = new Book();
		book1.setAuthor(book.getAuthor());
		book1.setDesc(book.getAuthor());
		book1.setPages(book.getPages());
		book1.setPrice(book.getPrice());
		book1.setTitle(book.getTitle());

		return this.bookService.crete(book1);
	}

	@QueryMapping("allBooks")
	@GetMapping
	public List<Book> getAllBook() {
		return this.bookService.getAll();
	}

	@QueryMapping("getBook")
	@GetMapping("/{bookId}")
	public Book getBook(@Argument @PathVariable int bookId) {
		return this.bookService.get(bookId);
	}
}
