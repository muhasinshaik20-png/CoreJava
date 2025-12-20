package net.konic.corejava.operetorshomewqrk;

public class Arithmeticoperators {
	int itemprice ;
	int quantity;
	double tax ;
	
	
	public static void main(String []args) {
		
		
	int	itemprice =50;
	int	quantity =200;
	double tax = 0.5;
	
	int totalprice =(itemprice*quantity);
	double finalbill = (totalprice+tax);
	
	
	System.out.println("Totlprice:"+(itemprice*quantity));
	System.out.println("tax:"+tax);
	System.out.println("finalbill:"+(totalprice+tax));
		
	}

}
