package com.godev.devschools.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudentCourses is a Querydsl query type for StudentCourses
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudentCourses extends EntityPathBase<StudentCourses> {

    private static final long serialVersionUID = 2034430737L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudentCourses studentCourses = new QStudentCourses("studentCourses");

    public final QStudentCoursesId id;

    public final BooleanPath valor = createBoolean("valor");

    public QStudentCourses(String variable) {
        this(StudentCourses.class, forVariable(variable), INITS);
    }

    public QStudentCourses(Path<? extends StudentCourses> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudentCourses(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudentCourses(PathMetadata metadata, PathInits inits) {
        this(StudentCourses.class, metadata, inits);
    }

    public QStudentCourses(Class<? extends StudentCourses> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QStudentCoursesId(forProperty("id"), inits.get("id")) : null;
    }

}

