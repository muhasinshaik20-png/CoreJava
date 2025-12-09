package net.konic.corejava.plmrphsm;

public class CalculateArea {
	int area (int a) {
		int x=a*a;
		System.out.println("Area of square:"+x);
		return x;
	}
	int area (int l,int b) {
		int y=l*b;
		System.out.println("Area of rectangle:"+y);
		return y;
		}
	void area (double pi, int r ) {
		double z=pi*r*r;
		System.out.println("Area of Circle:"+z);		
	}
	public static void main(String[] args) {
		CalculateArea  ca = new CalculateArea();
		ca.area(5);
		ca.area(5,10);
		ca.area(3.14,7);
		
	}

}
