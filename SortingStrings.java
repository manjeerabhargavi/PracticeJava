package com.java8.practicejava.implementation.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStrings {
  public static void main(String args[]) {
   List<String>strings = new ArrayList<>();
   strings.add("apple");
   strings.add("banana");
   strings.add("cherry");
   strings.add("date");

   List<String> sortedStrings = strings.stream().sorted().collect(Collectors.toList());
   System.out.println("Sorted Strings is ::"+ sortedStrings);
  }
}