package com.java8.practicejava.implementation.threads;

import java.util.stream.IntStream;

public class SumOfAllPrimeNumbers {
   public static void main(String args[]) {
	   int limit=100;
	   int sum = IntStream.range(2,limit)
			      .filter(n->IntStream.rangeClosed(2,(int)Math.sqrt(n)).allMatch(i->n%i !=0))
			      .sum();
	   System.out.println("Sum Of Prime Numbers upto the limit::"+limit+":"+sum);
			      
                       			      
   }
}
