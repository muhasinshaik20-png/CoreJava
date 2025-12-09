package net.konic.corejava.plmrphsm;

public class OnlineShoppi {
	int addToCart (int x) {
		
	System.out.println("Product "+x+" add to cart");
	return x;
	}
	void addToCart(int x ,int y) {
		System.out.println("Product "+x+" add With quantity"+y);
		}
	String addToCart (String y) {
		System.out.println("Earphones added to cart");
		return y;
	}
	public static void main(String[] args) {
		OnlineShoppi os = new OnlineShoppi();
		    os.addToCart(101);
		    os.addToCart(101,3);
		    os.addToCart("Earphones added to cart") ;
		    
		
		
	}

}
