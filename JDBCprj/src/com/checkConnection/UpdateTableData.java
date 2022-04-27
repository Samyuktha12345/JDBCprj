package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = null;
	conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
	Statement stmt = conn.createStatement();
	String sql = "Update emp1  SET firstname = 'Bingi' where eid = 2";
	sql = "Update emp1 SET lastname='Sam' where eid = 2";
	stmt.executeUpdate(sql);
	System.out.println("Values are updated..");
}
catch(Exception e) {
	e.printStackTrace();
}
	}

}
