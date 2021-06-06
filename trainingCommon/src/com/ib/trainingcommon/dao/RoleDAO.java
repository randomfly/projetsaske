/**
 * 
 */
package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.Role;

/**
 * @author YH
 *
 */
public class RoleDAO implements IRoleDAO {
	
	public RoleDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Role> findAll() {
		List<Role> Roles = null;

		// recuperation des infos en bdd
		//roles = em.createQuery("from Role").getResultList();

		return Roles;
	}

	@Override
	public void delete(Role role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub

	}

	@Override
	public Role get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
