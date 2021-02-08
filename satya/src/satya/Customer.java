package satya;
import java.lang.*;
public  class Customer extends Account {
  static String aType;
 static int accNo;
  static String accHolder;
private  String bname;
static int age,bal;
 static int m=0;
 //Account w=new Account();
 static Customer c[]=new Customer[100];
 Customer() {}
 static void add(String aType,int accNo,String accHolder,String bname,int age,int bal)
 {
	

Customer customer=new Customer(aType,accNo,accHolder,bname,age,bal);
	 c[m]=new Customer();
	 c[m]=customer;
	  m++;
	 
 	 }
	
		
	

static  void select(int o)
{
	for(int i=0;i<m;i++)
	{
		try {
		if(c[i].accNo==o)
		{
			System.out.println(c[i].accNo+" "+c[i].aType+" "+c[i].accHolder+" "+c[i].bname+" "+c[i].age+" "+c[i].bal);
		}
		 throw new CustomerNotFoundException("Customer with id not exists");
		}
		catch(CustomerNotFoundException e)
		{
			e.printStackTrace();
		}
	
		
		
	}
}


public Customer(String aType, int accNo, String accHolder) {
	this.aType = aType;
	this.accNo = accNo;
	this.accHolder = accHolder;
}
 	



public Customer(String aType, int accNo, String accHolder,String bname,int age, int bal) {
	this.aType = aType;
	this.accNo = accNo;
	this.accHolder = accHolder;
	this.bname=bname;
	this.age=age;
	this.bal=bal;
}
public static void display() {
	
	if(m>0) {
	// TODO Auto-generated method stub
	for(int i=0;i<m;i++)
	{
	System.out.println(c[i].accNo+" "+c[i].aType+" "+c[i].accHolder+" "+c[i].bname+" "+c[i].age+" "+c[i].bal);	
	}
	
}
	else {
		try {
			throw new NoCustomerExistsException("No customer details are exists");
		}
		catch(NoCustomerExistsException e)
		{
			e.printStackTrace();
		}
	}
		


}

static void delete() {
	// TODO Auto-generated method stub
	System.out.println("enter accNo to delte");
	accNo=Bank.s.nextInt();
	for(int i=0;i<m;i++)
	{
		try {
		if(c[i].accNo==accNo)
		{
			c[i]=c[i+1];
			
		}
	 throw new CustomerNotFoundException("Customer with id not exists");
		}
		catch(CustomerNotFoundException e)
		{
			e.printStackTrace();
		}
			
					
				}
		
		
	--m;	
	
	
}

static void edit() {
	System.out.println("Enter accNo to edit");
	accNo=Bank.s.nextInt();
	// TODO Auto-generated method stub
	for(int i=0;i<m;i++)
	{try {
		if(c[i].accNo==accNo)
		{
			System.out.println("Enter acctype to edit");
			c[i].aType=Bank.s.next();
			Bank.s.nextLine();
			System.out.println("Enter accHolder name to edit");
			c[i].accHolder=Bank.s.next();
			Bank.s.nextLine();
			System.out.println("Enter bname to edit");
			c[i].bname=Bank.s.next();
			Bank.s.nextLine();
		}
		throw new CustomerNotFoundException("Customer with id not exists");
	}
	catch(CustomerNotFoundException e)
	{
		e.printStackTrace();
	}
		
				
			}
	
}
@Override
void run() {
	// TODO Auto-generated method stub
	
}}


