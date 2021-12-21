package com.godev.devschools.repositories.custom;

import java.util.List;

import com.godev.devschools.domain.Course;

public interface CourseRepositoryCustom {

	List<Course> getCoursesByCpfStudent(String cpf);

}
