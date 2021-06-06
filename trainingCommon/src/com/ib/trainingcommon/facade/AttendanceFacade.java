/**
 * 
 */
package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Attendance;
import com.ib.trainingcommon.dao.IAttendanceDAO;

/**
 * @author YH
 *
 */
public class AttendanceFacade implements IAttendanceFacade {
	
	private IAttendanceDAO attendanceDAO = null;

	/**
	 * 
	 */
	public AttendanceFacade() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public List<Attendance> findAll() {
		List<Attendance> attendances = null;

		// appel ра la couche DAO
		attendances = attendanceDAO.findAll();

		return attendances;
	}

	

	@Override
	public void delete(Attendance attendance) {
		attendanceDAO.delete(attendance);

	}



	@Override
	public void update(Attendance attendance) {
		attendanceDAO.update(attendance);

	}



	@Override
	public void save(Attendance attendance) {
		attendanceDAO.save(attendance);

	}



	@Override
	public Attendance get(Integer id) {
		Attendance attendance = attendanceDAO.get(id);
		return attendance;
	}

}
