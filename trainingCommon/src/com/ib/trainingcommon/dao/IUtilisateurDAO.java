package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.User;

public interface IUtilisateurDAO {

	List<User> findAll();

	void save(User utilisateur);

}
