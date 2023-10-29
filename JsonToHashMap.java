package com.java8.practicejava.interview;

import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToHashMap {
	
	public static void main(String args[]) {
		String json = "{\"key1\":\"value1\",\"key2\":\"value2\",\"key3\":\"value3\"}";
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			@SuppressWarnings("unchecked")
			HashMap<String,String>hashMap = objectMapper.readValue(json, HashMap.class);
			System.out.println("Hash Map::"+hashMap);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
