package com.godev.devschools.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godev.devschools.domain.School;
import com.godev.devschools.domain.Student;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

	@Transactional
	List<School> findByName(String name);
	
}
