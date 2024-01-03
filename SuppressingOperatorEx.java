package rxjavaOperators;

import io.reactivex.rxjava3.core.Observable;

public class SuppressingOperatorEx {

	public static void main(String[] args) {
		Observable<Integer> obs1=Observable.just(1, 2, 3, 4, 5, 6,5,6,4);
		
		//filter
		obs1.filter(value -> value % 2 == 0)
        .subscribe(filteredValue -> System.out.println("Filtered: " + filteredValue));
		System.out.println();
		//take
		obs1.take(4)
        .subscribe(filteredValue -> System.out.println("Filtered: " + filteredValue));
		
		System.out.println();
		//skip
				obs1.skip(4)
		        .subscribe(filteredValue -> System.out.println("Filtered: " + filteredValue));
				
		System.out.println();
				obs1.distinct()
                .subscribe(uniqueValue -> System.out.println("Distinct: " + uniqueValue));
				System.out.println();
				obs1.elementAt(4)
                .subscribe(ele-> System.out.println("At Index 4: "+ele));

	}

}
