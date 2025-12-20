package com.corejava.has;

import java.util.Scanner;

class Address123{
	String city;
	int pincode;
	Address123 (String city,int pincode){
	   this. city=city;
	   this. pincode=pincode;
}
}
class Student{
	String name;
	Address123  address123;
	Student (String name, Address123  address123){
		this.name=name;
		this.address123=address123;
	}
	void close() {
		System.out.println("Student:"+name);
		System.out.println("Address:"+" city" +"-"+ "pincode");
	}
}
public class HASa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Students:  ");
		String name = sc.nextLine();
		
		
		System.out.println("Address:   ");
		String  city = sc.nextLine();
		int  pincode = sc.nextInt();
		
		
		Address123    address = new Address123(city,pincode);
		Student student = new Student(name,address);
		sc.close();
	}

}
