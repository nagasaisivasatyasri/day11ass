package bankapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;

public class BankDbex {
	static Connection con=null;
	static PreparedStatement statement; 
	static	Scanner s=new Scanner(System.in); 
	static Account a=new Account();
	
	static BankDbex bdb=new BankDbex();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int ch;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String username="root";
		String password = "Satyasri@1999";
		con = DriverManager.getConnection(url,username,password);
		con.setAutoCommit(false);
		
		// TODO Auto-generated method stub
		do
		{
		System.out.println("Welcome to bank management");
		System.out.println("choose an option");
		System.out.println("1.Add account details\n2.delete  and account details\n3.Edit customer\n4.select customer\n5.display customer\n6.back to menu");
		 ch=s.nextInt();
		 String sql="insert into account (accid,accHoldername,accbal)values(?,?,?)";
			statement= con.prepareStatement(sql);
			
			
		switch(ch)
		{
			case 1:
					System.out.println("--------------------------------------------------------------");
					System.out.println("adding  account details");
					try {
					System.out.println("Enter account id:");
					int accid=s.nextInt();
					a.setAccid(accid);
					System.out.println("Enter accHolder name:");
					String accHoldername=s.next();
					a.setAccHoldername(accHoldername);
					System.out.println("Enter balance of account");
					double accBal=s.nextDouble();
					a.setAccBal(accBal);
					statement.setInt(1,a.getAccid());
					statement.setString(2,a.getAccHoldername());
					statement.setDouble(3,a.getAccBal());
					statement.execute();
					//statement.executeQuer
						statement.close();}
						catch(SQLException e1)
						{
							
						}
					
					//addAccount(statement);
					
					break;
					
			case 2:System.out.println("--------------------------------------------------------------");
					//deleteAccount(rowset);
										//rowset.execute();
					//deleteCustomer();
					break;
					
			case 3:System.out.println("------------------------------------------------------------------");
					break;
			case 4:System.out.println("Enter accountid to select");
					int id3=s.nextInt();
					ResultSet rs1 = statement.executeQuery(sql);
					
					int count = 0;
					
					while (rs1.next()){
						System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getDouble(3));
					}
		
//					{
//					System.out.println(statement.getInt(1)+" "+statement.getString(2)+" "+statement.getDouble(3));
//					}
//					//selectCustomer();
					break;
			case 5:System.out.println("Displaying records");
			String sql1="select * from account"	;
			ResultSet rs= statement.executeQuery(sql);
			while (rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
//					break;
			case 6:System.exit(0);
				break;
			default:System.out.println("select  valid option");
			break;
		}
	}while(ch<=6);

			
			}
	
	
	public static void deleteAccount() {
		
	}
	

}
