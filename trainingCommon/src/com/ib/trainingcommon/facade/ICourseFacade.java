/**
 * 
 */
package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Course;

/**
 * @author YH
 *
 */
public interface ICourseFacade {

	List<Course> findAll();

	Course get(Integer id);

	void save(Course course);

	void update(Course course);

	void delete(Course course);

}
