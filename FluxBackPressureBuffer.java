package reactiveStreams;

import reactor.core.publisher.Flux;

public class FluxBackPressureBuffer {
    public static void main(String[] args) {
        Flux<Integer> fastProducer = Flux.create(fluxSink -> {
            for (int i = 1; i <= 10; i++) {
                fluxSink.next(i);
            }
            fluxSink.complete();
        });

        Flux<Integer> bufferedFlux = fastProducer
                .onBackpressureBuffer(5); // Buffer size is 5

        bufferedFlux.subscribe(
                value -> {
                    try {
                        // Simulate slow consumer
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(value);
                },
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Done")
        );
    }
}

