package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	static Connection con1=null;
	static Connection con2=null;
	public static Connection getMyConnection() {
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.driver //com.mysql.cj.jdbc.Driver  //oracle.jdbc.driver.OracleDriver
			 
			//step2 create  the connection object 
			 
		con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","sakthi@1729");  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return con1;
		
		}

}
