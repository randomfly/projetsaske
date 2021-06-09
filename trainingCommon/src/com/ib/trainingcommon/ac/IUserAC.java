package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.User;

public interface IUserAC {

	List<User> findAll();

	void save(User utilisateur);

	User get(Integer id);

	void update(User utilisateur);

	void delete(User utilisateur);

}