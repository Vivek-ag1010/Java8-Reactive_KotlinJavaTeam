package com.lambda.section2;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;
public class ImperativeVsDeclarativeEx1{

	public static void main(String[] args) {
		//Finding Square of each number in a list and return a new list having square
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		//Imperative Approach(Java 7 and earlier)
		
		List<Integer> squareNum=new ArrayList<>();
		for(int num:numbers)
			squareNum.add(num*num);
		System.out.println("Imperative Approach :"+squareNum);
		
		//Decalarative Approach (after java 8)
		List<Integer> sqNum=numbers.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("Declrative Approach :"+sqNum);

	}

}
