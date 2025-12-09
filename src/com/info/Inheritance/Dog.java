package com.info.Inheritance;

public class Dog extends CreateAnimal {
	void Doghasbark() {
		System.out.println("Dog is barking");
		
	}
	
		
	
	public static void main(String[] args) {
		Dog dg=new Dog();
		dg.Animalhaseat();
		dg.Doghasbark();
		
	}

}
