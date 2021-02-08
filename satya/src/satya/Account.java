package satya;
import java.lang.*;
import java.util.InputMismatchException;
public abstract class Account {
	static String aType;
	static int accNo;
	 static String accHolder;
	 static int age;
	 static int bal;
	//Customer q=new Customer();
	static void addCustomer()
	{
	System.out.println("Enter Account type");
	 aType=Bank.s.next();
	Bank.s.nextLine();
	System.out.println("Enter customer account Number ");
	try {
	 accNo=Bank.s.nextInt();
	}
	catch(InputMismatchException e)
	{
		System.out.println(e);
	}
	
	System.out.println("Enter account holder");
	 accHolder=Bank.s.nextLine();
	Bank.s.nextLine();
	System.out.println("Enter branch  name:");
	String bname=Bank.s.next();
	Bank.s.nextLine();
	System.out.println("Enter age");
	age=Bank.s.nextInt();
	if(age<18) {
	try {
		throw new AgeInvalidException("Not eligible to create account");
	}
	catch(AgeInvalidException e)
	{
	e.printStackTrace();	
	}
	
	}
	System.out.println("Enter bank bal");
	bal=Bank.s.nextInt();
	if(bal<2000)
	{
		try
		{
			throw new MinBalException("Bal is less,maintain Minimum balance");
			
		}
		catch(MinBalException e) {
			e.printStackTrace();
		}
		
	}
	Customer.add(aType,accNo,accHolder,bname,age,bal);
}
	static void deleteCustomer() { Customer.delete();}
	static void editCustomer() {Customer.edit();}
	
static void selectCustomer()
 {
	 System.out.println("Enter accNumber");
	 int o=Bank.s.nextInt();
	 Customer.select(o);
 }
abstract void run();
	public Account(String aType, int accNo, String accHolder) {
		this.aType = aType;
		this.accNo = accNo;
		this.accHolder = accHolder;
	}
	public Account() {}


}
