package com.java8.practicejava.implementation.threads;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementCustomCollector {
	public static void main(String args[]) {
		List<String>words = Arrays.asList("Hello","Java","8","Streams");
		String result = words.stream().collect(Collectors.collectingAndThen(Collectors.joining(","), str->"["+str+"]"));
		System.out.println("Strings After implementing the Custom Collector::"+result);
	}

}
