package net.konic.corejava.plmrphsm;

public class StudentRegistration {
	void register(String x) {
		System.out.println("Registered:"+x);
	}
	void register(String a,int b) { 
		
	    System.out.println("Registered:"+a +"," +" Age:"+b);
	    
		
	}
	void register(String a,int b,String c) {
		System.out.println("Registered:"+a+","+"Age:"+b+","+"city:"+c);
		
	}
	public static void main(String[] args) {
		StudentRegistration st = new StudentRegistration();
		st.register("Rahul");
		st.register("Rahul" ,20);
		st.register("Rahul" ,20, "Hyderabad");
		
	}

}
