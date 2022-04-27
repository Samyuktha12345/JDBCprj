package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PreparedUpdate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			PreparedStatement ps = conn.prepareStatement("Update emp1 SET age = 20 where eid=4");
			int i=ps.executeUpdate();
			System.out.println("records are Updated"+i);
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
