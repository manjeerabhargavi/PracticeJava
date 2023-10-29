package com.java8.practicejava.implementation.threads;

import java.util.Arrays;

public class SecondLargestWord {
	public static void main(String args[]) {
		 String sentence = "Java 8 streams provide powerful features for developers";
		 String secondLargest = Arrays.stream(sentence.split("\\s+"))
				                  .distinct()
				                  .sorted((word1,word2)->Integer.compare(word2.length(), word1.length()))
				                  .skip(1)
				                  .findFirst()
				                  .orElse("");
		 System.out.println("The Second Largest Word is::"+secondLargest);
				 
	}

}
