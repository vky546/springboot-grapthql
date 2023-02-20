package com.demo.graphqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.graphqldemo.entity.Book;
import com.demo.graphqldemo.service.BookService;

@SpringBootApplication
public class GraphqlDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}
	
	@Autowired
	private BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		Book book1 = new Book();

		book1.setId(1);
		book1.setTitle("dsa book");
		book1.setAuthor("vikkey");
		book1.setDesc("this is a dsa book");
		book1.setPages(10);
		book1.setPrice(500.0);

		Book book2 = new Book();

		book2.setId(2);
		book2.setTitle("dsa book2");
		book2.setAuthor("vikkey2");
		book2.setDesc("this is a dsa book2");
		book2.setPages(20);
		book2.setPrice(1000.0);

		Book book3 = new Book();

		book3.setId(3);
		book3.setTitle("dsa book3");
		book3.setAuthor("vikkey3");
		book3.setDesc("this is a dsa book3");
		book3.setPages(30);
		book3.setPrice(1500.0);
		
		bookService.crete(book1);
		bookService.crete(book2);

		bookService.crete(book3);

		
		
	}

}
