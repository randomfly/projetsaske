/**
 * 
 */
package com.ib.trainingcommon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ib.trainingcommon.bo.Grade;

/**
 * @author YH
 *
 */
public class GradeDAO implements IGradeDAO  {

	@Override
	public List<Grade> findAll() {
		List<Grade> Grades = new ArrayList<Grade>();

		Grade grade = new Grade(99, 1, 1, 7);
		grade.add(grade);

		return Grades;
	}

	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Grade grade) {
		// TODO Auto-generated method stub

	}

	@Override
	public Grade get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
