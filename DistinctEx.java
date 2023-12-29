package streams;
import java.util.*;
import java.util.stream.Stream;
public class DistinctEx {

	public static void main(String[] args) {
		List<Integer> fruits=Arrays.asList(100, 10,1, 2, 0, 3, 4, 2, 1, 2);
		Stream<Integer> lengthStream=fruits.stream().distinct();
		lengthStream.forEach(System.out::println);
			
		
	}

}
