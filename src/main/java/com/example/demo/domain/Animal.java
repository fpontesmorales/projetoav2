package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Animal implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	private Integer id;
	private String nome;
	private int idade;
	private String sexo;
	
	@ManyToOne 
	@JoinColumn(name = "especie_id")
	private Especie especie;
	
	public Animal() {
		
	}

	public Animal(Integer id, String nome, int idade, String sexo, Especie especie) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.especie = especie;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	
	
		
	
	

}
