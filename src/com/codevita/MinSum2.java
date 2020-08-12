
package com.codevita;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MinSum2 {

	public static void main(String[] args) throws Exception {

		MinSum2 obj = new MinSum2();

		int arrLength, noOfOperations, sum = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		arrLength = Integer.parseInt(reader.readLine());

		int[] arr = new int[arrLength];

		noOfOperations = Integer.parseInt(reader.readLine());

		for (int i = 0; i < arrLength; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}

		for (int n = 0; n < noOfOperations; n++) {

			int largeNumber = obj.largestElement(arr);

			for (int k = 0; k < arr.length; k++) {

				if (arr[k] == largeNumber) {
					arr[k] = largeNumber / 2;
				}

			}

		}

		for (int v = 0; v < arr.length; v++) {
			sum = sum + arr[v];
		}
		reader.close();
		System.out.println(sum);

	}

	int largestElement(int[] arr) {

		int i;
		int max = arr[0];

		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
