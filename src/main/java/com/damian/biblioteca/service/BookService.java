package com.damian.biblioteca.service;

import java.util.List;

import com.damian.biblioteca.model.Book;

public interface BookService {
	
	List<Book> getAll();

	Book getTitle();

	Book save(Book book);

	Book getId(Integer id);

	Object delete(Integer id);

	Book update(Book book);
}
