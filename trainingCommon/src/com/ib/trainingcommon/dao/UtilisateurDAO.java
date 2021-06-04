package com.ib.trainingcommon.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.ib.trainingcommon.bo.Role;
import com.ib.trainingcommon.bo.User;

public class UtilisateurDAO extends AbstractDAO implements IUtilisateurDAO {

	public UtilisateurDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		List<User> utilisateurs = null;

		// implementation avec hibernate/JPA
		// recuperation des utilisateurs en BD (SELECT)
		utilisateurs = em.createQuery("from Utilisateur").getResultList();

		return utilisateurs;
	}

	@Override
	public void save(User utilisateur) {
		/*
		 * Role role = new Role(); role.setNom("utilisateur");
		 * utilisateur.getRoles().add(role);
		 */

		Role role = getRole("utilisateur");
		if (role != null) {
			utilisateur.getRoles().add(role);
		}

		em.persist(utilisateur);
	}

	/**
	 * recuperation d un role a partir de son nom
	 * 
	 * @param nom
	 * @return
	 */
	public Role getRole(String nom) {
		Role role = null;
		CriteriaBuilder builder = getEm().getCriteriaBuilder();

		// creation de la requete
		CriteriaQuery<Role> criteria = builder.createQuery(Role.class);

		// on prepare la sortie
		Root<Role> root = criteria.from(Role.class);
		criteria.select(root);
		criteria.where(builder.equal(root.get("nom"), nom));

		try {
			role = getEm().createQuery(criteria).getSingleResult();

		} catch (NoResultException e) {
			// le role n'existe pas
			role = null;
		}

		return role;
	}
}
