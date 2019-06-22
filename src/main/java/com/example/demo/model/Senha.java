package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Senha implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer senha;
	
	private String email;
	
	public Senha() {
		super();
	}
	
	public Senha(Integer senha, String email) {

		super();		
		this.senha = senha;
		this.email = email;
	}

	public Integer getSenha() {
		return senha ;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

}
