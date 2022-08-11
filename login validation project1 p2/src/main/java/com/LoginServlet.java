package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter  out= response.getWriter();
		response.setContentType("text/html");
		
		String email =request.getParameter("userid");
		String password =request.getParameter("pass");
		
		//add  user in the session once the login is done
		if(email.equalsIgnoreCase("jagan@gmail.com") && password.equalsIgnoreCase("djmr@123")) {
            
            HttpSession session=request.getSession();
            session.setAttribute("email", email);
            session.setAttribute("pass", password);
            response.sendRedirect("dashboard");
        }
	
        else {
            response.sendRedirect("index.html");
        }
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
