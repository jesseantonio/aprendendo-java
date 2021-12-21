package com.godev.devschools.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SchoolDTO {

	public String name;
	
	public String cnpj;
	
	@JsonIgnore
	public String password;
	
}
