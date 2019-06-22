package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String nome;
	private String cargo;
	private String endereco;
	private String cidade;
	private String pais;
	private String telefone;
	private String nomecli;
	

	public Empresa() {
		super();
	}
	
	public Empresa(Integer codigo, String nome, String cargo, String endereco, String cidade, String pais,
			String telefone, String nomecli) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.endereco = endereco;
		this.cidade = cidade;
		this.pais = pais;
		this.telefone = telefone;
		this.nomecli = nomecli;
		
	}
	
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public String getNomecli() {
		return nomecli;
	}

	public void setNomecli(String nomecli) {
		this.nomecli = nomecli;
	}

}
