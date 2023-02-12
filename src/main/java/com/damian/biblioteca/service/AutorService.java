package com.damian.biblioteca.service;

import java.util.List;

import com.damian.biblioteca.model.Autor;


public interface AutorService {
	
  
	List<Autor> getAll();
	
	Autor getName();
	
	Autor save(Autor autor);
	
	Autor getId(Integer id);
	
	Object delete(Integer id);
	
	Autor update(Autor autor);
	
  
}
