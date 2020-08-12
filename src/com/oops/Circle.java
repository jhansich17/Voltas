package com.oops;

public class Circle implements Shape {

	@Override
	public void area() {

		System.out.println("In circle area method");

	}

	@Override
	public void perimeter() {
		System.out.println("In circle perimeter method");

	}
	
	void test() {
		System.out.println("In test");
	}

}
