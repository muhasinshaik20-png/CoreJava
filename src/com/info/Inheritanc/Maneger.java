package com.info.Inheritanc;

public class Maneger extends Employee {
	void maneger(String p)
	{
		System.out.println("Department:"+p);

}
	public static void main(String[] args) {
		Maneger mg = new Maneger();
		mg.employee("Sameer",50000);
		mg.maneger("IT");
	}
}