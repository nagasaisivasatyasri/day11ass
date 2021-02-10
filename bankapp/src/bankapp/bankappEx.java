package bankapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class bankappEx {

	public static void main(String[] args) throws SQLException,NullPointerException {
		// TODO Auto-generated method stub

		Acc b=new Acc();
		Scanner s=new Scanner(System.in);
		char c;
		do
		{
			System.out.println("enter accountnumber");
			long accno=s.nextLong();
			System.out.println("enter holdername");
			String holdname=s.next();
			System.out.println("enter bankname");
			String bankname=s.next();
			System.out.println("enter ifsc code");
			String ifsccode=s.next();
			System.out.println("enter accounttype");
			String acctype=s.next();
			System.out.println("enter transaction type");
			String transac=s.next();
			System.out.println("enter amount");
			double amount=s.nextDouble();
			b.setAccno(accno);
			b.setHoldname(holdname);
			b.setBname(bankname);
			b.setIfsccode(ifsccode);
			b.setTransaction(transac);
			b.setAcctype(acctype);
			b.setAmount(amount);
			 Connection con=null;
			PreparedStatement pstmt=null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try
			{
						Class.forName("com.mysql.cj.jdbc.Driver");
						String url="jdbc:mysql://localhost:3306/mydatabase";
						String username="root";
						String password="Satyasri@1999";
						con=DriverManager.getConnection(url,username,password);
						stmt = con.createStatement();
						String sql="insert into acc values(?,?,?,?,?,?,?)";
						pstmt=con.prepareStatement(sql);
						pstmt.setLong(1, b.getAccno());
						pstmt.setString(2, b.getHoldname());
						pstmt.setString(3, b.getBname());
						pstmt.setString(4, b.getIfsccode());
						pstmt.setString(5, b.getAcctype());
						pstmt.setString(6, b.getTransaction());
						pstmt.setDouble(7, b.getAmount());
						
						
						pstmt.execute();
						System.out.println("-------insert success---------------");
						
						stmt=con.createStatement();
						
						 int rows = stmt.executeUpdate("insert into acc values(987654,'vani','karurvisya','kvb4566','saving','credit',5000000)");
						    System.out.println("Rows inserted = "+ rows);
						    String sql1="select * from acc";
							rs=stmt.executeQuery(sql1);
							 while(rs.next())
							 {
								 System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getDouble(7));
							 }
						    
							 rows = stmt.executeUpdate("delete from acc where holdername ='vani'");
							    System.out.println("Rows deleted = "+ rows);
							    System.out.println("-----deleted  successfully-----");
						
							    String sql2="select * from acc";
								rs=stmt.executeQuery(sql2);
								 while(rs.next())
								 {
									 System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getDouble(7));
								 }
								 
								 rows= stmt.executeUpdate("Update acc set amount=0 where holdername='gowri'");
								    System.out.println("Rows updated = "+ rows);
								    System.out.println("-----deleted  successfully-----");
								    String sql3="select * from acc";
									rs=stmt.executeQuery(sql3);
									 while(rs.next())
									 {
										 System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getDouble(7));
									 }
			} 
			
			catch (ClassNotFoundException |SQLException e)
			{
						// TODO Auto-generated catch block
						
			}
			finally
			{
				try {
				pstmt.close();
				con.close();
				rs.close();
				}
				catch(NullPointerException e)
				{
					}
				}
			System.out.println("do you want to continue y/n");
			c=s.next().charAt(0);
		}while(c!='n');
	}

}
