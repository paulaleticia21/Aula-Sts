package com.example.demo.postagem;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table (name = " Postagem")
public class PostagemTable {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codigo;
	
	
	@Column
	private String nome;
	
	@Column
	private int cpf;
	
	
	@Column
	private String email;
	
	
	@Column
	private String Titulo;
	
	@Column
	private String Texto;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date date = new java.sql.Date(System.currentTimeMillis());
	
	
	
	//getters e setters
	


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	public String getTexto() {
		return Texto;
	}


	public void setTexto(String texto) {
		Texto = texto;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
	

}
