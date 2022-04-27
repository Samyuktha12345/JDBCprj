package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			PreparedStatement ps = conn.prepareStatement("select *from emp1 firstname");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("firstname: "+rs.getString(2));
			}
					}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
