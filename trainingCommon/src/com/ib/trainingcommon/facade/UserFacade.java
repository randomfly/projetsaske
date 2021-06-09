package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.User;
import com.ib.trainingcommon.dao.IUserDAO;

public class UserFacade implements IUserFacade {

	// private IUserDAO userDAO = new UserBouchonDAO();
	// private IUserDAO userDAO = new
	// Fabrique().get("utilisateurBouchonDAO");
	private IUserDAO userDAO = null;

	public UserFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		List<User> utilisateurs = null;

		// appel à la couche DAO
		utilisateurs = userDAO.findAll();

		return utilisateurs;
	}

	public void save(User utilisateur) {
		userDAO.save(utilisateur);
	}

	/**
	 * @return the userDAO
	 */
	public IUserDAO getUserDAO() {
		return userDAO;
	}

	/**
	 * @param userDAO the userDAO to set
	 */
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
