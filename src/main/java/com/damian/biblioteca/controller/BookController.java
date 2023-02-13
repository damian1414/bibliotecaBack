package com.damian.biblioteca.controller;

import java.util.List;

import com.damian.biblioteca.model.Book;
import com.damian.biblioteca.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/book")
@CrossOrigin(origins = { "http://localhost:4200" })
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getAll() {
		return ResponseEntity.ok(bookService.getAll());
	}

	@PostMapping(path = "/createBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> save(@RequestBody Book book) {
		return ResponseEntity.ok(bookService.save(book));
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getId(@PathVariable Integer id) {
		return ResponseEntity.ok(bookService.getId(id));
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		return ResponseEntity.ok(bookService.delete(id));
	}

	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> update(@RequestBody Book book) {
		return ResponseEntity.ok(bookService.update(book));
	}

}
