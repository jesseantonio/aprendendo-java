package com.godev.devschools.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.devschools.domain.School;
import com.godev.devschools.repositories.SchoolRepository;


@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	
	public List<School> findAll(){
		return  schoolRepository.findAll();
	}

	public List <School>findByName(String name){
		return schoolRepository.findByName(name);
	}


}
