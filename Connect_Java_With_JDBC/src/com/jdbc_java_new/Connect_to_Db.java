package com.jdbc_java_new;

import java.sql.*;

public class Connect_to_Db {
	
	public static void main(String[] args) throws Exception {
			
		String url="jdbc:mysql://localhost:3306/ ";
		String uname="root";
		String pass="root";
		
		String query=""
		
		Connection con=DriverManager.getConnection("url","uname","pass");
		
		Statement st=con.createStatement();
		
		
	}	
}
