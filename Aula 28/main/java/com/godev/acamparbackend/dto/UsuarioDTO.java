package com.godev.acamparbackend.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.godev.acamparbackend.domain.Usuario;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message = "Nome não pode ser vazio")
	@NotBlank(message = "Nome não pode estar em branco")
	private String nome;
	
	@NotEmpty(message = "Login não pode ser vazio")
	@NotBlank(message = "Login não pode estar em branco")
	private String login;
	
	@NotEmpty(message = "Email não pode ser vazio")
	@NotBlank(message = "Email não pode estar em branco")
	private String email;
	
	@NotEmpty(message = "Senha não pode ser vazio")
	@NotBlank(message = "Senha não pode estar em branco")
	private String senha;
	
	@NotEmpty(message = "O usuário deve ter ao menos um perfil")
	private Set<String> perfis;
	
	private Date inseridoEm;
	private Date atualizadoEm;
	
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioDTO(Integer id, String nome, String login, String email, String senha, Date inseridoEm,
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
	
	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.login = usuario.getLogin();
		this.senha = usuario.getSenha();
		this.inseridoEm = usuario.getInseridoEm();
		this.atualizadoEm = usuario.getAtualizadoEm();
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
	
	public Set<String> getPerfis() {
		return perfis;
	}

	public void setPerfis(Set<String> perfis) {
		this.perfis = perfis;
	}

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
