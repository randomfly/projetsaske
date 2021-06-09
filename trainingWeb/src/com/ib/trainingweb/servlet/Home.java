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
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUtilisateurAC userAC;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, getServletContext());
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the dispatcher and forward it in the response
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/home.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/home.jsp");
		// recuperate the parameters from the signup form
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String fullname = request.getParameter("fullname");

		
		
		User user = new User(null, fullname, "", login, password);
		userAC.save(user);
		System.out.println("blob");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @param userAC the userAC to set
	 */
	@Autowired
	public void setUtilisateurAC(IUtilisateurAC userAC) {
		this.userAC = userAC;
	}
}
