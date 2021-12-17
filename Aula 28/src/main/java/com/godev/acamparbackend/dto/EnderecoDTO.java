package com.godev.acamparbackend.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class EnderecoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Logradouro não pode ser vazio")
	@NotBlank(message = "Logradouro não pode estar em branco")
	private String logradouro;

	private String numero;

	private String complemento;

	@NotEmpty(message = "Bairro não pode ser vazio")
	@NotBlank(message = "Bairro não pode estar em branco")
	private String bairro;

	@NotEmpty(message = "Cep não pode ser vazio")
	@NotBlank(message = "Cep não pode estar em branco")
	private String cep;

	public EnderecoDTO() {

	}

	public EnderecoDTO(Integer id,
			@NotEmpty(message = "Logradouro não pode ser vazio") @NotBlank(message = "Logradouro não pode estar em branco") String logradouro,
			String numero, String complemento,
			@NotEmpty(message = "Bairro não pode ser vazio") @NotBlank(message = "Bairro não pode estar em branco") String bairro,
			@NotEmpty(message = "Cep não pode ser vazio") @NotBlank(message = "Cep não pode estar em branco") String cep) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
