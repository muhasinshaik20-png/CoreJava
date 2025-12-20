package net.konic.corejava.encapsulation;
//
import java.security.DomainCombiner;//

public class ATM {
	private double Balance;
   
	public void setBalance(double balance) { 
			this.Balance=Balance;
	}
	public void setWithdraw(double amount) {
		if(amount <= Balance) {
			Balance = Balance-amount;
			System.out.println("Withdraw Successfully");
			
		}
		else {
			System.out.println("Insufficient balance");
					
		}
	}
		
		public static void main (String[] args) {
			ATM atm = new ATM();
			atm.setBalance(5000);
			atm.setWithdraw(6000);
			
			
		}
			
	
	
	

}
