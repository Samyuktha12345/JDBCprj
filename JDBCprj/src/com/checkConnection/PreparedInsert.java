package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
		PreparedStatement ps= conn.prepareStatement("insert into emp1 values(?,?,?,?)");
		ps.setInt(1,3);
		ps.setString(2,"Samyu");
		ps.setString(3,"Bingi");
		ps.setInt(4,21);
		int i = ps.executeUpdate();
		
		System.out.println("i+ records inserted");
				conn.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}
