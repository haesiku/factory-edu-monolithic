package com.factory.samples.edu.monolithic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factory.samples.edu.monolithic.domain.model.Attendance;
import com.factory.samples.edu.monolithic.domain.model.Course;
import com.factory.samples.edu.monolithic.domain.model.Subject;
import com.factory.samples.edu.monolithic.domain.repository.CourseRepository;
import com.factory.samples.edu.monolithic.service.CourseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
	private final CourseRepository courseRepository;

	@Override
	public List<Course> selectAllCourse() {
		return courseRepository.selectAllCourse();
	}

	@Override
	public Course selectCourseById(Long id) {
		return courseRepository.selectCourseById(id);
	}

	@Override
	public List<Subject> selectAllSubjectByCourseId(Long id) {
		return courseRepository.selectAllSubjectByCourseId(id);
	}

	@Override
	public List<Attendance> selectAllAttendanceByCourseId(Long id) {
		return courseRepository.selectAllAttendanceByCourseId(id);
	}

}
