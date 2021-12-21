package com.godev.devschools.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudentCoursesId is a Querydsl query type for StudentCoursesId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStudentCoursesId extends BeanPath<StudentCoursesId> {

    private static final long serialVersionUID = 877820940L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudentCoursesId studentCoursesId = new QStudentCoursesId("studentCoursesId");

    public final QCourse course;

    public final QStudent student;

    public QStudentCoursesId(String variable) {
        this(StudentCoursesId.class, forVariable(variable), INITS);
    }

    public QStudentCoursesId(Path<? extends StudentCoursesId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudentCoursesId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudentCoursesId(PathMetadata metadata, PathInits inits) {
        this(StudentCoursesId.class, metadata, inits);
    }

    public QStudentCoursesId(Class<? extends StudentCoursesId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.course = inits.isInitialized("course") ? new QCourse(forProperty("course"), inits.get("course")) : null;
        this.student = inits.isInitialized("student") ? new QStudent(forProperty("student")) : null;
    }

}

