/**
 * 
 */
package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.Admin;
import com.ib.trainingcommon.dao.AdminDAO;
import com.ib.trainingcommon.dao.IAdminDAO;

public class AdminAC implements IAdminAC {

	private IAdminDAO adminDAO = new AdminDAO();

	/**
	 * 
	 */
	public AdminAC() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<Admin> findAll() {
		List<Admin> admins = null;

		// appel ра la couche DAO
		admins = adminDAO.findAll();

		return admins;
	}

	
	@Override
	public void delete(Admin admin) {
		adminDAO.delete(admin);

	}


	@Override
	public void update(Admin admin) {
		adminDAO.update(admin);

	}


	@Override
	public void save(Admin admin) {
		adminDAO.save(admin);

	}


	@Override
	public Admin get(Integer id) {
		Admin admin = adminDAO.get(id);
		return admin;
	}

}
