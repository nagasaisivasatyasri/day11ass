package com.model;

public class Student {
private int id;
private String name;
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
Student(){}

public Student(int i) {
	// TODO Auto-generated constructor stub
	this.id=id;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

}
