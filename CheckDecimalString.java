package com.java8.practicejava.interview;

import java.util.Scanner;

public class CheckDecimalString {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Close the scanner
	        scanner.close();

	        if (isDecimalString(input)) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	}

	private static boolean isDecimalString(String input) {

			  try {
		            // Parse the input string as a double
		            double value = Double.parseDouble(input);

		            // Check if the decimal part is zero (i.e., no trailing zeros)
		            // If there is a decimal part, it should be .0 for "YES"
		            // If there is no decimal part, it's "YES"
		            String stringValue = Double.toString(value);
		            if (stringValue.contains(".")) {
		                return stringValue.endsWith(".0");
		            } else {
		                return true;
		            }
		        } catch (NumberFormatException e) {
		            // Parsing as a double failed, so it's not a valid decimal
		            return false;
		        }
		    
		}

}
