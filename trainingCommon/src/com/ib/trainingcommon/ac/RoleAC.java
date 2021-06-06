package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.Role;
import com.ib.trainingcommon.dao.RoleDAO;
import com.ib.trainingcommon.dao.IRoleDAO;

/**
 * @author YH
 *
 */
public class RoleAC implements IRoleAC {

	private IRoleDAO roleDAO = new RoleDAO();

	public RoleAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : RoleDaoBouchon for more info
	 */

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