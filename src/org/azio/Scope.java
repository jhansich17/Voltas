package org.azio;

public class Scope {

	void test1() { // static vs instance

		System.out.println("am in test1");
	}

	static void test2() {
		System.out.println("am in test2");
	}

	// public, private, protected, default
	
	public static void main(String[] args) {
		Scope obj = new Scope();

		obj.test1();
		
		obj.test2();
		
		Scope.test2();
	}

	// +, -, *, %, /
	// 
	
	
}
