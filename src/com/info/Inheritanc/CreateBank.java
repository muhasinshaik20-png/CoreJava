package com.info.Inheritanc;
class Bank{
	void deposite() {
		System.out.println("Deposit successful");
	}
	
}
class SBI extends Bank{
	void sbiFeatures() {
		System.out.println("SBI:Unlimited ATM withdrawals");
	}
	
	}



public class CreateBank {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.deposite();
		sbi.sbiFeatures();

}
}