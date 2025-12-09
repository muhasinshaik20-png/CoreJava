package com.info.Inheritance;

public class Car extends Vehicle{
void carhasspeed(int a){
	System.out.println("Speed:"+a);
	
}
public static void main(String[] args) {
	Car cr=new Car();
	cr.vehiclehasbrand("Honda");
	cr.carhasspeed(120);
}
}
