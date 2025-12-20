package net.konic.corejava.iSA;

public class CarLoan extends BankLn {
	void PrintEMI() {
		System.out.println("Calculating EMI for Car Loan");
	}
	public static void main(String[] args) {
		CarLoan cl = new CarLoan();
		HomeLoan hl = new HomeLoan();
		cl.calculateEMI();
		hl.PrintEMI();
		cl.PrintEMI();
	}

}
