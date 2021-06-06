package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.Grade;

public interface IGradeDAO {

	List<Grade> findAll();

	void delete(Grade grade);

	void update(Grade grade);

	void save(Grade grade);

	Grade get(Integer id);

}