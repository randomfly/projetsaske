/**
 * 
 */
package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Role;
import com.ib.trainingcommon.dao.IRoleDAO;

/**
 * @author YH
 *
 */
public class RoleFacade implements IRoleFacade {
	
	private IRoleDAO roleDAO = null;

	/**
	 * 
	 */
	public RoleFacade() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public List<Role> findAll() {
		List<Role> roles = null;

		// appel ра la couche DAO
		roles = roleDAO.findAll();

		return roles;
	}

	

	@Override
	public void delete(Role role) {
		roleDAO.delete(role);

	}



	@Override
	public void update(Role role) {
		roleDAO.update(role);

	}



	@Override
	public void save(Role role) {
		roleDAO.save(role);

	}



	@Override
	public Role get(Integer id) {
		Role role = roleDAO.get(id);
		return role;
	}

}
