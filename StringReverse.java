package com.java8.practicejava.implementation;

public class StringReverse {
	public static void main(String args[]) {
		String original = "Hello World!!1";
		reverseString(original);
	}
    public static void reverseString(String input) {
    	for(int i=input.length()-1;i>=0;i--) {
    		System.out.print(input.charAt(i));
    	}
    }
}
