package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			PreparedStatement ps = conn.prepareStatement("Delete from emp1 where eid=3");
			int i=ps.executeUpdate();
			System.out.println("records are deleted"+i);
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
