package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var un=request.getParameter("uname");
		//var fn=request.getParameter("fname");
		//var ln=request.getParameter("lname");
		var pwd=request.getParameter("pwd");
		var mob=request.getParameter("mob");
		var country=request.getParameter("country");
		var age=Integer.parseInt(request.getParameter("age"));
		response.setContentType("text/html");
		PrintWriter out1=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String username="root";
			String password="Satyasri@1999";
			Connection con;
			
			 con = DriverManager.getConnection(url, username, password);
			    //System.out.println("Successfully connected");
			 String sql1="insert into userlogin values(?,?)";
			 PreparedStatement st=con.prepareStatement(sql1);
			 st.setString(1,un);
			 st.setString(2,pwd);
			 int r=st.executeUpdate();
			    String sql="insert into pharmadb values(?,?,?,?)";
			    //insert employee record into database
			   PreparedStatement stmt = con.prepareStatement(sql);
			   stmt.setString(1,un);
			   stmt.setInt(2, age);
			   stmt.setString(3,mob);
			   stmt.setString(4, country);
			   //stmt.setString(5, mob);
			   //stmt.setString(6,country);
			    int rows = stmt.executeUpdate();
			    if(rows>0)
			    {
			    	String msg="successfully registered";
			    	response.sendRedirect("index.jsp?msg"+msg);
			    }
			    else {
			    	String msg=" not successfully registerd";
			    	response.sendRedirect("register.jsp?");
			    }
		} catch ( SQLException|ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
