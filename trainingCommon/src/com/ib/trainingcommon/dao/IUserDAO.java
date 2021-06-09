package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.User;

public interface IUserDAO {

	List<User> findAll();

	void save(User utilisateur);

}
