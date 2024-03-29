package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class airlinevalid
 */
@WebServlet("/airlinevalid")
public class airlinevalid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public airlinevalid() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(); 
 		PrintWriter out = response.getWriter();
 		ServletContext sc = getServletContext();
 		HashMap<String, String> f = (HashMap<String ,String>)sc.getAttribute("a");
 		String airline=request.getParameter("airline"); 
 		int flag=0;
 		for (Map.Entry<String,String> mapElement : f.entrySet()) {
            String key = mapElement.getKey();
            if(key.equalsIgnoreCase(airline)) {
            	RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
     			rd.forward(request, response);
     			flag=1;
     			break;
            }
            else {
            	flag=0;
            }
            	
// 			RequestDispatcher rd = request.getRequestDispatcher("showdetails.jsp");
// 			rd.forward(request, response);
 		}
 		if(flag==0) {
 			out.println("No airlines found!");
 		}
// 		out.println(f);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
