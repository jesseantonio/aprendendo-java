package com.godev.acamparbackend.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class EmailDTO {
	
	@NotEmpty(message = "Email não pode ser vazio")
	@NotBlank(message = "Email não pode estar em branco")
	@Email(message = "Email inválido")
	private String email;
	
	public EmailDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
