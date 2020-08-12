package com.oops;

public class Parent {

	int i = 123, j;

	public static void main(String[] args) {
		Child obj = new Child();

		obj.test();
	}

}

class Child {
	int m = 435;

	void test() {
		int h = 12;
		System.out.println(h);
	}
}

class GrandChild extends Child {

}
