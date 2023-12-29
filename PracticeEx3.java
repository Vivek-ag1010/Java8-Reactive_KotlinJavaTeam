package streams;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=List.of(2,3,4,5,8,12,7);
List<Integer> ans=list.stream().filter(s->s%2==0).collect(Collectors.toList());
System.out.println(ans);
Stream<Integer> filter1 = list.stream().filter(s->s%2==0);
filter1.forEach(System.out::println);


	}

}
