package com.java8.practicejava.implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapExample {
	public static void main(String args[]) {
		Map<String,Integer>originalMap = new HashMap<>();
		originalMap.put("one", 1);
		originalMap.put("two", 2);
		originalMap.put("three", 3);
		
		Map<String,Integer>immutableMap = Collections.unmodifiableMap(originalMap);
		// Attempting to modify the immutable map will result in an UnsupportedOperationException
    //    immutableMap.put("four", 4); // This will throw an exception
        System.out.println(immutableMap.get("one"));       
	}

}
