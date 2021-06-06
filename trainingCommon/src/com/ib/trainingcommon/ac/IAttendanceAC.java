package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.Attendance;

public interface IAttendanceAC {

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : AttendanceDaoBouchon for more info
	 */

	List<Attendance> findAll();

	void delete(Attendance attendance);

	void update(Attendance attendance);

	void save(Attendance attendance);

	Attendance get(Integer id);

}