package com.godev.devschools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godev.devschools.domain.Course;
import com.godev.devschools.repositories.custom.CourseRepositoryCustom;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

}
