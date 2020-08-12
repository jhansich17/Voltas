package org.azio;

import java.util.Arrays;

public class Values {

	public static void main(String[] args) {

		int i = 123;

		int[] a = new int[5];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

	//	System.out.println(Arrays.toString(a));

		int[] k = { 10, 11, 12, 13, 14, 15 };

	//	System.out.println(Arrays.toString(k));

		int[][] b = new int[2][2];

		b[0][0] = 1;
		b[0][1] = 2;
		b[1][0] = 3;
		b[1][1] = 4;

		System.out.println(Arrays.deepToString(b));

	}

}
