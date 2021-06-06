package com.ib.trainingcommon.ac;

import java.util.List;

import com.ib.trainingcommon.bo.Role;

public interface IRoleAC {

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : RoleDaoBouchon for more info
	 */

	List<Role> findAll();

	void delete(Role role);

	void update(Role role);

	void save(Role role);

	Role get(Integer id);

}