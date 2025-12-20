package net.konic.corejava.encapsulation;

public class Product {
	private int Price;

	public int getPrice() {
		return Price;
	}

	public void setPrice(int Price) {
		if(Price>=0) {
		this.Price = Price;
		System.out.println();
	}
		else {
			System.out.println("Invalid price");
		}
	}
	public static void main(String[] args) {
		Product pd = new Product();
		pd.setPrice (-500);
		int Price = pd.getPrice();
		System.out.println(Price);
	}

}
