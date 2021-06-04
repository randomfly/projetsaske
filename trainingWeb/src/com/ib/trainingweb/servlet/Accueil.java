package com.ib.trainingweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Accueil
 */
@WebServlet({ "/accueil", "/accueilBis" })
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Accueil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recuperation du dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/accueil.jsp");

		Cookie cookie = new Cookie("cookieBiblio", "maValdecookie");
		response.addCookie(cookie);

		// passage du modele a la jsp
		request.setAttribute("modele", request.getRemoteAddr() + request.getServerName());
		request.getSession().setAttribute("modele", "mon modele");

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);

//		// on set le type mime de la reponse
//		response.setContentType("text/html");
//
//		// recuperation du buffer de sortie
//		PrintWriter out = response.getWriter();
//
//		out.append("<html><head></head><body>coucou ma servlet " + new Date() + "</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
