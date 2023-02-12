package com.damian.biblioteca.repository;

import java.util.Optional;

import com.damian.biblioteca.model.Autor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
	
	Optional<Autor> findById(Integer id);

}
