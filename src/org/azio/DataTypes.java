package org.azio;

public class DataTypes {

	static int a = 323; //
	float f = 1111111111111111111111111111111111111.24f;
	char c = 'a'; //
	String s = "hello"; // primitive data types
	double d = 21.32; // primitive data types
	boolean b = true; // primitive data types
	// byte,short,long

	static DataTypes refDatatype; // referance data type
	static DataTypes refDatatype12;

	public static void main(String[] args) {

		System.out.println(refDatatype12.a);
		
		refDatatype12.mul(); // mul();
		

	}

	static void mul() {
		System.out.println("this is mul method");
	}

}
