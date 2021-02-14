package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u=request.getParameter("uname");
		String p=request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String username="root";
			String password="Satyasri@1999";
			Connection con;
			
			 con = DriverManager.getConnection(url, username, password);
			 String sql1="select * from userlogin where uname=? and pwd=?";
			
			 PreparedStatement st=con.prepareStatement(sql1);
			 st.setString(1,u);
			 st.setString(2, p);
			
			 ResultSet r=st.executeQuery();
			// st.executeQuery();
			 String msg;
			 if(r.next())
			 {
				 Cookie ck=new Cookie("user",u);
				 response.addCookie(ck);
				response.sendRedirect("profile.jsp"); 
			 }
			 else
			 {
				 msg="invalid username";
				 out.print(msg);
				 response.sendRedirect("index.jsp?msg"+msg);
			 }
			 
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
