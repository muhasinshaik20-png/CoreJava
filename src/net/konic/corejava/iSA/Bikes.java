package net.konic.corejava.iSA;

public class Bikes extends Vehicle{
	void overridestart() {
		System.out.println("Bike starts with kick");
	}

	public static void main(String[] args) {
		Bikes bk = new Bikes();
		Car cr = new Car();
		bk.start();
		bk.overridestart();
		cr.overridestart();
		
	}
		
	

}
