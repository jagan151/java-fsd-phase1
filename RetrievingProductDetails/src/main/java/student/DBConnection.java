package student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con=null;
	public static Connection getMyConnection() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce1","root","Dodda@1999#jmr");
		return con;
	}


}
