package com.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	
@Override	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String phone=req.getParameter("phone");
		String address=req.getParameter("address");


		
	try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String sql="insert into registration (email, password, name, phone, address)" + "values(?,?,?,?,?)";

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/signup_db","root","root");
			// pstmt -contains compiled query
						PreparedStatement pstmt=con.prepareStatement(sql);
						
						//setting values inside the place holders
						pstmt.setString(1, email);
						pstmt.setString(2, password);
						pstmt.setString(3, name);					
						pstmt.setString(4, phone);
						pstmt.setString(5, address);	
						
						
				
					
						//fire the query!!!
						pstmt.executeUpdate();
						
					
						
					}catch (Exception e) {
						
						e.printStackTrace();

		}
		
		
		Registration registration= new Registration(email, password, name, phone,address);
		
		req.setAttribute("data", registration);
		req.getRequestDispatcher("registrationReview.jsp").forward(req, resp);
	}
}