

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
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int u=Integer.parseInt(request.getParameter("id"));
		String p=request.getParameter("name");
		
		try {
								Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/satyadb";
			String username="root";
			String password="Satyasri@1999";
			Connection con=DriverManager.getConnection(url, username, password);
			String sql="insert into student values(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,u);
			ps.setString(2,p);
			ps.execute();
			 sql="update student set sname='kavya' where sid=25";
			 ps=con.prepareStatement(sql);
			 ps.execute();
			 sql="delete from student where sid=3";
			 ps=con.prepareStatement(sql);
			 ps.execute();
			 response.setContentType("text/html");
			 PrintWriter pw=response.getWriter();
			 pw.print("Records updated<br>");
			 pw.print("updated records are:<br>");
			 sql="select * from student";
			 Statement s=con.createStatement();
			 ResultSet rs=s.executeQuery(sql);
			 while(rs.next())
			 {
				 pw.print(rs.getInt(1)+" "+rs.getString(2));
				 pw.print("<br>");
			 }
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//response.getWriter().appmend("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
