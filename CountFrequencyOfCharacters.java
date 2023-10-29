package com.java8.practicejava.implementation.threads;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacters {
 public static void main(String args[]) {
	 String input = "HelloJavaEight";
	 Map<Character, Long>charFrequency = input.chars().mapToObj(c->(char)c)
			                                          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	 System.out.println("Char frequency in a string::"+charFrequency);
	 
			 
			                              
 }
}
