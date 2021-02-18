package com.src;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Studentdao;
import com.model.Student;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
Studentdao dao=(Studentdao)context.getBean("stddao");
int status=dao.insertStudent(new Student(1,"manjusha"));
int status1=dao.insertStudent(new Student(2,"Lalitha"));
int status2=dao.insertStudent(new Student(3,"sai"));
int status3=dao.insertStudent(new Student(4,"vineetha"));


List<Student> l=dao.getStudent();
if(status>0)
{
	System.out.println("value inserted");
}
else
{
	System.out.println("values not inserted");
}
if(status1>0)
{
	System.out.println("value inserted");
}
else
{
	System.out.println("values not inserted");
}

if(status2>0)
{
	System.out.println("value inserted");
}
else
{
	System.out.println("values not inserted");
}

if(status3>0)
{
	System.out.println("value inserted");
}
else
{
	System.out.println("values not inserted");
}
for(Student e :l)
{
	System.out.println(e);
}

int status4=dao.updateStudent(new Student(3,""));
if(status4>0)
{
	System.out.println("value updated");
}
else
{
	System.out.println("values not updated");
}
List<Student> l1=dao.getStudent();
for(Student e :l1)
{
	System.out.println(e);
}
int status5=dao.deleteStudent(new Student(2,""));
if(status5>0)
{
	System.out.println("value deleted");
}
else
{
	System.out.println("values not deleted");
}

List<Student> l2=dao.getStudent();
for(Student e :l2)
{
	System.out.println(e);
}


	}

}
