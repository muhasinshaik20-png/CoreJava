package net.konic.corejava.encapsulation;

public class Emplye { 
	private double Salary;

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		if (salary >0) {
			System.out.println(" Salary is : "+ Salary);
		this.Salary = Salary;
	}
		else {
			System.out.println("Invalid");
		}
		}	
	
	public static void main(String[] args) {
		Emplye ep = new Emplye();
		ep.Salary = 45000;
		double Salary = ep.getSalary();
		System.out.println("Employee Salary: "+Salary);
		
		
	}
	
	
	

}
