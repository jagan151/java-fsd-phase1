package student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewRecordsServlet
 */
@WebServlet("/ViewRecordsServlet")
public class ViewRecordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewRecordsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Connection con= DBConnection.getMyConnection();
			String str="select * from eproduct";
			Statement s = con.createStatement();
			ResultSet ans= s.executeQuery(str);
			PrintWriter out=response.getWriter();
			out.println("<table border=2>");
			out.println("<tr><th>name</th><th>price</th><th>date_added</th></tr>");
			//To read values from ResultSet
			while(ans.next()) {
				out.println("<tr>");
				out.print("<td>"+ans.getString("name")+"</td>");
				out.print("<td>"+ans.getBigDecimal("price")+"</td>");
				out.print("<td>"+ans.getInt("date_added")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();

}
	}
}