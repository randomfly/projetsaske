/**
 * 
 */
package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.User;
import com.ib.trainingcommon.facade.IUtilisateurFacade;

/**
 * @author ib
 *
 */
public class UtilisateurAC implements IUtilisateurAC {

	private IUtilisateurFacade utilisateurFacade = null;

	public UtilisateurAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		List<User> Utilisateurs = null;

		// appel à la couche Facade
		Utilisateurs = utilisateurFacade.findAll();

		return Utilisateurs;
	}

	@Override
	public void save(User utilisateur) {
		if (!utilisateur.getPassword().isEmpty()) {
			utilisateurFacade.save(utilisateur);
		}
	}

	/**
	 * @return the utilisateurFacade
	 */
	public IUtilisateurFacade getUtilisateurFacade() {
		return utilisateurFacade;
	}

	/**
	 * @param utilisateurFacade the utilisateurFacade to set
	 */
	public void setUtilisateurFacade(IUtilisateurFacade utilisateurFacade) {
		this.utilisateurFacade = utilisateurFacade;
	}

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User utilisateur) {
		// TODO Auto-generated method stub

	}

}
