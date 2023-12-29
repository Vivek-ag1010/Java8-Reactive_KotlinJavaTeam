package streams;
import java.util.*;
import java.util.stream.Collectors;
public class AllOpEx1 {

	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("apple", "banana","orange","kiwi","mango","grapes","apple");
		
		//Intermediate Operations
		List<String> list1=fruits.stream().filter(s->s.length()>4).map(String::toUpperCase).sorted().distinct().peek(System.out::println).limit(3).collect(Collectors.toList());
		
		System.out.println(list1);
		long countFruit= fruits.stream().filter(s->s.length()>4).count();
		System.out.println(countFruit);
		
		//Sum of length of all the stringusing mapToInt
		int sumLength=fruits.stream().mapToInt(String::length).sum();
		System.out.println("Sum of lengths: "+sumLength);
		
		//Sum of Length of all the String using reduceS
		int sumLen=fruits.stream().map(String::length).reduce(0, Integer::sum);
		System.out.println("Sum using reduce: "+sumLen);
		
		//Average from a List
		List<Double> marks=List.of(10.0,25.5,34.6,65.8,43.7);
		double average=(marks.stream().reduce(0.0, Double::sum))/marks.size();
		System.out.println("Average Marks: "+average);
		
		System.out.println("MAximum Marks:"+marks.stream().max(Comparator.naturalOrder()));
		System.out.println("Minimum Marks:"+marks.stream().min(Comparator.naturalOrder()));
	}

}
