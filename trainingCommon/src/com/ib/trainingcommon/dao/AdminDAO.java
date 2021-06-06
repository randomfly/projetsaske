/**
 * 
 */
package com.ib.trainingcommon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ib.trainingcommon.bo.Admin;

public class AdminDAO implements IAdminDAO  {


	@Override
	public List<Admin> findAll() {
		List<Admin> Admins = new ArrayList<Admin>();

		// Bouchon
		Admin admin = new Admin(5, "admin@gmail.com", "password", "Wally", "Waba");
		admin.add(admin);

		return Admins;
	}


	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub

	}


	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub

	}


	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub

	}


	@Override
	public Admin get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}

