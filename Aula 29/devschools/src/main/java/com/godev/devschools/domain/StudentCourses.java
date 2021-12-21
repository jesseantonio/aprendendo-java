package com.godev.devschools.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "StudentCourses")
@Entity(name = "studentCourses")
public class StudentCourses implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@EmbeddedId
	private StudentCoursesId id = new StudentCoursesId();

	private boolean valor;

	@JsonIgnore
	public Student getStudent() {
		return id.getStudent();
	}

	@JsonIgnore
	public Course getCourse() {
		return id.getCourse();
	}

	public StudentCoursesId getId() {
		return id;
	}

	public void setId(StudentCoursesId id) {
		this.id = id;
	}

	public boolean isValor() {
		return valor;
	}

	public void setValor(boolean valor) {
		this.valor = valor;
	}

}
