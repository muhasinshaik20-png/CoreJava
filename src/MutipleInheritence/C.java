package MutipleInheritence;

public class C extends B {
	void c() {
		System.out.println("C method");
	}
	public static void main(String[] args) {
		C c=new C();
		c.a();
		c.b();
		c.c();
	}

}
