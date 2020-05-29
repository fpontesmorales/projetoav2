package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Consulta implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	private Integer id;
	private Date data;
	private String end;
	private String procedimento;
	
	public Consulta() {
		
	}

	public Consulta(Integer id, Date data, String end, String procedimento) {
		super();
		this.id = id;
		this.data = data;
		this.end = end;
		this.procedimento = procedimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
	

}
