package com.godev.devschools.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.godev.devschools.domain.Student;

@Service
public class StudentDTOMapper {

	public StudentDTO toDTO(Student student) {
		
		StudentDTO dto = new StudentDTO();
		
		dto.name = student.getName();
		dto.email = student.getEmail();
		dto.cpf = student.getCpf();
		dto.password = student.getPassword();
		
		return dto;		
	}
	
	public List<StudentDTO> toDTO(List<Student> students){
		
		List<StudentDTO> dtos = new ArrayList<StudentDTO>();
		
		for(Student student : students) {
			dtos.add(toDTO(student));
		}
		
		return dtos;
		
	}
	
	public Student toEntity(StudentDTO dto) {
		
		Student student = new Student();
		
		student.setName(dto.name);
		student.setCpf(dto.cpf);
		student.setEmail(dto.email);
		student.setPassword(dto.password);
		
		return student;
		
	}
	
	public List<Student> toEntity(List<StudentDTO> dtos){
		
		List<Student> students = new ArrayList<Student>();
		
		for(StudentDTO dto : dtos) {
			students.add(toEntity(dto));
		}
		
		return students;
		
	}
	
}
