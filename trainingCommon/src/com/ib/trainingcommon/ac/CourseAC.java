/**
 * 
 */
package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.Course;
import com.ib.trainingcommon.facade.ICourseFacade;

/**
 * @author ib
 *
 */
public class CourseAC implements ICourseAC {

	private ICourseFacade courseFacade = null;

	public CourseAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Course> findAll() {
		List<Course> courses = null;

		// appel à la couche Facade
		courses = courseFacade.findAll();

//		for (Course livre : livres) {
//			livre.setTitre(livre.getTitre() + " modif couche AC");
//		}
		// exxpression lambda
		courses.forEach(course -> {
			course.setTitre(course.getTitre() + " modif couche AC");
		});

		return courses;
	}

	@Override
	public void delete(Course course) {
		courseFacade.delete(course);

	}

	@Override
	public void update(Course course) {
		courseFacade.update(course);

	}

	@Override
	public void save(Course course) {
		courseFacade.save(course);

	}

	@Override
	public Course get(Integer id) {
		Course course = courseFacade.get(id);
		return course;
	}

	public ICourseFacade getCourseFacade() {
		return courseFacade;
	}

	public void setCourseFacade(ICourseFacade courseFacade) {
		this.courseFacade = courseFacade;
	}



}
