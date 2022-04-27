package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = null;
	conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
	Statement stmt = conn.createStatement();
	String sql = "delete from emp1 where eid=2";
	stmt.executeUpdate(sql);
	System.out.println("values are deleted...");
}
catch(Exception e){
	e.printStackTrace();
}
	}

}
