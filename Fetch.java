package com.java.fetch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import java.util.Arrays;


 
public class Fetch extends HttpServlet {
        
   
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String d[]=new String[3];          
	    d[0]=request.getParameter("id");
	    d[1]="arul";
	    d[2]="antonyarul9@gmail.com"; 
	    out.print(d[0]+"$");
	    out.print(d[1]+"$");
	    out.print(d[2]+"$");



	    
	  

		
		
	 
	}
}


