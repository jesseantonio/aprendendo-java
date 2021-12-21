package com.godev.devschools.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.godev.devschools.domain.Course;
import com.godev.devschools.services.CourseService;

@RestController
@RequestMapping("/course")
public class CourseResource {

	@Autowired
	private CourseService courseService;

	@GetMapping
	public ResponseEntity<List<Course>> get(@RequestParam("cpf") String cpf) {
		List<Course> courses = courseService.getCoursesCpf(cpf);

		return ResponseEntity.ok().body(courses);
	}

}

