/**
 * 
 */
package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Grade;
import com.ib.trainingcommon.dao.IGradeDAO;

/**
 * @author YH
 *
 */
public class GradeFacade implements IGradeFacade  {
	
	private IGradeDAO gradeDAO = null;

	/**
	 * 
	 */
	public GradeFacade() {
		super();
		// TODO Auto-generated constructor stub
	}



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
