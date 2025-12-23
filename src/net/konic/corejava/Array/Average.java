package net.konic.corejava.Array;

public class Average {
	
	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		int sum = 0;
		int average;
		System.out.print("Average =   ");
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			
		}
		average = sum/a.length;
		System.out.print(average+"  ");
		
	}

}
