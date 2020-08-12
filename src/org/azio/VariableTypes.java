package org.azio;

public class VariableTypes {

	int i = 26; // global variables

	void test() {
		int b = 10; // local variables > global variable

		System.out.println("i value: " + i);
	}

	void test2() {
		
		System.out.println(i);
		
	}
	
	
	public static void main(String[] args) {
		VariableTypes obj = new VariableTypes();

		obj.test();

	}

}
