package observableObserver;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class PracticeEx1 {

	public static void main(String[] args) 
	{
		
		/*Given a list of integers, create an Observable and perform the following operations:
		Square each integer.
		Filter out the even squares.
		Print the result.*/
		
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
		Observable<Integer> o1=Observable.fromIterable(list);
		o1.map(a->a*a).filter(a->a%2==0).subscribe(System.out::println);
		/*
		 * Question 2: Combining and Sorting Given two lists of names, create two
		 * Observables and perform the following operations: Combine the names from both
		 * lists into pairs. Sort the pairs based on the total length of names. Print
		 * the sorted pairs.
		 */
		
		Observable<String> names1=Observable.just("Vivek", "Chulbul", "Yoyo");
		Observable<String> surName1=Observable.just(" Agrahari", " Pandey", " Gupta");
		
		Observable.zip(names1, surName1, (a, b)->(a+b)).sorted().subscribe(System.out::println);
		
		/*
		 * Question 3: Chaining Operations Given a list of strings, create an Observable
		 * and perform the following operations: Transform each string to its uppercase
		 * form. Filter out strings containing the letter 'a'. Concatenate the resulting
		 * strings into a single string. Print the final string.
		 */
		
		Observable<String> stList=Observable.just("xyz", "abc","amit", "vishal", "abhishek", "shiv","harry", "naam");
		 stList.map(s -> s.toUpperCase())
         .filter(con -> con.contains("A")) // Note: changed to uppercase 'A' to match the filter
         .reduce((a, b) -> a + b)
         .subscribe(
                 finalStr -> System.out.println("Final String: " + finalStr),
                 Throwable::printStackTrace,
                 () -> System.out.println("Operation completed.")
         );
		
	}

}
