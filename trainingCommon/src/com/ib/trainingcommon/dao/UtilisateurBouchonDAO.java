package com.ib.trainingcommon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ib.trainingcommon.bo.User;

public class UtilisateurBouchonDAO implements IUtilisateurDAO {

	public UtilisateurBouchonDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		List<User> utilisateurs = new ArrayList<User>();

		// implementation avec hibernate/JPA
		User utilisateur = new User(1, "bob", "bobi", "bbob", "password");
		utilisateurs.add(utilisateur);
		utilisateur = new User(2, "bib", "bibo", "bbob", "password");
		utilisateurs.add(utilisateur);
		return utilisateurs;
	}

	@Override
	public void save(User utilisateur) {
		System.out.println("save " + utilisateur);
	}

}
