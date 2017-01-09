package faculty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;

 
public class FacultyShow extends HttpServlet {
 
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();    
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/ajax","root","123456"); 
		
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from staffs");
		while(rs.next())
		{
			
	      out.print("."+rs.getString(1)+"<br>");		
			
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		out.close(); 
		 
	}

}
