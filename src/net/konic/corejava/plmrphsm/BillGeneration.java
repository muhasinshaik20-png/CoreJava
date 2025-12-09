package net.konic.corejava.plmrphsm;

public class BillGeneration {
	int generateBill (int a) {
		System.out.println("Final Bill:"+"₹"+a);
		return a;
	}
	void generateBill (int a,int b) {
		int c=a-(b*10);
		System.out.println("Final Bill after discount:"+"₹"+c);
	}
	int generateBill (int a,int b,int c) {
		int x=a-(6*b)+c;
		System.out.println("Final Bill:"+"₹"+x);
		return x;
	}
	public static void main(String[] args) {
		BillGeneration bg = new BillGeneration();
		bg.generateBill(1000);
		bg.generateBill(1000,10);
		bg.generateBill(1000,10,5);
	}

}
