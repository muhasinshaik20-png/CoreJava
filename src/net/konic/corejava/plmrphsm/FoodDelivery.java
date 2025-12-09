package net.konic.corejava.plmrphsm;

public class FoodDelivery {
	String order (String x) {
		System.out.println("order placed:"+x+"(1qty)");
		return x;	
	}
	void order (String a,int b) {
		System.out.println("order placed:"+a+"("+b+"qty"+")");
	}
	void order (String a,int b,String c) {
		System.out.println("order placed:"+a+"("+b+"qty"+","+c+")");
	}
	public static void main(String[] args) {
		FoodDelivery fd = new FoodDelivery();
		fd.order("Biryani");
		fd.order("Biryani",2);
		fd.order("Biryani",2 ,"Spicy");
		
	}
	
	
	
	
	
	

}
