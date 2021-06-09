package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.User;

public interface IUserFacade {

	List<User> findAll();

	void save(User utilisateur);

}
