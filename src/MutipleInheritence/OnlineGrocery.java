package MutipleInheritence;

public class OnlineGrocery extends GroceryShop {
	void onlinegrocery() {
		System.out.println("This is an OnlineGrocery service");
	}
	
public static void main(String[] args) {
	OnlineGrocery og = new OnlineGrocery();
	og.multilevelshop();
	og.groceryshop();
	og.onlinegrocery();
}
}
