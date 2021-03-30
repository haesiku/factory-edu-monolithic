package com.factory.samples.edu.monolithic.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.factory.samples.edu.monolithic.domain.model.Attendance;
import com.factory.samples.edu.monolithic.domain.model.Course;
import com.factory.samples.edu.monolithic.domain.model.Subject;

@Mapper
@Repository
public interface CourseRepository {
	List<Course> selectAllCourse();
	Course selectCourseById(Long id);
	List<Subject> selectAllSubjectByCourseId(Long id);
	List<Attendance> selectAllAttendanceByCourseId(Long id);
}