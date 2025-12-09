package com.info.HierarchicalInheritence;

public class Childern2 extends Children1 {
	void iPhone() {
		System.out.println("iPhone special feature");
	}
public static void main(String[] args) {
    Childern2 chl= new  Childern2();
    chl.Mobile();
    chl.Samsung();
    chl.Mobile();
    chl.iPhone();
}
}
