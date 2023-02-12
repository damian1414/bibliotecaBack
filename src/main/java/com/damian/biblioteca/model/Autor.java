package com.damian.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "autor")
@Getter
@Setter
public class Autor {
	
	@Id 
	@GeneratedValue(generator="autor_seq") 
	@SequenceGenerator(name="autor_seq",sequenceName="seq_id_autor", allocationSize=1) 
	@Column(name = "id_autor")
	protected Integer id;
	
	@Column(name = "name")
	protected String name;
	@Column(name = "document")
	protected Long document;


}
