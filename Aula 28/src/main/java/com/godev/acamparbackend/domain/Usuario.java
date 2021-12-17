package com.godev.acamparbackend.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
//import java.util.stream.Collectors;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.Valid;
import javax.validation.Valid;

import com.godev.acamparbackend.dto.UsuarioDTO;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.godev.acamparserver.domain.enums.Perfil;
//import com.godev.acamparserver.dto.UsuarioDTO;

@Entity(name = "Usuario")
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@Column(unique = true)
	private String login;

	@Column(unique = true)
	private String email;

//	@JsonIgnore
	private String senha;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "PERFIS")
	private Set<Integer> perfis = new HashSet<>();

	private Date inseridoEm;
	private Date atualizadoEm;

	public Usuario() {

	}

	public Usuario(Integer id, String nome, String login, String email, String senha, Date inseridoEm,
			Date atualizadoEm) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.inseridoEm = inseridoEm;
		this.atualizadoEm = atualizadoEm;
	}

	public Usuario(@Valid UsuarioDTO usuarioDTO) {

		this.id = usuarioDTO.getId();
		this.nome = usuarioDTO.getNome();
		this.login = usuarioDTO.getLogin();
		this.senha = usuarioDTO.getSenha();
		this.inseridoEm = usuarioDTO.getInseridoEm();
		this.atualizadoEm = usuarioDTO.getAtualizadoEm();
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//	public Set<Perfil> getPerfis() {
//		return perfis.stream().map(perfil -> Perfil.toEnum(perfil)).collect(Collectors.toSet());
//
//	}

	public Date getInseridoEm() {
		return inseridoEm;
	}

	public void setInseridoEm(Date inseridoEm) {
		this.inseridoEm = inseridoEm;
	}

	public Date getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(Date atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}
}
