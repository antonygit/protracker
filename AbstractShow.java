package com.java.allocation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;

public class AbstractShow extends HttpServlet 
{
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String roll=request.getParameter("roll");
				
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();    
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/ajax","root","123456"); 
		
		
		PreparedStatement stm=con.prepareStatement("select * from student_basic");
		ResultSet rs=stm.executeQuery();
		while(rs.next())
		{
			String temp=rs.getString(1);
			if(temp.equals(roll))
			{
	        out.print(rs.getString(6));		
			break;
		   }
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		out.close(); 
		 
	 
	}

}
