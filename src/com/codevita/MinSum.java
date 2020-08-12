
package com.codevita;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MinSum {

	public static void main(String[] args) {

		MinSum obj = new MinSum();

		int arrLength, noOfOperations, sum = 0;

		Scanner sc = new Scanner(System.in);

		arrLength = sc.nextInt();

		int[] arr = new int[arrLength];

		noOfOperations = sc.nextInt();

		for (int i = 0; i < arrLength; i++) {
			arr[i] = sc.nextInt();
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
