package com.java8.practicejava.codility;

import java.util.stream.Stream;

public class LongestSequenceOfZero {
	public static void main(String args[]) {
		int num = 177; //Replace with your Integer
		
		int longestSubSequence = getLongestSubSequence(num);
		System.out.println("Finding the longest Subsequence::"+longestSubSequence);
		
	}

	private static int getLongestSubSequence(int num) {
		String binaryString = Integer.toBinaryString(num);
		String[]zeroSequence = binaryString.split("1");
		int longestSequence = Stream.of(zeroSequence)
				                    .mapToInt(String::length)
				                    .max()
				                    .orElse(0);
		return longestSequence;
	}

}
