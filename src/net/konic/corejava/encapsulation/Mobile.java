package net.konic.corejava.encapsulation;

public class Mobile {
	 private long Pin;
	 
	 public long getPin() {
		return Pin;
	}

 public void setPin(long Pin) {
	 if(Pin>=1000 && Pin<=9999) {
		 this.Pin = Pin;
		 System.out.println("Enter Pin:"+Pin);
	 }
	 else {
		 System.out.println(" Invalid PIN");
	 }
		 
	 }

public static void main(String[] args) { 
	Mobile mm = new Mobile();
	mm.setPin(123);
	long Pin = mm.getPin();
	System.out.println(Pin);

	}

}
