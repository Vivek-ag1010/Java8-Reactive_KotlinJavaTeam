package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapEx {

	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("HappY","new","year","hello","hii");
		Stream<String> filteredStream=fruits.stream().filter(s->s.startsWith("h"));
		filteredStream.forEach(System.out::println);	
	}

}
