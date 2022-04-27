package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			Statement stmt = conn.createStatement();
		String sql = "select firstname from emp1 order by firstname asc";
		stmt.executeQuery(sql);
		System.out.println("values are ascending order");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
