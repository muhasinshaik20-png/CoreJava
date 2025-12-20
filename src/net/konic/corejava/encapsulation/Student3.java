package net.konic.corejava.encapsulation;

import java.util.Scanner;

public class Student3 {
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		
		if(marks>=0 && marks<=100) {
			this.marks = marks;
			System.out.println("Marks is:" +this.marks);
		}
			else{
		System.out.println("Invalid marks");
				
			}
			
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks:    ");
		int m = sc.nextInt();
		
		Student3 st3 = new Student3();
		st3.setMarks(m);
	}
		
	}
	


