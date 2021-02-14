package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/orderservlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		var mtype=request.getParameter("mtype");
		var mname=request.getParameter("mname");
		var quan=Integer.parseInt(request.getParameter("quan"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String username="root";
			String password="Satyasri@1999";
			Connection con;
			 con = DriverManager.getConnection(url, username, password);
			    //System.out.println("Successfully connected");
			 String sql1="insert into ordermedicine values(?,?,?)";
			 PreparedStatement st=con.prepareStatement(sql1);
			PrintWriter out=response.getWriter();
			st.setString(1,mtype);
			st.setString(2,mname);
			st.setInt(3,quan);
			int r=st.executeUpdate();
			String msg;
			if(r>0)
			{
				msg="ordered";
				System.out.println("ordered");
				response.sendRedirect("profile.jsp");
			}
			else
			{
				msg="Something went wrong";
				out.print(msg);
				response.sendRedirect("ordermedicine.jsp?msg"+msg);
			}
			
		}
		catch(SQLException | ClassNotFoundException e) {
			
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
