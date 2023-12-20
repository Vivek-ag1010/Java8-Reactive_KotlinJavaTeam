package com.lambda.section2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ImpVsDecEx2 {
public static void main(String[]args)
{
	int [] numbers= {1,2,3,4,5};
	//Sum of squares of array numbers
	//using Imperative 
	int sumSq=0;
	for(int n:numbers)
		sumSq+=n*n;
	System.out.println("Sum of Squares: "+sumSq);
	
	int sqSum=Arrays.stream(numbers).map(x->x*x).sum();
	System.out.println(sqSum);
}
}
