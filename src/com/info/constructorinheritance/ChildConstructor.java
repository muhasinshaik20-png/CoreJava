package com.info.constructorinheritance;

public class ChildConstructor extends ParentConstructor {
	void CC() {
		System.out.println("Child Constructor");
	}
public static void main(String[] args) {
	ChildConstructor cc = new ChildConstructor();
        cc.PC();
        cc.CC();
}
}
