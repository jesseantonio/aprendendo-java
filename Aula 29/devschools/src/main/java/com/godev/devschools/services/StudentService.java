package com.godev.devschools.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.devschools.domain.Student;
import com.godev.devschools.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	public List<Student> findByName(String name) {
		return studentRepository.findByName(name);
	}

	public Student findByCpf(String cpf) {
		return studentRepository.findByCpf(cpf);
	}
	
	public Student findByEmail(String email) {
		return studentRepository.findByEmail(email);
	}
	
}

