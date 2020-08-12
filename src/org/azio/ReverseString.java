package org.azio;

public class ReverseString {

	public static void main(String[] args) {

		String s = "java"; // 4 0 1 2 3

		// String s2 = "AvAj";

		String s1 = "";

		int l = s.length(); // 4

		for (int i = l - 1; i >= 0; i--) { //

			char c = s.charAt(i);

			if (i % 2 == 1) {
				c = Character.toUpperCase(c);
			}

			s1 = s1 + c; // a av ava avaj

			// System.out.println(s1);

		}

		System.out.println(s1);

		// avaj

		//

	}

}
