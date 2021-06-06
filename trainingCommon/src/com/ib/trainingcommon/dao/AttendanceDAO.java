/**
 * 
 */
package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.Attendance;

/**
 * @author YH
 *
 */
public class AttendanceDAO implements IAttendanceDAO {
	

	public AttendanceDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Attendance> findAll() {
		List<Attendance> Attendances = null;

		// recuperation des infos en bdd
		//attendances = em.createQuery("from Attendance").getResultList();

		return Attendances;
	}

	@Override
	public void delete(Attendance attendance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Attendance attendance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Attendance attendance) {
		// TODO Auto-generated method stub

	}

	@Override
	public Attendance get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}