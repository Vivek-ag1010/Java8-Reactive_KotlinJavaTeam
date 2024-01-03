package rxjavaOperators;

import java.util.*;
import io.reactivex.rxjava3.core.Observable;

public class ColletionOperatorEx {

	public static void main(String[] args) {
		Observable<Integer> obs1 = Observable.just(10, 6, 1, 4, 5, 6, 9, 0, 56, 9);
		// toList()
		obs1.map(a -> a * a).toList().subscribe(a -> System.out.println("Square: " + a));

		obs1.map(a -> a * 10).toSortedList().subscribe(a -> System.out.println("Sorted List: " + a));

		Observable<String> obs2 = Observable.just("ABC", "def", "ghi", "jkl");

		// sortedList
		obs2.map(a -> a.length()).toSortedList().subscribe(a -> System.out.println("Sorted List: " + a));

		Observable<String> obs3 = Observable.just("one", "two", "three");

        //map
		obs3.toMap(String::length).subscribe(lenString -> System.out.println("map: "+lenString));

		// collect use
		List<Object> list = obs1
				.collect(() -> new ArrayList<>(), (listAccumulator, value) -> listAccumulator.add(value))
				.blockingGet(); // blockingGet() used for simplicity; avoid in real applications

		System.out.println("List: " + list);
		
		Set<Object> set = obs1
				.collect(() -> new HashSet<>(), (listAccumulator, value) -> listAccumulator.add(value))
				.blockingGet(); // blockingGet() used for simplicity; avoid in real applications

		System.out.println("Set: "+set);
	}

}
