package com.godev.devschools.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.godev.devschools.dto.SchoolDTO;
import com.godev.devschools.dto.SchoolDTOMapper;
import com.godev.devschools.services.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolResource {

	@Autowired
	private SchoolService service;
	
	@Autowired
	private SchoolDTOMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<SchoolDTO>> getAll(){
		List<SchoolDTO> schools = mapper.toDTO(service.findAll());
		return ResponseEntity.ok().body(schools);
		
	}
	
	@GetMapping("/name")
	public ResponseEntity<List<SchoolDTO>> getByName(@RequestParam("name") String name){
		List<SchoolDTO> schools = mapper.toDTO(service.findByName(name));
		return ResponseEntity.ok().body(schools);
	}
	
	
}
