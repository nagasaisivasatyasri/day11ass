package satya;

import java.util.Scanner;

public class StudentMain {
	static Student s[]=new Student[100];
	static int m1=0;
	static void add(String name,int roll,int age,int p,int c,int m)
	{

Student	stu=new Student(name,roll,age,p,c,m);
		s[m1]=new Student();
		s[m1]=stu;
		m1++;	
	}
	static void display()
	{
		if(m1>0) {
		for(int i=0;i<m1;i++)
		{
		
			
			s[i].display();
		}
		}
		
		
	}
	static void edit(int d)
	{
		for(int i=0;i<m1;i++)
		{
			if(s[i].roll==d)
			{
				s[i].edit();
			}
			}
	}
	static void delete(int e)
	{
		for(int i=0;i<m1;i++)
		{
			if(s[i].roll==e)
			{
				s[i]=s[i+1];
				s[s.length-1]=null;
				}
		}
		--m1;
	}
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int b;
		do
		{
			System.out.println("Welcome to student management");
			System.out.println("Select any option");
			System.out.println("1.add student\n 2.delete student \n 3.edit student \n 4.display student \n 5.back to menu");
			b=s1.nextInt();
			switch(b)
			{
			case 1:
				System.out.println("Enter student name");
				
				String name=s1.next();
				s1.nextLine();
				System.out.println("Enter roll number");
				int roll=s1.nextInt();
				System.out.println("Enter age");
				int age=s1.nextInt();
				System.out.println("Enter phy,chem,math marks");
				int p=s1.nextInt();
				int c=s1.nextInt();
				int m=s1.nextInt();
				add(name,roll,age,p,c,m);
				break;
			case 2:System.out.println("Enter roll number to delete");
			 int e=s1.nextInt();
			 delete(e);
			 break;
			 case 3:System.out.println("Enter roll number to edit");
					int d=s1.nextInt();
					edit(d);
					break;
			case 4:
				display();
				break;
			case 5:	System.exit(0);
					break;
			default:System.out.println("Enter valid entry");
			}
		}while(b<=5);

	}

}
