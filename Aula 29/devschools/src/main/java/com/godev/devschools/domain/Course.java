package com.godev.devschools.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "course")
@Table(name = "course")
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	private Teacher teacher;

	@JsonIgnore
	@OneToMany(mappedBy = "id.course")
	private List<StudentCourses> students = new ArrayList<StudentCourses>();

	private Double timeCourse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<StudentCourses> getStudents() {
		return students;
	}

	public void setStudents(List<StudentCourses> students) {
		this.students = students;
	}

	public Double getTimeCourse() {
		return timeCourse;
	}

	public void setTimeCourse(Double timeCourse) {
		this.timeCourse = timeCourse;
	}

}
