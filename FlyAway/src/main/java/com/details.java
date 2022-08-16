package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class details
 */
@WebServlet("/details")
public class details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Connection con=DatabaseConnection.getMyConnection();
			
			HttpSession session=request.getSession(); 
	 		PrintWriter out = response.getWriter();
	 		String flightname=(String) session.getAttribute("airline");  
			String nop=(String) session.getAttribute("nop"); 
			int n = Integer.parseInt(nop);
			String pnamef = request.getParameter("fname");
			String pnamel = request.getParameter("lname");
			String dob = request.getParameter("dob");
			String gender = request.getParameter("gender");
			String number = request.getParameter("contact");
			String mail = request.getParameter("mail");
	 		ServletContext sc = getServletContext();
	 		String source = (String)sc.getAttribute("source");
			String destination=(String)sc.getAttribute("destination"); 
			String traveldate=(String)sc.getAttribute("date"); 
			
		
			
			String str="select price from flightdetails where source='"+source+"' and destination='"+destination+"' and dt='"+traveldate+"'and flightname='"+flightname+"'";
			String price = null;
			//to execute query create object of Statement
			Statement  ps=con.createStatement();
			//get ResultSet
			ResultSet ans =ps.executeQuery(str);
			while(ans.next()) {
				price = ans.getString("price");
			}
			int p = Integer.parseInt(price);
			session.setAttribute("price", p*n);
			session.setAttribute("fname", pnamef);
			session.setAttribute("lname",pnamel);
			session.setAttribute("s", source);
			session.setAttribute("d", destination);
			session.setAttribute("date", traveldate);
			session.setAttribute("rate", price);
			session.setAttribute("n", nop);
			session.setAttribute("t", p*n);
			RequestDispatcher rd = request.getRequestDispatcher("payment.jsp");
			rd.forward(request, response);
			
		} catch (Exception e){
		}
		}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
