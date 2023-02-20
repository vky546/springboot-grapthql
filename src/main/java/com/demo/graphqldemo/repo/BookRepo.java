package com.demo.graphqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.graphqldemo.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
