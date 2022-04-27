package com.checkConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;
public class ScannerinputPreparedInsert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
		PreparedStatement stmt = conn.prepareStatement("insert into emp values(?,?,?,?)");
Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("enter eid:");
			int eid = Integer.parseInt(in.nextLine());
			System.out.print("enter firstname:");
			String firstname = in.nextLine();
			System.out.print("enter lastname:");
			String lastname = in.nextLine();
			System.out.print("enter age:");
			int age = Integer.parseInt(in.nextLine());
			stmt.setInt(1,eid);
			stmt.setString(2,firstname);
			stmt.setString(3,lastname);
			stmt.setInt(4,age);
int i = stmt.executeUpdate();
System.out.println(i + "record inserted");
System.out.println("do you want to continue yes/no");
String s = in.nextLine();
if(s.startsWith("n"))
{
	break;
}
		}while(true);
		
conn.close();
			

}}
