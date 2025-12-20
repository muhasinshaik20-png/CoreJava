package com.corejava.has;

class Engine{
	void  startEngine() {
		System.out.println("Engine started");
				
	}
	
}

class Car{
	Engine engine = new Engine();
	
	void move() {
		engine.startEngine();
		System.out.println("Car is moving");
		
	}
}
public class Car3{
	public static void main(String[] args) {
		Car ca = new Car();
		  ca.move();
	
		
	}

}
