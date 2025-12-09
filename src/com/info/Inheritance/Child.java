package com.info.Inheritance;

public class Child extends Parent {
	void student(int c) {
		System.out.println("Roll No:"+c);
	}
	public static void main(String[] args) {
		Child ch = new Child();
		ch.person("Rahul");
		ch.person(20);
		ch.student(101);
		
	}

}
