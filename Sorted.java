package streams;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;
public class Sorted {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(100, 200, 100, 300, 0 ,20, 100, 3000);
		Stream<Integer> sortStream=l.stream().sorted();
		Stream<Integer> customSort=l.stream().sorted((a,b)->b-a);
		System.out.println("Natural Order Sorting: ");
		sortStream.forEach(System.out::println);
		System.out.println("Custom Order Sorting: ");
		customSort.forEach(System.out::println);
		
;	}

}
