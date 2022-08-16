package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class getdata
 */
@WebServlet("/getdata")
public class getdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getdata() {
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
	 		
	 		String source=request.getParameter("source");  
			String destination=request.getParameter("destination"); 
			String traveldate=request.getParameter("date");  
			String str="select * from flightdetails where source='"+source+"' and destination='"+destination+"' and dt='"+traveldate+"'";
			
			//to execute query create object of Statement
			Statement  ps=con.createStatement();
			//get ResultSet
			ResultSet ans =ps.executeQuery(str);
			HashMap<String, String> map = new HashMap<>();
			while(ans.next()) {
				map.put(ans.getString("flightname"),ans.getString("price"));
				
					
			}
					session.setAttribute("details", map);
			
			
			ServletContext servletcontext = getServletContext();
			servletcontext.setAttribute("source", source);
			servletcontext.setAttribute("destination", destination);
			servletcontext.setAttribute("date", traveldate);
			servletcontext.setAttribute("a", map);
			//session.setAttribute("date", ans.getInt("price"));
			if(map.isEmpty()) {
				out.println("No flights found!");
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("showdetails.jsp");
				rd.forward(request, response);
			}

			
				}catch(Exception e) {
					e.printStackTrace();
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
