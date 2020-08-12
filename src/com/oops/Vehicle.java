package com.oops;

public class Vehicle {
	
	static int a; // declared
	
	

	public static void main(String[] args) {
		
		a=10; // defined

		Vehicle obj1 = new Vehicle();
		
		Lorry obj2 = new Lorry();

		Vehicle obj3 = new Lorry();
		
	//	Lorry obj4 = new Vehicle();

	}

	
	
	
	void test1() {
		System.out.println("In parent test1");
	}

	void test2() {
		System.out.println("In test2");
	}

}
