package reactiveStreams;
import java.util.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxWithCollections {

	public static void main(String[] args) {
		Flux<String> f1=Flux.just("Vivek", "Good" ,"Morning");
		
		//collectList()
		f1.collectList().subscribe(a->System.out.println("List: "+a));
		
		//collectmap()
	f1.collectMap(String::length).subscribe(a->System.out.println("Map: "+a));	
	
	//toList()
	Mono<List<String>> list1=f1.collectList();
	list1.subscribe(System.out::println);
//toMap()
	Mono<Map<Integer, String>> map1=f1.collectMap(String::length);
	map1.subscribe(System.out::println);
	
	Flux<Integer> flux1 = Flux.just(1, 2, 3);
	Flux<Integer> flux2 = Flux.just(4, 5, 6);
	Flux<Integer> flux3=flux1.concatWith(flux2);
	flux3.subscribe(value -> {
	    System.out.println("Concatenated Value: " + value);
	});

	}

}
