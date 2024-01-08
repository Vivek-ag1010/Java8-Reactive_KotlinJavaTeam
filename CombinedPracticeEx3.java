package javaFunctional;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
// 
/*Write a lambda expression to partition a list of strings into two groups: 
	one with strings of even length and one with strings of odd length.*/

public class CombinedPracticeEx3 {

	public static void main(String[] args) {
		List<String> list = List.of("Hello", "Vivek", "Scorpoio", "Ram", "Bottle");
		list.stream().filter(a -> a.length() % 2 == 0).forEach(System.out::println);
		list.stream().filter(a -> a.length() % 2 != 0).forEach(System.out::println);

		// Use the collect method to create a map of strings and their lengths.

		List<String> list1 = List.of("India", "Lucknow", "Delhi", "Jaipur", "Kanpuriya");
		Map<String, Integer> lenMap = list1.stream().collect(Collectors.toMap(s -> s, String::length));
		System.out.println(lenMap);

//Implement a Function that converts a string to uppercase.
		String s1 = "HinDUstaan";
		Function<String, String> upCase = str1 -> str1.toUpperCase();
		System.out.println(upCase.apply(s1));

	
		
	}

}
