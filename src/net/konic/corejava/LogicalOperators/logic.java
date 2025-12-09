package net.konic.corejava.LogicalOperators;

public class logic {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		
	System.out.println(a>15&&b>5);	
	System.out.println(a>15&&b<5);
	System.out.println(a<15&&b>5);
	
	
	System.out.println(a>15||b>5);
	System.out.println(a>15||b<5);
	System.out.println(a<15||b<5);
	
	
	System. out.println(!(a>15));
	System.out.println(!(b<5));		
			
}
}