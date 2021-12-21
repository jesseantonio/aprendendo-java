package com.godev.devschools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godev.devschools.domain.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
