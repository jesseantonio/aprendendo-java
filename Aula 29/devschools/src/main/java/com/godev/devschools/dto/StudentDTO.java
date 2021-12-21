package com.godev.devschools.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentDTO {

	public String name;
	
	public String cpf;
	
	public String email;
	
	@JsonIgnore
	public String password;
	
}
