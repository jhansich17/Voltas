package org.azio;

public class DecisionMaking {

	public static void main(String[] args) {

		// if, else, switch

		int n = 36;

		// cofficient, remainder 10/2 5 - c, 0 - r
		// % = remainder / = cof

		if (n % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

		String month = "Jan";

		switch (month) {
		case "Jan":
			System.out.println("January");
			break;
		case "Feb":
			System.out.println("February");
			break;
		default:
			System.out.println("Please enter correct month");
			break;
		}

	}

}
