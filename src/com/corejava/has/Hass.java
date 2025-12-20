package com.corejava.has;

class PaymentDetails{
	String method;
	double amount;
	PaymentDetails (String method ,double amount){
		this.method=method;
		this.amount=amount;
	}
}
class Order{
	PaymentDetails  payment;
	Order( PaymentDetails payment){ 
		this.payment=payment;
	}
	void displaysummary() {
		
		System.out.println("Order Placed Successfully");
		System.out.println("Payment Method:"+payment.method);
		System.out.println("Amount:"+payment.amount);
		
		
		
	}
}
	
	     
public class Hass {
	public static void main(String[] args) {
		PaymentDetails pd = new PaymentDetails("UPI",550.00);
		Order od = new Order(pd);
		od.displaysummary();
		
		 
	}

}
