package com.godev.acamparbackend.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class FacilidadeDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Descrição não pode ser vazio")
	@NotBlank(message = "Descrição não pode estar em branco")
	private String descricao;

	public FacilidadeDTO() {
		// TODO Auto-generated constructor stub
	}

	public FacilidadeDTO(Integer id,
			@NotEmpty(message = "Descrição não pode ser vazio") @NotBlank(message = "Descrição não pode estar em branco") String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
