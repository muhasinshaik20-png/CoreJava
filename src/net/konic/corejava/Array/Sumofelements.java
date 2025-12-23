package net.konic.corejava.Array;

public class Sumofelements {
	public static void main(String[] args) {
		
	int a [] = {10, 20, 30 ,40};
	int sum=0;
	
	
		for(int i=0; i<a.length; i++) {
		sum = sum+ a[i];
		}
		System.out.print("Sum=  " +sum);
	

}
}