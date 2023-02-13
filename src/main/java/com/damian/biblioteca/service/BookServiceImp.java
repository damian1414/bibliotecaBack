package com.damian.biblioteca.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.damian.biblioteca.model.Autor;
import com.damian.biblioteca.model.Book;
import com.damian.biblioteca.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Book getId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Book> book = bookRepository.findById(id);
		return book.get();
	}

	@Override
	public Object delete(Integer id) {
		// TODO Auto-generated method stub
		 Map<String, Object> response = new HashMap<>();
		 bookRepository.deleteById(id);
	     response.put("mensaje", "Libro eliminado");
	     return response;
	}

	@Override
	public Book update(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}


}
