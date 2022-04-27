package com.checkConnection;
import java.sql.Connection;
import java.sql.DriverManager;
public class CheckConnection {
public static void main(String[]args)
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
		System.out.print("Database is Connected!");
		conn.close();
	}
	catch(Exception e) {
		System.out.print("Do not connect to DB - Error:"+e);
	}
}
}
