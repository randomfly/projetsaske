/**
 * 
 */
package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Course;

/**
 * @author ib
 *
 */
public interface ICourseFacade {

	List<Course> findAll();

	Course get(Integer id);

	void save(Course livre);

	void update(Course livre);

	void delete(Course livre);

}
