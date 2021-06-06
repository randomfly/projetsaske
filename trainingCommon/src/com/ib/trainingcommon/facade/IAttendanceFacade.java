package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Attendance;

public interface IAttendanceFacade {

	List<Attendance> findAll();

	void delete(Attendance attendance);

	void update(Attendance attendance);

	void save(Attendance attendance);

	Attendance get(Integer id);

}