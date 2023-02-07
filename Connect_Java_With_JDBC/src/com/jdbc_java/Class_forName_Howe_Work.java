package com.jdbc_java;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Class_forName_Howe_Work {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
				
		Pqr pqr=new Pqr();
	
		//for static and instanse method call
				
		//Class.forName("Pqr").newInstance();
		
		//for load Driver in other method
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	
	}
}

class Pqr{
	
	static{
		System.out.println("This is Static block");
	}
	
	{
		System.out.println("this is instanse block");
	}
}
