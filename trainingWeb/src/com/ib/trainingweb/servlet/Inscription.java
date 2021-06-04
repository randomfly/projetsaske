package com.ib.trainingweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ib.trainingcommon.ac.IUtilisateurAC;
import com.ib.trainingcommon.bo.User;

/**
 * Servlet implementation class Accueil
 */
@WebServlet({ "/inscription" })
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUtilisateurAC utilisateurAC;

	/**
	 * Default constructor.
	 */
	public Inscription() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, getServletContext());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recuperation du dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/inscription.jsp");

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String erreur = "";
		// recuperation du dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/inscriptionOk.jsp");

		// recuperation du nom
		String nom = request.getParameter("nom");
		// recuperation du prenom
		String prenom = request.getParameter("prenom");
		// recuperation du prenom
		String password = request.getParameter("password");

		// controle des champs du formulaire
		if (nom == null || nom.isEmpty()) {
			// champ nom obligatoire
			erreur += "champ nom obligatoire<br />";

		}
		if (prenom == null || prenom.isEmpty()) {
			// champ nom obligatoire
			erreur += "champ prenom obligatoire<br />";
		}

		String login = prenom.substring(0, 1) + nom; // initiale du prenom et nom
		// creation de l utilisateur
		User utilisateur = new User(null, nom, prenom, login, password);

		if (!erreur.isEmpty()) {
			// on place l erreur dans la request
			request.setAttribute("erreur", erreur);
			// on a une erreur
			requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/inscription.jsp");
		} else {
			// sauvegarde de l'utlisateur
			utilisateurAC.save(utilisateur);
		}

		// utilisateurAC.save(utilisateur);
		// passage des infos dans la session
		request.getSession().setAttribute("utilisateur", utilisateur);
		/*
		 * request.getSession().setAttribute("nom", nom);
		 * request.getSession().setAttribute("prenom", prenom);
		 */

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);
	}

	/**
	 * @return the utilisateurAC
	 */
	public IUtilisateurAC getUtilisateurAC() {
		return utilisateurAC;
	}

	/**
	 * @param utilisateurAC the utilisateurAC to set
	 */
	@Autowired
	public void setUtilisateurAC(IUtilisateurAC utilisateurAC) {
		this.utilisateurAC = utilisateurAC;
	}

}
