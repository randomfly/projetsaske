package com.ib.trainingcommon.facade;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ib.trainingcommon.bo.Course;
import com.ib.trainingcommon.dao.ICourseDAO;

public class CourseFacade implements ICourseFacade {
	private static final Logger logger = LogManager.getLogger(CourseFacade.class);
	private ICourseDAO courseDAO = null;

	public CourseFacade() {
		super();
	}

	@PostConstruct
	public void avantCreationBean() {
		logger.debug("!!!!!!!!!!!!!!!!!!!!!!!!! apres Creation du Bean CourseFacade");
	}

	@Override
	public List<Course> findAll() {
		List<Course> courses = null;

		// appel à la couche DAO
		courses = courseDAO.findAll();

		return courses;
	}

	@Override
	public void delete(Course course) {
		courseDAO.delete(course);

	}

	@Override
	public void update(Course course) {
		courseDAO.update(course);

	}

	@Override
	public void save(Course course) {
		courseDAO.save(course);

	}

	@Override
	public Course get(Integer id) {
		Course course = courseDAO.get(id);
		return course;
	}

	/**
	 * @return the courseDAO
	 */
	public ICourseDAO getCourseDAO() {
		return courseDAO;
	}

	/**
	 * @param courseDAO the courseDAO to set
	 */
	public void setCourseDAO(ICourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}

}
