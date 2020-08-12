package org.azio;

public class Operators {

	public static void main(String[] args) {

		// for, while, do-while

		// 1 to 10
		// i++ = i= i+1
		for (int i = 15; i >= 10; i--) {
			System.out.println(i);
		}

		int k = 30;

		/*
		 * do {
		 * 
		 * }
		 */
		while (k < 30) {  // 0   1
			System.out.println(k);
			k++;
		}

		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 */

	}

	int mul(int a, int b) {
		int c = a * b;
		return c;
	}

}
