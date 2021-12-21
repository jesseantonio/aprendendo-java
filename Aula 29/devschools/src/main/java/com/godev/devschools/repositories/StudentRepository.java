package com.godev.devschools.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godev.devschools.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Transactional
	List<Student> findByName(String name);

	@Transactional
	Student findByCpf(String cpf);
	
	@Transactional
	Student findByEmail(String email);
	
	
	
}
