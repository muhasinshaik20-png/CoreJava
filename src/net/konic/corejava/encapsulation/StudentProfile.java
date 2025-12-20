package net.konic.corejava.encapsulation;

public class StudentProfile {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
	if(age>=5 && age<=100){
		this.age = age;
		System.out.println("age is:"+this.age);
	}
	else {
		System.out.println("Invalid age");
	}
	
}
	public static void main(String[] args) {
		StudentProfile sp = new StudentProfile();
		sp.setAge(3);
		int age = sp.getAge();
		System.out.println(age);
	}
	
}
