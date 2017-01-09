package com.java.allocation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;

public class DeleteApproval extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String roll=request.getParameter("roll");
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/ajax","root","123456"); 
		PreparedStatement stm=con.prepareStatement("delete from student_basic where roll=?");
		stm.setString(1,roll);
		int i=stm.executeUpdate();
		if(i>0)
		{
		out.print("Deleted..");
		}
		else
			out.print("Error..");

			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		out.close(); 
		 
	 
	}

}
