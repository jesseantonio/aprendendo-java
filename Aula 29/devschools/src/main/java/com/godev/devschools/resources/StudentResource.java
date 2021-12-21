package com.godev.devschools.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.godev.devschools.dto.StudentDTO;
import com.godev.devschools.dto.StudentDTOMapper;
import com.godev.devschools.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentResource {

	@Autowired
	private StudentService service;
	
	@Autowired
	private StudentDTOMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<StudentDTO>> getAll(){
		List<StudentDTO> students = mapper.toDTO(service.findAll());
		return ResponseEntity.ok().body(students);
		
	}
	
	@GetMapping("/name")
	public ResponseEntity<List<StudentDTO>> getByName(@RequestParam("name") String name){
		List<StudentDTO> students = mapper.toDTO(service.findByName(name));
		return ResponseEntity.ok().body(students);
	}
	
	@GetMapping("/cpf")
	public ResponseEntity<StudentDTO> getByCpf(@RequestParam("cpf") String cpf){
		StudentDTO student = mapper.toDTO(service.findByCpf(cpf));
		return ResponseEntity.ok().body(student);
	}
	
	@GetMapping("/email")
	public ResponseEntity<StudentDTO> getByEmail(@RequestParam("email") String email){
		StudentDTO student = mapper.toDTO(service.findByEmail(email));
		return ResponseEntity.ok().body(student);
	}
	
}

