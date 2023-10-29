package com.java8.practicejava.implementation.threads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
	public static void main(String args[]) {
		List<Integer>numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer>oddNumbers = numbers.stream().filter(n->n%2!=0)
				                         .collect(Collectors.toList());
		System.out.println("Odd Numbers::"+oddNumbers);
	}

}
