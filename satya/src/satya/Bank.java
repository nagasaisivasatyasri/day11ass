package satya;

import java.util.Scanner;

public class Bank {
		public Bank() {}
	static	Scanner s=new Scanner(System.in);

	
		public static void main(String[] args) {
			int ch=0;
		//Account a=new Account();
		Customer d1=new Customer();
		do
		{
		System.out.println("Welcome to bank management");
		System.out.println("choose an option");
		System.out.println(" 1.Add customer\n2.delete customer\n3.Edit customer\n4.select customer\n5.display customer\n6.back to menu");
		ch=s.nextInt();
		switch(ch)
		{
			case 1:System.out.println("adding customer");
					Account.addCustomer();
					break;
			case 2:System.out.println("Enter accNo to delete");
					Account.deleteCustomer();
					break;
			case 3:System.out.println("Enter accno to edit");
					Account.editCustomer();
					break;
			case 4:System.out.println("Enter accno and branch name to select");
					Account.selectCustomer();
					break;
			case 5:System.out.println("Displaying records");
					d1.display();
					break;
			case 6:System.exit(0);
				break;
			default:System.out.println("select  valid option");
			break;
		}
	}while(ch<=6);

}
	
}
