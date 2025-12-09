package net.konic.corejava.plmrphsm;

public class RechargeMobile {
	Long recharge (long a) {
		System.out.println("Recharge successful for"+a);
		return a;
	}
	Long recharge (long a,int b) {
		System.out.println(a+"Recharge ₹"+b+"successful");
		return a+b;
	}
	void recharge (long a,int b,String NEW50) {
		System.out.println(a+"Recharge ₹"+b+"with coupon"+NEW50+"applied");
}
	public static void main(String[] args) {
		RechargeMobile rm =new RechargeMobile();
		     rm.recharge(9000000000L);
		     rm.recharge(9000000000L,299);
		     rm.recharge(9000000000L,299,"NEW50");
		
	}
	

}
