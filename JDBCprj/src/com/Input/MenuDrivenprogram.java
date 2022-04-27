package com.Input;

import java.sql.*;
import java.util.Scanner;
public class MenuDrivenprogram {
	String learner;
	public static void main(String[] args) {
		int id;
		String name;
		String course;
		String city;
		int age;
		String sql;
		PreparedStatement stmt=null;
		Statement st=null;
		Connection conn=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:/dbmenudriven","root","root");
			System.out.println("Database is connected !");
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		while(true)
		{
		
		System.out.println("Enter an option");
		 
		System.out.println("1.Insert records");
		System.out.println("2.Delete records");
		System.out.println("3.Update record");
		System.out.println("4.Dispaly");
		System.out.println("5.Search element by id");
		System.out.println("6.commit/rollback");
		System.out.println("7.Exit");
		System.out.println("****");
		 
		
		int ch;
		ch=sc.nextInt();
		
		switch(ch) 
		{
		case 1:
			try {
				 
				System.out.println("Enter learner id: ");
				id=sc.nextInt();
				System.out.println("Enter learner name: ");
				name=sc.next();
				System.out.println("Enter learner course: ");
				course=sc.next();
				System.out.println("Enter learner city: ");
				city=sc.next();
				System.out.println("Enter learner age: ");
				age=sc.nextInt();
				stmt=conn.prepareStatement("INSERT INTO LEARNER VALUES(?,?,?,?,?)");
				 
				 stmt.setInt(1,id);		
				 stmt.setString(2,name);
			     stmt.setString(3,course);
			     stmt.setString(4, city);
			     stmt.setInt(5,22);
			     int i=stmt.executeUpdate();
			     System.out.println(i+ "records inserted");
			}
			catch(Exception e)
			{
			 e.printStackTrace();
			}
			break;
			
		case 2:
			try {
				System.out.println("Enter id:");
				id=sc.nextInt();
				stmt=conn.prepareStatement("Delete from learner WHERE lid=?");
				stmt.setInt(1, id);
				 
				int i=stmt.executeUpdate();
				System.out.println("*********");
				System.out.println(i+" record is deleted");
				System.out.println("*********");
			}
			catch(Exception e)
			{
			 e.printStackTrace();
			}
			break;
		case 3:
			
			try {
				System.out.println("Enter learner city you want to update: ");
				city=sc.next();
				System.out.println("Enter the name where you want to update: ");
				name=sc.next();
				stmt=conn.prepareStatement("UPDATE LEARNER SET lcity=? WHERE lname=?");
				stmt.setString(1,city);
				stmt.setString(2,name);
			      int i=stmt.executeUpdate();
			      System.out.println("*********");
			      System.out.println(i+" record is updated.....");
			      System.out.println("*********");
			}
			catch(Exception e)
			{
			 e.printStackTrace();
			}
			break;
		 
		case 4:
			try {
				stmt=conn.prepareStatement("select * from learner");
				rs=stmt.executeQuery( );
				while(rs.next()) {
					System.out.println("*********************************");
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
					System.out.println("*********************************");
					
			}}
				catch(Exception e)
				{
				 e.printStackTrace();
				}
				break;
		case 5:	
			try {
				System.out.println("Enter learner id:");
				sc.nextInt();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			}
			
		}
		}

	}
