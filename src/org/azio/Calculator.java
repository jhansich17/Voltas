package org.azio;

public class Calculator {

	int a = 10, b = 20; // variableType varName = varValue
	int c;

	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		obj.add();
		obj.sub();
		
	}
	
	void add() {
		c = a + b;
		System.out.println("Addition is: " + c);
	}

	void sub() {

		c = a - b;

		System.out.println("Subtraction is: " + c);
	}

}
