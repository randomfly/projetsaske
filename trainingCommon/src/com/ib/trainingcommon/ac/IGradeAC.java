package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.Grade;

public interface IGradeAC {

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : GradeDAOBouchon for more info
	 */

	List<Grade> findAll();

	void delete(Grade grade);

	void update(Grade grade);

	void save(Grade grade);

	Grade get(Integer id);

}