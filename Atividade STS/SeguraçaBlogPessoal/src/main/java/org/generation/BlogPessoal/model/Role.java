package org.generation.BlogPessoal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

//Role é os privilegio de Usuario
@Entity
public class Role implements GrantedAuthority {
	
	//ATRIBUTOS--------------------------------------------------
	@Id 
	private String nomeRole;
	
	@ManyToMany(mappedBy = "roles")
	private List<Usuario> usuarios;
	
	//getters e  setters
	//método que retorna role
	
	@Override
	
	public String getAuthority() {
		return this.nomeRole;
	}

	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
 
	
}