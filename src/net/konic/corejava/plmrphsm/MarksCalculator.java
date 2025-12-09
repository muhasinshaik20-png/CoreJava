package net.konic.corejava.plmrphsm;

public class MarksCalculator {
	int calculateMarks(int a) {
		System.out.println("TotalMarks:"+a);
		return a;
		
	}
	int calculateMarks(int a,int b) {
		int c=a+b;
		System.out.println("TotalMarks:"+c);
		return c;
	}
	void calculateMarks(int a,int b,int c) {
		int d= a+b+c;
		System.out.println("TotalMarks:"+d);
	}
	public static void main(String[] args) {
		MarksCalculator mc = new MarksCalculator();
		mc.calculateMarks(80);
		mc.calculateMarks(80,90);
		mc.calculateMarks(80,90,85);
		
	}

}
