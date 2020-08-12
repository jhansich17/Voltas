package com.codevita;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeTime {

	public static void main(String[] args) {

		int hours, partsInDay, partDuration, counter = 0;

		Scanner sc = new Scanner(System.in);

		hours = sc.nextInt();

		partsInDay = sc.nextInt();

		partDuration = hours / partsInDay;

		int[] primeNumbers = primeNumbersList(partDuration);

		for (int i = 0; i < primeNumbers.length; i++) {
			String flag = "true";
			String s = "";
			int n = primeNumbers[i];
			s = String.valueOf(n);

			for (int j = 1; j < partsInDay; j++) {
				n = n + partDuration;
				s = s + "~" + n;
				flag = isPrime(n) ? flag : "false";

			}
			if (flag.equalsIgnoreCase("true")) {
				counter++;
			}
		}
		System.out.println("Counter is: " + counter);
		System.out.println("\n");
	}

	static boolean isPrime(int number) {
		boolean isItPrime = true;

		if (number <= 1) {
			isItPrime = false;
			return isItPrime;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if ((number % i) == 0) {
					isItPrime = false;
					break;
				}
			}
			return isItPrime;
		}
	}

	static int[] primeNumbersList(int n) {

		int i = 0;
		int num = 0;
		String primeNumbers = "";

		ArrayList<Integer> list = new ArrayList();

		for (i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {

				if (i % num == 0) {
					counter = counter + 1;
				}

			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}

		String[] s = primeNumbers.split(" ");
		int[] primeArray = new int[s.length];

		for (int l = 0; l < s.length; l++) {
			primeArray[l] = Integer.parseInt(s[l]);
		}

		return primeArray;
	}

}
