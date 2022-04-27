package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Commit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=null;
	conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
	conn.setAutoCommit(false);
	Statement stmt=conn.createStatement();
	String query1="INSERT INTO emp1(eid,firstname,lastname,age) Values(6,'Samyuktha','Bingi',21)";
	String query2="INSERT INTO emp1(eid,firstname,lastname,age) Values(7,'Manish','Bingi',18)";
	
	stmt.executeUpdate(query1);
	stmt.executeUpdate(query2);
	//conn.commit();
	System.out.println("row is inserted");
}
catch(Exception e)
{
	e.printStackTrace();
}
	}

}
