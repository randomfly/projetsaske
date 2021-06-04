package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.Course;

public class CourseDAO extends AbstractDAO implements ICourseDAO {

	public CourseDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Course> findAll() {
		List<Course> courses = null;

		// recuperation des courses en BD (SELECT)
		courses = em.createQuery("from Course").getResultList();

		return courses;
	}

	@Override
	public Course get(Integer id) {
		Course course = null;
		course = em.find(Course.class, id);
		return course;
	}

	@Override
	public void save(Course course) {
		// em.getTransaction().begin();

		em.persist(course);

		// em.getTransaction().commit();

	}

	@Override
	public void update(Course course) {
		em.merge(course);
	}

	@Override
	public void delete(Course course) {
		em.remove(em.contains(course) ? course : em.merge(course));
	}

}
