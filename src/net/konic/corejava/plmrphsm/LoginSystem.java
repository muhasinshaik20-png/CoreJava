package net.konic.corejava.plmrphsm;

public class LoginSystem {
	void login(String a,String b) {
		System.out.println("Login success using Username & Password");
	}
	void login(long x,int b) {
		System.out.println("Login success using Mobile OTP");
	}
	

	public static void main(String[] args) {
		LoginSystem ls=new LoginSystem();
		ls.login("shiraz","pass123");
		ls.login(9000000000L,1234);

	}
}