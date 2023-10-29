	package com.java8.practicejava.implementation.threads;

import java.util.Arrays;
import java.util.List;

public class FindAverageOfThreeFactors {
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(10, 15, 21, 30, 42);
		double average = numbers.stream()
				         .filter(n->n%3==0)
				         .mapToInt(Integer::intValue)
				         .average()
				         .orElse(0.0);
		System.out.println("Average::"+average);
	}

}
