package net.konic.corejava.iSA;

class Person {
	String name;
	int age;
}

class Employee extends Person {
	double salary;
}

public class Employeedata {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee em1 = new Employee();
		System.out.println("Enter age: ");
		em1.age = 27;
		em1.age=
				sc.nextInt();
		System.out.println("Enter employee name: ");
		em1.name=sc.next();

		System.out.println("Personrson:" + em1.name + "(" + em1.age + ")");
		System.out.println("Employe salary:" + em1.salary);

	}

}
