package com.ib.trainingcommon.dao;

import java.util.Date;
import java.util.List;

import com.ib.trainingcommon.bo.Course;

public class CourseBouchonDAO implements ICourseDAO {

	private List<Course> courses;

	@Override
	public List<Course> findAll() {
		// List<Course> courses = new ArrayList<Course>();

		// bouchon
		Course livre = new Course(999, "125fdg566", "java for ever de la classe CourseBouchonDAO", new Date());
		courses.add(livre);
		livre = new Course(999, "456fdg566", "javabien car java bean de la classe CourseBouchonDAO", new Date());
		courses.add(livre);

		return courses;
	}

	@Override
	public void delete(Course livre) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Course livre) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Course livre) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


}
