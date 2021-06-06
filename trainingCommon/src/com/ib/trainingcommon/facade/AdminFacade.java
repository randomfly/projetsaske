/**
 * 
 */
package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Admin;
import com.ib.trainingcommon.dao.IAdminDAO;

/**
 * @author YH
 *
 */
public class AdminFacade implements IAdminFacade {
	
	private IAdminDAO adminDAO = null;

	/**
	 * 
	 */
	public AdminFacade() {
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
