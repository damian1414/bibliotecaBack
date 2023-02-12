package com.damian.biblioteca.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.damian.biblioteca.model.Autor;
import com.damian.biblioteca.repository.AutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImp implements AutorService {
	
	@Autowired
	AutorRepository autorRepository;
	
	@Override
	public List<Autor> getAll() {
		// TODO Auto-generated method stub
		return autorRepository.findAll();
	}

	@Override
	public Autor getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autor save(Autor autor) {
		// TODO Auto-generated method stub
		return autorRepository.save(autor);
	}

	@Override
	public Autor getId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Autor> autor = autorRepository.findById(id);
		return autor.get();
	}

	@Override
	public Object delete(Integer id) {
		// TODO Auto-generated method stub
		 Map<String, Object> response = new HashMap<>();
		 autorRepository.deleteById(id);
	     response.put("mensaje", "Autor eliminado");
	     return response;
		
	}

	@Override
	public Autor update(Autor autor) {
		// TODO Auto-generated method stub
		return autorRepository.save(autor);
	}
	
}
