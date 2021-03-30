package com.factory.samples.edu.monolithic.service;

import java.util.List;

import com.factory.samples.edu.monolithic.domain.model.Attendance;
import com.factory.samples.edu.monolithic.domain.model.Course;
import com.factory.samples.edu.monolithic.domain.model.Subject;

public interface CourseService {
	List<Course> selectAllCourse();
	Course selectCourseById(Long id);
	List<Subject> selectAllSubjectByCourseId(Long id);
	List<Attendance> selectAllAttendanceByCourseId(Long id);
}
