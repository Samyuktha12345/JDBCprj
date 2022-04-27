package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = null;
	conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
	Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("select *from emp1");
while(rs.next()) {
	//display values
	System.out.print("EID: " +rs.getInt("eid"));
	System.out.print(",Age: " +rs.getInt("age"));
	System.out.print(",First Name: " +rs.getString("firstname"));
	System.out.print(",Last Name: " +rs.getString("lastname"));
	
}

	}
catch(Exception e)
{
	e.printStackTrace();
}
	}

}
