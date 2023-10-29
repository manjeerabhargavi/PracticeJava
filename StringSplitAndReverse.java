package com.java8.practicejava.implementation.threads;

import java.util.Scanner;

public class StringSplitAndReverse {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Input the Orignial String::");
	  String input = sc.nextLine();
	  
	  if(input.length()%2 == 0) {
		  int mid = input.length()/2;
		  String firstPart = input.substring(0,mid);
		  String secondPart = input.substring(mid);
		  String reversedFirstPart = reverseString(firstPart);
		  String reversedSecondPart = reverseString(secondPart);
          System.out.println("Reversed Parts: " + reversedFirstPart + " " + reversedSecondPart);
      }
	  else {
		  	int mid = input.length()/2;
		  	String firstPart = input.substring(0,mid);
		  	String secondPart = input.substring(mid+1);
			String reversedFirstPart = reverseString(firstPart);
            String reversedSecondPart = reverseString(secondPart);
            System.out.println("Reversed Parts: " + reversedFirstPart + " " + reversedSecondPart);
	  }
	  sc.close();
  }

private static String reverseString(String str) {
	StringBuilder reversed = new StringBuilder();
	for(int i=str.length()-1;i>=0;i--) {
		reversed.append(str.charAt(i));
	}
	return reversed.toString();
 }
}
