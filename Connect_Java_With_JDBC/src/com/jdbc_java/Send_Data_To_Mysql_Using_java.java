package com.jdbc_java;

import java.sql.*;

public class Send_Data_To_Mysql_Using_java {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url="jdbc:mysql://localhost:3306/java_sql_connection";
		String uname="root";
		String pass="root";

		String query = "insert into student_data value (5,'bb')";
		
	
		//Send The data using query
	
		int userid=6;
		String username="cc";
		
		String query2 = "insert into student_data value ( "+ userid+",'"+username +" ')";
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(url,uname,pass);
		
		Statement st=con.createStatement();
		
		//int count=st.executeUpdate(query);
		
		int count=st.executeUpdate(query2);
		
		System.out.println(count + "rows affected");
		
		st.close();
		
		con.close();
		
		
	}
	
}
