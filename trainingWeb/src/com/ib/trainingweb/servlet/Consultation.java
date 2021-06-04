package com.ib.trainingweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ib.trainingcommon.ac.ICourseAC;
import com.ib.trainingcommon.bo.Course;

/**
 * Servlet implementation class Accueil
 */
@WebServlet({ "/consultation" })
public class Consultation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(Consultation.class);

	private ICourseAC courseAC;

	/**
	 * Default constructor.
	 */
	public Consultation() {
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

		logger.debug("debut du doGet");
		logger.error("une erreur");
		// recuperation du dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/consultation.jsp");

		// partage par toutes les servlet
		getServletContext().setAttribute("monInfoPartagee", "l info");

//		if (courseAC == null) {
//			// demarrage de spring
//			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextCommon.xml");
//
//			courseAC = context.getBean("courseAC", CourseAC.class);
//		}
		// recuperation des livres
		// ICourseAC courseAC = new CourseAC();
		List<Course> courses = courseAC.findAll();

		// passage des livres dans la requete pour la view
		request.setAttribute("formations", courses);

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);

		logger.debug("fin du doGet");

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

	/**
	 * @return the courseAC
	 */
	public ICourseAC getCourseAC() {
		return courseAC;
	}

	/**
	 * @param courseAC the courseAC to set
	 */
	@Autowired
	public void setLivreAC(ICourseAC courseAC) {
		this.courseAC = courseAC;
	}

}
