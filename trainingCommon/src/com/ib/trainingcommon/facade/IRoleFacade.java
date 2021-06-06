package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Role;

public interface IRoleFacade {

	List<Role> findAll();

	void delete(Role role);

	void update(Role role);

	void save(Role role);

	Role get(Integer id);

}