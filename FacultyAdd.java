package faculty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;


public class FacultyAdd extends HttpServlet {
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String  name,email;
		name=  request.getParameter("name");
		email=  request.getParameter("email");
		boolean flag=true;
		       
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/ajax","root","123456"); 
		
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from staffs");
		while(rs.next())
		{
			if(rs.getString(1).equals(name))
			{
				out.print("Staff name is present!!$");
				flag=false;
				break;
				
			} 
		}
		if(flag)
		{
			PreparedStatement ps=con.prepareStatement("insert into staffs values(?,?)");
			ps.setString(1,name);
			ps.setString(2,email);
			int i=ps.executeUpdate();
			if(i>0)
			{
				out.print("Staff Added!!$");	
			}	
			else
				out.print("Error in insertion try again!!$");	
			
		}
		ResultSet rs1=stm.executeQuery("select * from staffs");

		while(rs1.next())
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
