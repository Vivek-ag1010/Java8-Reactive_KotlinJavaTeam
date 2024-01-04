
package reactiveStreams;

import java.util.List;

import reactor.core.publisher.Flux;

public class FluxFlatMapEx1 {

	public static void main(String[] args) {
		/*
		 * 1 Problem:You have a Flux of lists, and you need to transform each list into
		 * its individual elements. Implement a reactive pipeline to achieve this using
		 * flatMap.
		 * 
		 * Tasks: Create a Flux<List<Integer>> containing lists of integers. Use flatMap
		 * to transform each list into a Flux<Integer> of its elements. Print the
		 * individual elements.
		 */
		Flux<List<Integer>> listFlux1 = Flux.just(List.of(1, 2, 3), List.of(3, 5, 6), List.of(2, 6, 9));
		listFlux1.subscribe(s -> System.out.println(s)); // Separate lists

		Flux<Integer> flatMapflux = listFlux1.flatMap(s -> Flux.fromIterable(s));
		flatMapflux.subscribe(System.out::println);

		/*
		 * Question 2:Problem: You have a Flux of strings, and for each string, you need
		 * to find and print the distinct characters. Implement this using flatMap.
		 * Tasks:Create a Flux<String> containing strings. Use flatMap to transform each
		 * string into a Flux<Character> of its distinct characters. Print the distinct
		 * characters for each string.
		 */

		Flux<String> sflux = Flux.just("Vivek", "Abhishek", "Chulbul", "Pandey");
		sflux.flatMap(s->Flux.fromArray(s.split(""))).distinct().collectList().subscribe(System.out::println);
		
		/*
		 * Question 3:Problem: You have a Flux of lists of words, and you need to
		 * transform each list into its individual words. Implement a reactive pipeline
		 * to achieve this using flatMap. Tasks:Create a Flux<List<String>> containing
		 * lists of words. Use flatMap to transform each list into a Flux<String> of its
		 * individual words. Print the individual words.
		 */
		
		Flux<List<String>> flux1=Flux.just(List.of("Chulbul", "Pandey", "Vivek"), List.of("Shivangi", "Sakshi", "Kush"), List.of("Ram"));
		flux1.flatMap(s->Flux.fromIterable(s)).subscribe(System.out::println);
		
		flux1.flatMap(s->Flux.fromIterable(s)).map(String::length).subscribe(System.out::println);
		
		
		/*
		 * Question 4:Problem: You have a Flux of sentences, and for each sentence, you
		 * need to split it into words and find the length of each word. Implement this
		 * using flatMap. Tasks:Create a Flux<String> containing sentences. Use flatMap
		 * to split each sentence into a Flux<String> of its words. Use another flatMap
		 * to find the length of each word. Print the length of each word.
		 */
		System.out.println("Sentence ki word ke length");
		Flux<String> fluxSen=Flux.just("Happy New year", "How are you?","Honesty is the best policy", "Jaipur is Pink City", "Hum Raebareli se hai");
		Flux<String> fluxWord = fluxSen.flatMap(s->Flux.fromArray(s.split(" ")));
		fluxWord.subscribe(System.out::println);
		fluxWord.map(x->x.length()).subscribe(System.out::println);
	}

}
