package com.java8.practicejava.implementation.threads;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
   public static void main(String args[]) {
	   List<String>strings = Arrays.asList("apple","banana","pear","orange");
	   strings.sort((s1,s2)->Integer.compare(s1.length(), s2.length()));
	   System.out.println("Sorting Strings::"+strings);
	   
   }
}
