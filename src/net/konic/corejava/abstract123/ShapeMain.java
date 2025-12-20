package net.konic.corejava.abstract123;

abstract class shape {
abstract	void draw() ;

}
class Circle extends shape{
	void draw() {
		System.out.println("Drawing Circle");
}
}
class Square extends shape{
	void draw() {
		System.out.println("Drawing Square");
}
}
public class ShapeMain{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Shape:Circle or Square");
		String input=sc.next();
		shape s;
		
		if (input. equalsIgnoreCase("Circle")) {
		s=new Circle();
		}
		
		else {
		s=new Square();	
		}
		s.draw();
	}
}