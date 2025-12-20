package net.konic.corejava.operetorshomewqrk;

import java.util.Scanner;

public class TemperatureConversionArithmatic {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Type(C/F):    ");
		char type = sc. next().charAt(0);
		
		
		System.out.println("Converted Temperature:     ");
		double temp =sc.nextDouble();
		
		if(type == 'C' ||  type == 'c')
		System.out.println("Fahrenheit:  "+(temp*9/5+32));
		
		else  if(type == 'F'  ||  type == 'f')
		System.out.println("celsius:  "+((temp-32)*5/9));
		
		else
			System.out.println("Invalid Type");
		
			
		}
		
	}


