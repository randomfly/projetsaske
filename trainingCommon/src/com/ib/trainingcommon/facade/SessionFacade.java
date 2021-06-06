/**
 * 
 */
package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Session;
import com.ib.trainingcommon.dao.ISessionDAO;

/**
 * @author YH
 *
 */
public class SessionFacade implements ISessionFacade  {
	
	private ISessionDAO sessionDAO = null;

	/**
	 * 
	 */
	public SessionFacade() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public List<Session> findAll() {
		List<Session> sessions = null;

		// appel ра la couche DAO
		sessions = sessionDAO.findAll();

		return sessions;
	}

	

	@Override
	public void delete(Session session) {
		sessionDAO.delete(session);

	}



	@Override
	public void update(Session session) {
		sessionDAO.update(session);

	}



	@Override
	public void save(Session session) {
		sessionDAO.save(session);

	}



	@Override
	public Session get(Integer id) {
		Session session = sessionDAO.get(id);
		return session;
	}

}
