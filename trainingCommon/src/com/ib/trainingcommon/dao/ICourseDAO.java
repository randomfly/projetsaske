package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.Course;

public interface ICourseDAO {

	List<Course> findAll();

	void delete(Course course);

	void update(Course course);

	void save(Course course);

	Course get(Integer id);

}
