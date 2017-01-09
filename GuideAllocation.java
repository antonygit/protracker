package com.java.allocation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;

 
public class GuideAllocation extends HttpServlet {
 
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String roll,guide;
		roll=  request.getParameter("roll");
		guide=  request.getParameter("guide");      
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/ajax","root","123456"); 
		  
		PreparedStatement ps=con.prepareStatement("update student_basic set guide=? where roll=?");
		ps.setString(1,guide);
		ps.setString(2,roll);	    
		int i=ps.executeUpdate();
		if(i>0)
		{
			out.print("Approved successfully!!");	
		}	
		else
			out.print("Error in insertion try again!!");	

				          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
	 
	}

}
