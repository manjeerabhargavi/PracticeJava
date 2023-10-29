package com.java8.practicejava.implementation.threads;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseEachWordOfSentence {
  public static void main(String args[]) {
	  String sentence = "Java Streams Provide Powerful Feature for Developers";
	  String reversed1 = Arrays.stream(sentence.split("\\s+"))
			                  .map(word->new StringBuilder(word).reverse().toString())
			                  .collect(Collectors.joining(","));
	  System.out.println("Reversed Strings::"+reversed1);
	  
	  String reversed2 = Arrays.stream(sentence.split("\\s+"))
			                    .map(word->new StringBuilder(word).reverse().toString())
                                .collect(Collectors.joining(","));
			                    
                                System.out.println("Reversed Strings::"+reversed2);
                                
                                
                        
                             
  }
}
