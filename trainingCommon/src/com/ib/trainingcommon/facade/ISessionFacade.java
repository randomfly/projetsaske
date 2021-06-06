package com.ib.trainingcommon.facade;

import java.util.List;

import com.ib.trainingcommon.bo.Session;

public interface ISessionFacade {

	List<Session> findAll();

	void delete(Session session);

	void update(Session session);

	void save(Session session);

	Session get(Integer id);

}