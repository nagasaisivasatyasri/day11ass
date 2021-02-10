package satya;

import java.util.Scanner;

public class Student {
	String name;
	int roll,age,p,m,c;
Scanner a=new Scanner(System.in)
;public Student(String name, int roll, int age, int p, int m, int c) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
		this.p = p;
		this.m = m;
		this.c = c;
	}
public Student() {
	
}
 void display() {
	// TODO Auto-generated method stub
	System.out.println(name+" "+roll+" "+" "+age+" "+p+" "+c+" "+m);
}
void edit()
{
	System.out.println("Enter name to edit");
	name=a.next();
	a.nextLine();
	System.out.println("Enter age to edit");
	age=a.nextInt();
	System.out.println("Enter marks to edit");
	p=a.nextInt();
	c=a.nextInt();
	m=a.nextInt();
}
}
