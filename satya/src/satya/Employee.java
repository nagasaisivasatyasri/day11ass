package satya;

public class Employee {
	String eName;
	int eid;
	int sal;
	int age;
	int exp;
	int sum=0;
	//void display()
	 void calc()
		{
			if(exp>5)
			{
				sum=(sal*10)/100;
			System.out.println("Bonus 10% "+sum);
			}
			if(exp>10)
			{
				sum=(sal*20)/100;
				System.out.println("Bonus 20% "+sum);
			}
		}
	 


}
