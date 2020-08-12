package org.azio;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {

		String s = "hello123";

		String s1 = "world9876";
		
		char[] ch = s1.toCharArray();
		
		System.out.println(Arrays.toString(ch));

		// an array

		// arr 5 arr[0] = h arr[4] = o

		char[] c = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {

			c[i] = s.charAt(i);

		}

		System.out.println(Arrays.toString(c));

	}

}
