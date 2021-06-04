package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.User;
import com.ib.trainingcommon.dao.IUtilisateurDAO;

public class UtilisateurFacade implements IUtilisateurFacade {

	// private IUtilisateurDAO utilisateurDAO = new UtilisateurBouchonDAO();
	// private IUtilisateurDAO utilisateurDAO = new
	// Fabrique().get("utilisateurBouchonDAO");
	private IUtilisateurDAO utilisateurDAO = null;

	public UtilisateurFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		List<User> utilisateurs = null;

		// appel à la couche DAO
		utilisateurs = utilisateurDAO.findAll();

		return utilisateurs;
	}

	public void save(User utilisateur) {
		utilisateurDAO.save(utilisateur);
	}

	/**
	 * @return the utilisateurDAO
	 */
	public IUtilisateurDAO getUtilisateurDAO() {
		return utilisateurDAO;
	}

	/**
	 * @param utilisateurDAO the utilisateurDAO to set
	 */
	public void setUtilisateurDAO(IUtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}

}
