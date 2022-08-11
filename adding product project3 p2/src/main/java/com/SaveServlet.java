package com;

import java.io.IOException;

import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("pname");
		BigDecimal price=new BigDecimal(request.getParameter("pprice"));
		
		
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		Properties props= new Properties();
		props.load(in);
		
		Connection con=DBConfig.getConnection(props);
		
		try {
			
			
			PreparedStatement  stmt= con.prepareStatement("insert into eproduct (name,price) values (?,?)");
			
			stmt.setString(1, name);
			stmt.setBigDecimal(2, price);
			
			int x=stmt.executeUpdate();
			
			if(x>0) {
				//out.print("Data  Inserted Successfully");
				response.sendRedirect("list");
			}
				
			else {
				out.print("Error While  Inserting a Data");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
