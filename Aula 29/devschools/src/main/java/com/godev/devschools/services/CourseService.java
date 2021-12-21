package com.godev.devschools.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.devschools.domain.Course;
import com.godev.devschools.repositories.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	public List<Course> getCoursesCpf(String cpf) {

		List<Course> courses = repository.getCoursesByCpfStudent(cpf);
		return courses;

	}

}
