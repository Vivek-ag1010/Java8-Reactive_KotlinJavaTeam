package reactiveStreams;

import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

public class MonoCombineExample {

    public static void main(String[] args) {
        Mono<String> mono1 = Mono.just("Hello");
        Mono<String> mono2 = Mono.just("World");

        Mono<Tuple2<String, String>> combinedMono = Mono.zip(mono1, mono2);

        combinedMono.subscribe(tuple -> {
            String result1 = tuple.getT1();
            String result2 = tuple.getT2();
            System.out.println("Combined Result: " + result1 + " " + result2);
        });
    }
}

