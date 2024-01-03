package reactiveStreams;
import java.util.*;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMap;
import reactor.core.publisher.Mono;

public class MonoOperation {

	public static void main(String[] args) {
		
		// Creation using just
		Mono<Integer> mono=Mono.just(10);
		//map operations
		mono.map(a->a*a).subscribe(System.out::println);
		
		// flatmap operation
		Mono<String> mono1=Mono.just("Ram");
		mono1.flatMap(value->Mono.just(value+" Ram")).subscribe(concat->System.out.println(concat));
		
		// Filter 
		mono.filter(a->a%2==0).subscribe(System.out::println);
		mono.filter(a->a<10).subscribe(System.out::println);
		
		//Empty
		Mono<String> empty=Mono.empty();
		empty.defaultIfEmpty(null).subscribe(System.out::println);
		empty.defaultIfEmpty("2024").subscribe(System.out::println);
		mono.defaultIfEmpty(null).subscribe(System.out::println);
		
		//switchIfEmpty
		empty.switchIfEmpty(mono1).subscribe(System.out::println);
		
		//onErrorResume method
		
		Mono<Integer> mono2=Mono.error(new RuntimeException("Error Occured"));
		mono2.onErrorResume(error->{System.err.println("Caught an Error: "+error.getMessage()); return Mono.just(10);}).subscribe(System.out::println);
		
		//Sum of two numbers
		Mono<Integer> mono3=Mono.just(5+20);
		mono3.subscribe(System.out::println);
		
		//zip operstion
		Mono<Integer> m1=Mono.just(10);
		Mono<String> m2=Mono.just("Happy");
		Mono<String> zipped=Mono.zip(m1,  m2, (a,b)->(a+b));
		
		zipped.subscribe(System.out::println);

	}

}
