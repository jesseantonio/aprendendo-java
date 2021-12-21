package com.godev.devschools.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.godev.devschools.domain.School;
import com.godev.devschools.domain.Student;

@Service
public class SchoolDTOMapper {

	public SchoolDTO toDTO(School school) {
		
		SchoolDTO dto = new SchoolDTO();
		
		dto.name = school.getName();
		dto.cnpj = school.getCnpj();
		return dto;	
	}
	
	public List<SchoolDTO> toDTO(List<School> schools){
		
		List<SchoolDTO> dtos = new ArrayList<SchoolDTO>();
		
		for(School school : schools) {
			dtos.add(toDTO(school));
		}
		
		return dtos;
		
	}
	
	public School toEntity(SchoolDTO dto) {
		
		School school = new School();
		
		school.setName(dto.name);
		school.setCnpj(dto.cnpj);
		return school;
		
	}
	
	public List<School> toEntity(List<SchoolDTO> dtos){
		
		List<School> schools = new ArrayList<School>();
		
		for(SchoolDTO dto : dtos) {
			schools.add(toEntity(dto));
		}
		
		return schools;
		
	}
	
}
