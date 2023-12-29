package streams;
import java.util.*;
import java.util.stream.Stream;
public class FilterEx {

	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("HappY","new","year","hello","hii");
		Stream<Integer> lengthStream=fruits.stream().map(String::length);
		lengthStream.forEach(System.out::println);
				
		
	}

}
