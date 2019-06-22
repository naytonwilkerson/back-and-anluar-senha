package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String nome;
	private String cargo;
	private String cidade;
	private String pais;
	private String telefone;
	
	
	
	
	public Cliente() {
		super();
	}




	public Cliente(Integer codigo, String nome, String cargo,  String cidade,  String pais,
			String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.cidade = cidade;
		this.pais = pais;
		this.telefone = telefone;
	}




	public Integer getCodigo() {
		return codigo;
	}




	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCargo() {
		return cargo;
	}




	public void setCargo(String cargo) {
		this.cargo = cargo;
	}






	public String getCidade() {
		return cidade;
	}




	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getPais() {
		return pais;
	}




	public void setPais(String pais) {
		this.pais = pais;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	
}
