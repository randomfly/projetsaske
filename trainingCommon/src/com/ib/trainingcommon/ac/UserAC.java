/**
 * 
 */
package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.User;
import com.ib.trainingcommon.facade.IUserFacade;

/**
 * @author ib
 *
 */
public class UserAC implements IUserAC {

	private IUserFacade userFacade = null;

	public IUserFacade getUserFacade() {
		return userFacade;
	}

	public UserAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		List<User> Utilisateurs = null;

		// appel à la couche Facade
		Utilisateurs = userFacade.findAll();

		return Utilisateurs;
	}

	@Override
	public void save(User utilisateur) {
		if (!utilisateur.getPassword().isEmpty()) {
			userFacade.save(utilisateur);
		}
	}

	/**
	 * @return the userFacade
	 */
	public IUserFacade getUtilisateurFacade() {
		return userFacade;
	}

	/**
	 * @param userFacade the userFacade to set
	 */
	public void setUserFacade(IUserFacade userFacade) {
		this.userFacade = userFacade;
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
