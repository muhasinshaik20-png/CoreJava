package com.corejava.has;


public class Employe {
	String name;
	String role;
	Maneger manager;
	Address address;
	 public Employe(String name,String role) {
	      this.name=name;
	      this.role=role;
	 }
	 
	public static void main(String[] args) {
		Maneger mng = new Maneger("Shaik",9908765402l);
		System.out.println("Manegername:"+mng.name);
		System.out.println("Phone no:"+mng.phoneno);
		
		
		Address ads = new Address("Jhanda street" ,524003,101);
		System.out.println("streetname:"+ads.streetname);
		System.out.println("Pincode:"+ads.pincode);
		System.out.println("Flatno"+ads.Flatno);
		
		
		Employe emp = new Employe("Syed","App develeper");
		System.out.println("name:"+emp.name);
		System.out.println("role:"+emp.role);
		
	}

}
