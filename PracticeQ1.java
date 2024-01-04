

package reactiveStreams;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PracticeQ1 {

	public static void main(String[] args) {
		
		//Create a Flux that emits integers from 1 to 10, transform each element to its square, and print only the even squares.
		Flux<Integer> flux1 = Flux.range(1, 10);
		flux1.map(a -> a * a).filter(x -> x % 2 == 0).subscribe(res -> System.out.println("Even Squared: " + res));
		
		//Create a Mono that may throw an exception during processing. Handle the exception and print a default value.
		Mono<Integer> monoWithError = Mono.just(7)
			    .map(s -> {
			        if (s/0!=0) {
			            throw new RuntimeException("String length exceeds 5");
			        }
			        return s;
			    })
			    .onErrorResume(error -> Mono.just(15));

			monoWithError.subscribe(result -> {
			    System.out.println("Result: " + result);
			});
			
			//Create a fast-producing Flux and handle backpressure using buffering. Print the buffered values.
			Flux<Integer> fastProducer = Flux.create(fluxSink -> {
			    for (int i = 1; i <= 1000; i++) {
			        fluxSink.next(i);
			    }
			    fluxSink.complete();
			});

			Flux<Integer> bufferedFlux = fastProducer
			    .onBackpressureBuffer(5);

			bufferedFlux.subscribe(value -> {
			    System.out.println("Buffered Value: " + value);
			});
			
			//Create two Mono instances and concatenate them. Print the concatenated value.

			Mono<String> mono1 = Mono.just("Hello");
			Mono<String> mono2 = Mono.just(" World");

			Mono<String> concatenatedMono = Mono.zip(mono1, mono2,(a,b)->a+b);

			concatenatedMono.subscribe(value -> {
			    System.out.println("Concatenated Value: " + value);
			});


		

	}

}
