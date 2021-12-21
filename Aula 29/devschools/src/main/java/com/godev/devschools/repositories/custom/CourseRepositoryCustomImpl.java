package com.godev.devschools.repositories.custom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.godev.devschools.domain.Course;
import com.godev.devschools.domain.QCourse;
import com.godev.devschools.domain.QStudent;
import com.godev.devschools.domain.QStudentCourses;
import com.godev.devschools.domain.Student;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class CourseRepositoryCustomImpl implements CourseRepositoryCustom {

	public static final QStudent Q_STUDENT = QStudent.student;
	public static final QCourse Q_COURSE = QCourse.course;

	@PersistenceContext
	private EntityManager entityManager;

	private JPAQueryFactory _buildQueryFactory() {
		JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);

		return queryFactory;
	}

	@Override
	public List<Course> getCoursesByCpfStudent(String cpf) {
		QStudent student = QStudent.student;
		QCourse courses = QCourse.course;
		QStudentCourses sc = QStudentCourses.studentCourses;

		Student s = _buildQueryFactory().selectFrom(student).where(student.cpf.eq(cpf)).fetchOne();

		List<Course> c = _buildQueryFactory().selectFrom(courses).innerJoin(sc.id.student, student)
				.on(student.cpf.eq(s.getCpf())).fetch();

		return c;

	}

}
