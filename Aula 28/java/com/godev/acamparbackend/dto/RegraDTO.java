package com.godev.acamparbackend.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.godev.acamparbackend.domain.Regra;

public class RegraDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Descrição não pode ser vazio")
	@NotBlank(message = "Descrição não pode estar em branco")
	private String descricao;

	public RegraDTO() {
		// TODO Auto-generated constructor stub
	}

	public RegraDTO(Integer id,
			@NotEmpty(message = "Descrição não pode ser vazio") @NotBlank(message = "Descrição não pode estar em branco") String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public RegraDTO(Regra regra) {
		super();
		this.id = regra.getId();
		this.descricao = regra.getDescricao();
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
