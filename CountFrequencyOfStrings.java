package com.java8.practicejava.implementation.threads;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFrequencyOfStrings {
	public static void main(String args[]) {
		String sentence = "This is Array Of Words of Array";
		String[]arrayOfWords = sentence.split("\\s+");
		Stream<String>arrayOfStream = Arrays.stream(arrayOfWords);
		Map<String,Long>stringFrequency = (arrayOfStream).map(s->(String)s)
				                             .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("String frequency::"+stringFrequency);
		
	/*	String highestRepeatedString = stringFrequency.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse("");*/
		String highestRepeatedString = stringFrequency.entrySet().stream()
				                     .max(Map.Entry.comparingByValue())
				                     .map(Map.Entry::getKey)
				                     .orElse("");
		System.out.println("Highest repeated String::"+highestRepeatedString);
		
	}

}
