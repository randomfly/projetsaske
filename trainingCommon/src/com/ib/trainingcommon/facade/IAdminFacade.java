package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Admin;

public interface IAdminFacade {

	List<Admin> findAll();

	void delete(Admin admin);

	void update(Admin admin);

	void save(Admin admin);

	Admin get(Integer id);

}