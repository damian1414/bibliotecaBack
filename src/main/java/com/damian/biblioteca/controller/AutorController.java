package com.damian.biblioteca.controller;

import java.util.List;

import com.damian.biblioteca.model.Autor;
import com.damian.biblioteca.service.AutorService;

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
@RequestMapping(value = "/api/autor")
@CrossOrigin(origins = { "http://localhost:4200" })
public class AutorController {

	@Autowired
	private AutorService autorService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Autor>> getAll() {
		return ResponseEntity.ok(autorService.getAll());
	}

	@PostMapping(path = "/createAutor", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Autor> save(@RequestBody Autor autor) {
		return ResponseEntity.ok(autorService.save(autor));
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Autor> getId(@PathVariable Integer id) {
		return ResponseEntity.ok(autorService.getId(id));
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		return ResponseEntity.ok(autorService.delete(id));
	}

	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Autor> update(@RequestBody Autor autor) {
		return ResponseEntity.ok(autorService.update(autor));
	}

}
