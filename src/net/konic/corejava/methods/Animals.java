package net.konic.corejava.methods;

public class Animals {

	int num;
	int num1 ;
	public int All(int num , int num1) {
		 int sum = num + num1;
		 System.out.println(sum);
		return sum;
		
		
		
	}
	public static void main(String[] args) {
		
		Animals animals=new Animals();
		animals.num = 10;
		animals.num1 = 20;
		animals.All(10, 20);
	}       
	

}
