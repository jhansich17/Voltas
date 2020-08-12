package org.azio;

public class Apple {

	int a = 27;
	Apple apple;

	Apple() {

	}

	Apple(int g, int h) { // parameterised constructor
		int v = g + h;
		System.out.println("Addition in constructor: " + v);

	}

	public static void main(String[] args) {

		Apple obj = new Apple(); // default constructor

		obj.add();

		Apple obj1 = new Apple(10, 20);

		obj1.add();

	}

	void add() { // returnType methodName
		int a = 10, b = 20; // methodBody
		int c = a + b;

		System.out.println("Addition is: " + c);
	}

	int sub(int a, int b) { // method parameters
		int k = a + b;
		System.out.println("Addition is: " + k);
		return k;
	}

}
