package net.konic.corejava.plmrphsm;

public class ATMWithdrawal {
	void Withdraw(int x) {
		
		System.out.println("WITHdrawn"+"₹"+x);
	}
	void Withdraw(double x) {
		System.out.println("Withdrawn"+"₹"+x);
		
	}
	void Withdraw(int x,String y) {
		System.out.println("Withdrawn"+"₹"+(x+y));
		
	}
	
	public static void main(String[] args) {
		ATMWithdrawal mn =new ATMWithdrawal();
		mn.Withdraw(500);
		mn.Withdraw(500.75);
		mn.Withdraw(1000, " from Current Account");
				
		
	}
	}
	


