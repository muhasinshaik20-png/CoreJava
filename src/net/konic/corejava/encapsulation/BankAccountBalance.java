package net.konic.corejava.encapsulation;

public class BankAccountBalance {
	
	private int Balance;

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}
	public static void main(String[] args) {
		BankAccountBalance bab = new BankAccountBalance();
	 bab.Balance=5000;
	int Balance = bab.getBalance();	
		System.out.println("Balance is: " +bab.getBalance());
	}
	

}
