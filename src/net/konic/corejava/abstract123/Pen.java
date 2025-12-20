package net.konic.corejava.abstract123;



abstract  class Pen {
	void Features() {
		System.out.println("pen has soo many features");
	}
	abstract void Writing();
	
	abstract void Drawing();
	
	public static void main(String[] args) {
		Pen p = new cello();
		
		p.Writing();
		p.Drawing();
	}
}

class cello extends Pen {
	void Writing() {
		System.out.println("Cello pen gives smooth writing");
	}
	void Drawing() {
		System.out.println("By using Cellopen we draw nice drawings");
	}
}