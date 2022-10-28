package com.te.javabasic.mymap;

public class StudentData {

	int id;
	String name;
	int age;
	int marks;
	
	public StudentData(	int id,String name,int age,int marks) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	
	}

	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	
}
