package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.Course;

public interface ICourseAC {

	List<Course> findAll();

	Course get(Integer id);

	void save(Course course);

	void update(Course course);

	void delete(Course course);

}