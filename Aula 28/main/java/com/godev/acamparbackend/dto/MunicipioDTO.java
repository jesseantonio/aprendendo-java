package com.godev.acamparbackend.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class MunicipioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Nome não pode ser vazio")
	@NotBlank(message = "Nome não pode estar em branco")
	private String nome;

	public MunicipioDTO() {
		// TODO Auto-generated constructor stub
	}

	public MunicipioDTO(Integer id,
			@NotEmpty(message = "Nome não pode ser vazio") @NotBlank(message = "Nome não pode estar em branco") String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

}
