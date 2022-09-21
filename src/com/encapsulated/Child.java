package com.encapsulated;

public class Child extends Parent  {
	public void m3() {
		System.out.println("this is m3");
	}
	public void m4() {
		System.out.println("this is m4");
	}
	public static void main(String[] args) {
//		 Hence on the child reference we can call both parent and child class
		Child ch = new Child();
		ch.m1();
		ch.m2();
		ch.m3();
		ch.m4();
	}

}
