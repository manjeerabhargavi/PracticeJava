package com.java8.practicejava.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static List<List<String>> groupAnagrams(String[] strs){
		if(strs==null || strs.length==0) {
			return new ArrayList<>();
		}
		Map<String,List<String>>anagramGroups = new HashMap<>();
		
		for(String str:strs) {
			//Convert the character into character array
			char[]charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedString = new String(charArray);
			
			//If the sorted String is in the map
			anagramGroups.computeIfAbsent(sortedString, key->new ArrayList<>()).add(str);
		}
		return new ArrayList<>(anagramGroups.values());
	}
	 public static void main(String[] args) {
	        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        List<List<String>> result = groupAnagrams(input);

	        for (List<String> group : result) {
	            System.out.println(group);
	        }
	    }
}
