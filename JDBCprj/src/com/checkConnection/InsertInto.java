package com.checkConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertInto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = null;
	conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
	Statement stmt = conn.createStatement();
	String sql = ("INSERT INTO EMP(eid,firstname,lastname,age)" + "VALUES (2,'Samyul','Bingi',21)");
	sql = ("INSERT INTO EMP(eid,firstname,lastname,age)" + "VALUES (3,'Sam','Bingi',21)");
	sql = ("INSERT INTO EMP(eid,firstname,lastname,age)" + "VALUES (1,'Samyuktha','Bingi',21)");
	stmt.executeUpdate(sql);
	System.out.println("Record is inserted in table");
	
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
