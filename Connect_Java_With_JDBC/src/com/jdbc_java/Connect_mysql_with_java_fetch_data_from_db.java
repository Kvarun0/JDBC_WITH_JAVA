package com.jdbc_java;


import java.sql.*;


public class Connect_mysql_with_java_fetch_data_from_db {
	
	public static void main(String[] args) throws Exception{
		
		
		String url="jdbc:mysql://localhost:3306/java_sql_connection";
		String uname="root";
		String pass="root";
		
		//String query="select username from student_data where userid=2";//For fetching one value
		
		String query ="select * from student_data";//for fetching all value
		
		Class.forName("com.mysql.jdbc.Driver");		//load driver
		
		Connection con= DriverManager.getConnection(url,uname,pass) ;	//connection
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		//for first query
		//rs.next();
		//String name=rs.getString("username"); //for printing only first value
		//System.out.println(name);
		

		
		//for second query
		
		String userData=" ";
		while( rs.next()){
			userData= rs.getString(1) + " : "+ rs.getString(2);
			System.out.println(userData);
		}
		
		
		st.close();
		
		con.close();
	}
}
