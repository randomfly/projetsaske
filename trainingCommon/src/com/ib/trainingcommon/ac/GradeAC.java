/**
 * 
 */
package com.ib.trainingcommon.ac;


import java.util.List;

import com.ib.trainingcommon.bo.Grade;
import com.ib.trainingcommon.dao.GradeDAO;
import com.ib.trainingcommon.dao.IGradeDAO;

/**
 * @author YH
 *
 */
public class GradeAC implements IGradeAC {

	private IGradeDAO gradeDAO = new GradeDAO();

	public GradeAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : GradeDAOBouchon for more info
	 */

	@Override
	public List<Grade> findAll() {
		List<Grade> grades = null;

		// appel ра la couche DAO
		grades = gradeDAO.findAll();

		return grades;
	}

	@Override
	public void delete(Grade grade) {
		gradeDAO.delete(grade);

	}

	@Override
	public void update(Grade grade) {
		gradeDAO.update(grade);

	}

	@Override
	public void save(Grade grade) {
		gradeDAO.save(grade);

	}

	@Override
	public Grade get(Integer id) {
		Grade grade = gradeDAO.get(id);
		return grade;
	}

}
