package net.konic.corejava.iSA;

public class Dog  extends Animal{
	void overridesound() {
		System.out.println("Dog barks");
		
	}
	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.breathe();
		dg.sound();
		dg.overridesound();
	}

}
