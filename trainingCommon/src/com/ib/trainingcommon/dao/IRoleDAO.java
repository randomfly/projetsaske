package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.Role;

public interface IRoleDAO {

	List<Role> findAll();

	void delete(Role role);

	void update(Role role);

	void save(Role role);

	Role get(Integer id);

}