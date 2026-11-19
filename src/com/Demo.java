package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Demo {

	
	public static void main(String[] args)
	{
		
//		int id = 102;
//		
//		String Name = "Rohit";
//		
//		float marks = 69.90f;
		
		
		
		
		Student s1 = new Student();
		
		s1.setId(12);
		s1.setName("Chaithanya");
		s1.setMarks(88.89f);
		
		Student s2 = new Student();
		
		s2.setId(13);
		s2.setName("Pooja");
		s2.setMarks(65.65f);
		
		Student s3 = new Student();
		
		s3.setId(14);
		s3.setName("Sakshi");
		s3.setMarks(69.60f);
		
		Student s4 = new Student();
		
		s4.setId(15);
		s4.setName("Pragati");
		s4.setMarks(89.60f);
		
		Student s5  = new Student();
		
		s5.setId(16);
		s5.setName("Trupti");
		s5.setMarks(76.76f);
		
		ArrayList<Student> std = new ArrayList<>();
		
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		
			
		try
		{
			
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
	     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gemini","root","12345");
	     
	     Statement st=  con.createStatement();
	      
//	     st.execute("create database Gemini");
	     
//	     st.execute("create table Employee(id int ,name varchar(45),Salary float)");
	     
	     
	   /*  for(Student ss : std) {
	    	 
	     st.execute("insert into student values ('"+ss.getId()+"','"+ss.getName()+"','" +ss.getMarks()+ "' )");
	     
	     } */
	     
//	     st.execute("update student set Name = 'Suddhamm' where id= 102");
	     
	     
//	     st.execute("delete from student where id=3");
	     
	     
//	     System.out.println(" Data Deleted...SucessFully...");

	     
	     ResultSet rs =   st.executeQuery("select * from Student");
	     
//	     While Loop
//	     For Loop
//	     
//	     while(rs.next())
//	     {
//	    	 
//	    	 
//	    	int Id = rs.getInt("Id");
//	    	 
//	    	String Name = rs.getString("Name");
//	    	 
//	    	float Marks = rs.getFloat("Marks");
//	    	
//	    	System.out.println("Id    : "+Id);
//	    	
//	    	System.out.println("Name  : "+Name);
//	    	
//	    	System.out.println("Marks : "+Marks);
//	    	
//	    	System.out.println("*************************");
//	     }
//	     
	     
	    		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
