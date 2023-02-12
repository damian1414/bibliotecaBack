package com.damian.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "book")
@Getter
@Setter
public class Book {
	
	@Id 
	@GeneratedValue(generator="book_seq") 
	@SequenceGenerator(name="book_seq",sequenceName="seq_id_book", allocationSize=1) 
	@Column(name = "id_book")
	protected Integer id;
	
	@Column(name = "name")
	protected String name;
	
	@JoinColumn(name = "id_autor", referencedColumnName = "id_autor")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Autor idAutor;



}
