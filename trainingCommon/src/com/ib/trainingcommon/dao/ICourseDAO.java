package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.Course;

public interface ICourseDAO {

	List<Course> findAll();

	void delete(Course course);

	void update(Course course);

	void save(Course livre);

	Course get(Integer id);

}
