package com.java8.practicejava.implementation;

public class PallindromeCheckJava8 {
   public static void main(String args[]) {
	   String testString  = "A man, a Plan, a Canal, Panama!";
	   System.out.println("isPallindrome::"+isPallindrome(testString));
   }

private static String isPallindrome(String testString) {
	String clean = testString.replaceAll(testString, testString);
	return null;
}
}
