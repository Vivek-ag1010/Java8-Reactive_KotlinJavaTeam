package streams;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		List<List<String>> nestedLists=Arrays.asList(Arrays.asList("apple","banana"), Arrays.asList("Vivek","Agrahari"), Arrays.asList("Jai Shri", "Ram"));
		Stream<String> flatmapStream= nestedLists.stream().flatMap(List::stream);
	    flatmapStream.forEach(System.out::println);
	}

}
