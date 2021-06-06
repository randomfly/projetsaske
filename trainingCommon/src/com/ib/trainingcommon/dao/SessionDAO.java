package com.ib.trainingcommon.dao;

import java.util.List;

import com.ib.trainingcommon.bo.Session;

/**
 * @author YH
 *
 */
public class SessionDAO implements ISessionDAO {

	@Override
	public List<Session> findAll() {
		List<Session> Sessions = null;

		// Bouchon
		//Session session = new Session(1, true, "lorem", new Date(), new Date(), true);
		//session.add(session);

		return Sessions;
	}

	@Override
	public void delete(Session session) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Session session) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Session session) {
		// TODO Auto-generated method stub

	}

	@Override
	public Session get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
