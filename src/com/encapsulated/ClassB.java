package com.encapsulated;
			
public class ClassB extends ClassA  {
	
	public void b() {
		System.out.println(" this is child class");
	}
	public static void main(String[] args) {
//		But on the parent reference we can call only methods available in the parent class
//		and we can't call child specific methods.
		
		ClassA aa = new ClassB();
		aa.a();

		
	}

}
