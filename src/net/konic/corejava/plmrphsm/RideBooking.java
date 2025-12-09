package net.konic.corejava.plmrphsm;

public class RideBooking {
	
	String  bookRide (String x ,String y) {
		
	System.out.println("Ride booked from"+ x + "to" + y);
	return x+y;
	
	}
	
	String bookRide(String a, String b, String c) {
		System.out.println(a +"Ride booked from"+ b +"to"+ c);
		return a+b+c;
		
		
		
	}
	void bookRide(int x,String y,String z) {
		System.out.println("Ride booked for"+ x +"passengers from"+ y +"to"+ z);
	}
	public static void main(String[] args) {
		RideBooking rb = new RideBooking();
		    rb.bookRide("Ameerpet","Hitech City");
		    rb.bookRide("SUV","Ameerpet","Hitech City");
		    rb.bookRide(3,"Ameerpet","Hitech City");
	}
		
		
	}


